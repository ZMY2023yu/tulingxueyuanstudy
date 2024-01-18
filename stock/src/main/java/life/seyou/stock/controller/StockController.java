package life.seyou.stock.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/stock")
public class StockController {
    @RequestMapping("/reduct")
    public String reduct(){
        System.out.println("扣减库存");
        return "扣减库存";
    }

}
