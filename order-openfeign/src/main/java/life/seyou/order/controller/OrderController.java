package life.seyou.order.controller;

import life.seyou.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    StockFeignService stockFeignService;

  /**
 * OrderController.java
 * 这是一个用于处理订单的控制器类。
 */

@RequestMapping("/add")
public String add(){
    String msg = stockFeignService.reduct();
    System.out.println("下单成功");
    return "Hello Feign"+msg;
}


}
