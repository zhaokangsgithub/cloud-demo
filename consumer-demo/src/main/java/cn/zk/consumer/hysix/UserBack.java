package cn.zk.consumer.hysix;

import cn.zk.consumer.feign.UserFeign;
import cn.zk.consumer.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserBack implements UserFeign
{
    @Override
    public User queryUserById(Long id)
    {
        User user = new User();
        user.setUsernName("获取数据异常，服务降级");
        return user;
    }
}
