package cn.zk.consumer.controller;

import cn.zk.consumer.feign.UserFeign;
import cn.zk.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user/")
public class UserController
{

    @Autowired
    private DiscoveryClient discoveryClient;


    @Autowired
    private UserFeign userFeign;

    @RequestMapping("fromFeign")
    @ResponseBody
    public User queryUserByFeign(Long id){

        User user = userFeign.queryUserById(id);
        System.out.println(user);
        return user;
    }
}
