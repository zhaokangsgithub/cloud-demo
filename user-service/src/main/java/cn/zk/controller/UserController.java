package cn.zk.controller;

import cn.zk.pojo.User;
import cn.zk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:  <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date:   <br/>
 *
 * @author
 * @since JDK 1.6
 */
@Controller
@RequestMapping("/userController/")
public class UserController
{

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    @ResponseBody
    public User getUserById(@PathVariable("id")Long id)
    {
       User resp= userService.getUserById(id);

       return resp;
    }


}
