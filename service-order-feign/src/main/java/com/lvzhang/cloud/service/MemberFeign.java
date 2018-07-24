package com.lvzhang.cloud.service;

import com.lvzhang.cloud.error.MemberFeignService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "service-member",fallback = MemberFeignService.class)
public interface MemberFeign {
    @RequestMapping("/getMemberAll")
    public List<String> getOrderByUserList();
}
