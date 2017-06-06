package com.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.tedu.pojo.User;
import com.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
@Controller
public class RegistController {

    @Autowired
    private UserService userService;

    @RequestMapping("/regist")
    public String Regist(String username,String password,String password2,Model model){
        //判断用户名.密码,验证密码是否为空
        if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)||StringUtils.isEmpty(password2)){//为空
            model.addAttribute("errorInfo","用户名,密码或验证密码不能为空");
            return "/login/login";
        }

        //不为空
        //判断密码与验证密码是否一致
        if(!password.equals(password2)){//不一致
            model.addAttribute("errorInfo","用户名和密码不一致");
            return "/login/login";
        }

        //用户名和密码符合规范,保存数据
        userService.saveUserByUsernameAndPassword(username,password);
        model.addAttribute("errorInfo","注册成功");
      return  "/login/login";
    }

    @RequestMapping("/login")
    public String login(String username,String password,Model model,HttpSession httpSession){

        //验证用户名和密码是否为空
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            model.addAttribute("errorInfo", "用户名或密码不能为空");
            return "/login/login";
        }
        //通过用户名和密码查询用户信息
        User user =userService.findByUsernameAndPassword(username,password);

        //判断用户是否存在
        if(user==null){
            model.addAttribute("errorInfo", "用户名或密码错误");
            return "/login/login";
        }else {
            //将用户信息保存到session域
            httpSession.setAttribute("session_user", user);
            return "redirect:/home.action";
        }
    }

    @RequestMapping("/logout")
    private String logout(HttpSession httpSession){
        httpSession.removeAttribute("session_user");
        return "redirect:/home.action";
    }

}
