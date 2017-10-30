package nju.edu.cn.serviceribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import nju.edu.cn.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuan on 2017/10/27.
 */

@RestController
public class HelloController {


    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }


    public String hiError(String name){
        return "Hi, " + name + ", sorry, error!";
    }

}
