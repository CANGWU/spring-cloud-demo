package nju.edu.cn.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuan on 2017/10/27.
 */
@RestController
@RequestMapping("/hi")
public class HiController {

    @Value("${server.port}")
    String port;

    @GetMapping
    public String  home(@RequestParam String name){
        return "Hi " + name + " , I am from port: " + port;
    }


}
