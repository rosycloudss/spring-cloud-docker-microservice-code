package com.lw.microservicesimpleconsumermovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient         // 声明是一个 Eureka Client  可以使用 @EnableEurekaClient 代替
public class MicroserviceSimpleConsumerMovieApplication {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleConsumerMovieApplication.class, args);
    }


}
