package life.seyou.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 全局配置
 * 局部配置不要加 两种配置方式：
 * 修改 接口文件注解 @FeignClient(name = "stock-service",path = "/stock",configuration = FeignConfig.class)
 * 添加 application.yml配置  feign.client.config.stock-service.logger-level: BASIC
 * feign:
 *   client:
 *     config:
 *       stock-service:
 *         logger-level: BASIC
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
