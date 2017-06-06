package com.tedu.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.tedu.pojo.Story;
import com.tedu.pojo.User;
import com.tedu.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/6/4.
 */
@Controller
public class StoryController {

    @Autowired
    private StoryService storyService;

    @RequestMapping("/story")
    private String toStory(Model model){
        List<Story> storyList = storyService.findAll();
        model.addAttribute("storyList",storyList);
        return "/index/story";
    }

    @RequestMapping("/storyInfo")
    private String toStoryInfo(String storyId,Model model){
        Story story = storyService.findStoryByStoryId(storyId);
        model.addAttribute("story",story);
        return "/index/storyInfo";
    }

    //跳转到个人故事界面
    @RequestMapping("/storyMessage")
    public String storyMessage(String userId,Model model,HttpSession session){
        User user=(User)session.getAttribute("session_user");//获取session域中用户信息
        List<Story> storyList = storyService.findStoryByUserId(user.getUserId());
        model.addAttribute("storyList",storyList);
        return "center/story";
    }

}
