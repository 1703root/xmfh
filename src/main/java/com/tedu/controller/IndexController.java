package com.tedu.controller;

import com.tedu.pojo.House;
import com.tedu.pojo.Story;
import com.tedu.pojo.User;
import com.tedu.service.HouseService;
import com.tedu.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/3.
 */
@Controller
public class IndexController {


    @Autowired
    private HouseService houseService;

    @Autowired
    private StoryService storyService;

    //跳转到首页
    @RequestMapping("/home")
    public String index(Model model){
        List<House> list = houseService.findAll();
        List<House> houseList = new ArrayList<House>();
        for (int i = 0; i < 6; i++) {
            houseList.add(list.get(i));
        }
        List<Story> list1 = storyService.findAll();
        List<Story> storyList = new ArrayList<Story>();
        for (int i = 0; i < 3; i++) {
            storyList.add(list1.get(i));
        }

        model.addAttribute("storyList",storyList);
        model.addAttribute("houseList",houseList);
        return "index/index";
    }

    //跳转到登录界面
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login/login";
    }
    //跳转到登录界面
    @RequestMapping("/toRegist")
    public String toRegist(){
        return "login/regist";
    }
    //跳转到个人中心
    @RequestMapping("/center")
    public String conter(Model model, HttpSession session){
        User user=(User)session.getAttribute("session_user");//获取session域中用户信息
        //判断用户是否登录
        if(user==null){//未登录
            model.addAttribute("errorInfo", "请先登录");
            return "/login/login";
        }
        //以登陆
        model.addAttribute("user",user);
        return "/center/center";
    }

}
