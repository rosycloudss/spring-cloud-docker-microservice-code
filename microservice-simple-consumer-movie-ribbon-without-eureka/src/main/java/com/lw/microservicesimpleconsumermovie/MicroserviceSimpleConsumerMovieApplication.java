package com.lw.microservicesimpleconsumermovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient         // 声明是一个 Eureka Client  可以使用 @EnableEurekaClient 代替
public class MicroserviceSimpleConsumerMovieApplication {

    @Bean
    @LoadBalanced    // 整合 ribbon 使其具有负载均衡的能力
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleConsumerMovieApplication.class, args);
    }

}
