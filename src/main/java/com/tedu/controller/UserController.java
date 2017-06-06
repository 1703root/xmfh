package com.tedu.controller;

import com.tedu.pojo.User;
import com.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/6/3.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userInfo")
    public String userInfo(String userId,Model model){
        //根据用户id查询用户信息
        User user=userService.findUserByUserId(userId);

        model.addAttribute("user",user);
        return "/center/userInfo";
    }
    @RequestMapping("/saveUser")
    public String saveUser(User user,HttpSession session){
        //保存用户信息
        userService.saveUser(user);

        //跟新session域中User对象信息
        session.setAttribute("session_user",user);
        return "redirect:/center.action";
    }
}
