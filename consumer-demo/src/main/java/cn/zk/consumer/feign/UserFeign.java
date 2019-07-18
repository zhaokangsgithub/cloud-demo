package cn.zk.consumer.feign;

import cn.zk.consumer.config.FeignConfig;
import cn.zk.consumer.hysix.UserBack;
import cn.zk.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service", fallback = UserBack.class,
    configuration = FeignConfig.class)
public interface UserFeign
{
    @GetMapping("/userService/{id}")
    User queryUserById(@PathVariable("id") Long id);
}
