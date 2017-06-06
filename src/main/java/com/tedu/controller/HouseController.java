package com.tedu.controller;

import com.tedu.pojo.House;
import com.tedu.pojo.User;
import com.tedu.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/6/3.
 */

@Controller
public class HouseController {

    @Autowired
    private HouseService houseService;

    //查找全部房源信息
    @RequestMapping("/houseAll")
    private String findAll(Model model){
        List<House> houseList = houseService.findAll();
        model.addAttribute("houseList",houseList);
        for (House house: houseList ) {
            System.out.println(house);
        }

        return "/index/allHouse";
    }

    //用地址搜索房源信息
    @RequestMapping("/search")
    private String findListByAdd(Model model,String address){
        List<House> houseList = houseService.findListByAdd(address);
        model.addAttribute("houseList",houseList);

        for (House house: houseList ) {
            System.out.println(house);
        }
        return "/index/allHouse";
    }

    @RequestMapping("/toSave")
    private String toSave(){
        return "save.jsp";
    }

    @RequestMapping("/saveHouse")
    private String saveHouse(House house, HttpSession session){
        User user=(User)session.getAttribute("session_user");//获取session域中用户信息
        house.setUserId(user.getUserId());
        houseService.saveHouse(house);
        return "redirect:/houseMessage.action";
    }

    @RequestMapping("/toUpdate")
    private String toUpdate(){
        return "update.jsp";
    }

    @RequestMapping("/updateHouse")
    private String updateHouse(House house){
        houseService.updateHouse(house);
        return "update.jsp";
    }

    //用houseid查找单个房屋信息
    @RequestMapping("/view")
    private String view(String houseId,Model model){
        House house = houseService.findOne(houseId);
        model.addAttribute("house",house);
        return "houseView/houseView";
    }


    //用userid查看房屋列表
    @Controller
    public class CenterController {

        @RequestMapping("/houseMessage")
        private String toHouse(Model model,HttpSession session){
            User user=(User)session.getAttribute("session_user");//获取session域中用户信息
            String userId = user.getUserId();
            List<House> houseList = houseService.findListByUserId(userId);
            model.addAttribute("houseList",houseList);
            model.addAttribute("userId",userId);
            return "center/houseMessage";
        }
    }
    @RequestMapping("/addHouse")
    private String toAddHouse(){
        return "center/addHouse";
    }

    @RequestMapping("/messageCenter")
    public String messageCenter(){
        return "center/messageCenter";
    }

}
