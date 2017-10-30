package nju.edu.cn.servicefegin.controller;

import nju.edu.cn.servicefegin.client.api.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuan on 2017/10/27.
 */

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String sayHI(@RequestParam String name){
        return schedualServiceHi.sayHiFromCLientOne(name);
    }



}
