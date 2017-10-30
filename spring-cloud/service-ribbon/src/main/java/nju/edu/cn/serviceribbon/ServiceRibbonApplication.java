package nju.edu.cn.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// 在工程启动类中，通过@EnableDiscoveryClient向服务中注册
// 并且向程序的ioc注入一个bean:restTemplate，通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能

@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class ServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonApplication.class, args);
	}




	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}



}
