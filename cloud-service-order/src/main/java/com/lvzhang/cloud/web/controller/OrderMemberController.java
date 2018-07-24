package com.lvzhang.cloud.web.controller;

import com.lvzhang.cloud.service.MemberService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderMemberController {
    @Autowired
    MemberService memberService;
    @RequestMapping("/getOrderByUserList")
    public List<String> getOrderByUserList(){
        return  memberService.getOrderByUserList();
    }

}
