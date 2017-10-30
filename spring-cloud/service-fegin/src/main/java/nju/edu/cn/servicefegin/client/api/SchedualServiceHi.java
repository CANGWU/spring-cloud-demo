package nju.edu.cn.servicefegin.client.api;

import nju.edu.cn.servicefegin.client.fallback.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xuan on 2017/10/27.
 */
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @GetMapping("/hi")
    String sayHiFromCLientOne(@RequestParam(value = "name") String name);
}
