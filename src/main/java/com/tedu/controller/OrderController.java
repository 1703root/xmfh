package com.tedu.controller;

import com.tedu.pojo.Order;
import com.tedu.pojo.User;
import com.tedu.service.OrderService;
import com.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Administrator on 2017/6/4.
 */
@RequestMapping()
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;
    //跳转到个人订单界面
    @RequestMapping("/orderMessage")
    public String findOrderByUserId(HttpSession session, Model model){
        User user=(User)session.getAttribute("session_user");
        Order order = orderService.findOrderByUserId(user.getUserId());
        model.addAttribute("user",user);
        model.addAttribute("order",order);
        return "/center/order";
    }
    //生成订单
    @RequestMapping("/advance")
    public String updateOrderState(String houseId,HttpSession session,Model model){
        System.out.println(houseId);
        //判断用户是预定还是看看
      /*  if(houseId==null){//用户看看

            return "index/allHouse";
        }*/
        //用户预定
        //判断用户是否登录
        //获取session域中的user对象
        User user=(User)session.getAttribute("session_user");

        if(user==null){//用户未登录
            model.addAttribute("errorInfo", "未登录,请先登录");
            return "/login/login";
        }
        //用户以登陆
        //判断用户信息是否完整
        //获取用户具体信息
        String name=user.getUserInfo().getName();
        String phone=user.getUserInfo().getPhone();
        String card=user.getUserInfo().getCard();

        //判断信息是否为空
        if(name==null || phone==null || card==null || name=="" || phone=="" || card==""){//用户信息不完整

            model.addAttribute("errorInfo","用户信息不完整,请完善信息");
            //跳转到信息补全界面
            return "center/userInfo";
        }

        //用户信息完整
        //保存房间id

        model.addAttribute("houseId",houseId);
        //保存生成时间
        model.addAttribute("date",new Date());
        //保存订单编号
        model.addAttribute("orderId", UUID.randomUUID().toString());
        //跳转到生成订单界面
        return "center/orderCreate";
    }

    //保存订单信息
    @RequestMapping("/saveOrder")
    public String saveOrder(String orderId,String houseId,Date date,String userId,String username){
       Order order=new Order();
        order.setCreateTime(date);
        order.setHouseId(houseId);
        order.setOrderId(orderId);
        order.setPaystate(0);
        order.setUserId(userId);

        orderService.saveOrder(order);

        return "redirect:/orderMessage.action";
    }

    @RequestMapping("/deleteOrder")
    public String delete(String orderId){
        orderService.deleteOrder(orderId);
        return "redirect:/orderMessage.action";
    }

    @RequestMapping("/updateOrder")
    public String updateOrderState(String orderId){
        Integer paystate = 1;
        System.out.print(orderId);
        orderService.updateOrderState(orderId,paystate);
        return "redirect:/center.action";
    }

    @RequestMapping("/delete")
    public String delete(){
        return "redirect:/houseAll.action";
    }

}
