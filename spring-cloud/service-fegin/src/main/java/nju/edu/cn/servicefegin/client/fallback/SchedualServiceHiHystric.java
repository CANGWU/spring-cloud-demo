package nju.edu.cn.servicefegin.client.fallback;

import nju.edu.cn.servicefegin.client.api.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by xuan on 2017/10/30.
 */

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromCLientOne(String name) {
        return "sorry, " + name;
    }
}
