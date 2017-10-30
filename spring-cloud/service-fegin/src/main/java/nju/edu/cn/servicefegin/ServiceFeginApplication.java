package nju.edu.cn.servicefegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients  // 开启Fegin功能
@EnableHystrixDashboard
public class ServiceFeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceFeginApplication.class, args);
	}
}
