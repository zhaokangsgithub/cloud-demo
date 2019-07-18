package cn.zk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.zk.mapper")
@EnableEurekaClient
public class UserApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(UserApplication.class);
    }
}
