package life.seyou.feign;

import life.seyou.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//name就是指定rest接口所对应的服务名，path就是rest接口对应StockController指定的@RequestMapping
@FeignClient(name = "stock-service",path = "/stock")
public interface StockFeignService {

    @RequestMapping("/reduct")
    public String reduct();

}
