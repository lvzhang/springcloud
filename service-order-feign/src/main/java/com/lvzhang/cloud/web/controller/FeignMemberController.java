package com.lvzhang.cloud.web.controller;

import com.lvzhang.cloud.service.MemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignMemberController {
    @Autowired
    private MemberFeign memberFeign;

    @RequestMapping("/getFeignOrderByUserList")
    public List<String> getFeignOrderByUserList() {
        return memberFeign.getOrderByUserList();
    }

    @RequestMapping("/getOrderFeign")
    public String getOrderFeign() {
        return "getOrderFeign";
    }
}
