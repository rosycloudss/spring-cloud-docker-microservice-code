package com.lw.microservicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 声明是一个 Eureka Server
public class MicroserviceDiscoveryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDiscoveryEurekaApplication.class,args);
    }

}
