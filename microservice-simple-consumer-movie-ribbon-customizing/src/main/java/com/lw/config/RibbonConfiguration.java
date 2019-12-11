package com.lw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * @author liwei-4
 * @description: Ribbon 的配置类
 * 注：该类不应该在主应用程序上下文的@ComponentScan中
 * @date 2019-12-10
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule() {
        // 负载均衡规则，改为随机
        return new RandomRule();
    }
}
