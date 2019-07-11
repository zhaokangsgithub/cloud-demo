package cn.zk.consumer.controller;

import cn.zk.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/user/")
public class UserController
{

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("fromConsumer")
    @ResponseBody
    public User findByConsumer(Long id)
    {
        User user = null;
        user = restTemplate.getForObject("http://localhost:8088/userController/"+id, User.class);
        return user;
    }

}
