package com.lvzhang.cloud.error;

import com.lvzhang.cloud.service.MemberFeign;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MemberFeignService implements MemberFeign {

    public List<String> getOrderByUserList() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("not orderUser list");
        return listUser;
    }
}
