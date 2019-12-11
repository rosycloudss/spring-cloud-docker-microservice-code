package com.lw.microservicesimpleconsumermovie.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

import com.lw.config.RibbonConfiguration;

/**
 * @author liwei-4
 * @description:
 * @date 2019-12-10
 * 
 * 使用RibbonClient,为特定name的Ribbon Client 自定义配置
 * 使用@RibbonClient 的configuration的属性，指定Ribbon的配置类
 */
@Configuration
@RibbonClient(name = "microservice-simple-provider-user", configuration = RibbonConfiguration.class)
public class Testconfiguration {
}
