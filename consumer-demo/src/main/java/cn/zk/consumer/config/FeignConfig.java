package cn.zk.consumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:  <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date:   <br/>
 *
 * @author
 * @since JDK 1.6
 */
@Configuration
public class FeignConfig
{
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}

