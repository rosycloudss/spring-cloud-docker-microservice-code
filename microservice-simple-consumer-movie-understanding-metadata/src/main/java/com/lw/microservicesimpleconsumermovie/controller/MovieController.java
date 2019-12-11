package com.lw.microservicesimpleconsumermovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lw.microservicesimpleconsumermovie.bean.User;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.client.discovery.DiscoveryClient;

/**
 * @author liwei-4
 * @description:
 * @date 2019-12-09
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://localhost:8002/" + id, User.class);
    }

    /**
     * 查询 microservice-provider-user 服务提供的信息并返回
     * @return
     */
    @GetMapping("/user-instance")
    public List<ServiceInstance> showInfo() {
        return discoveryClient.getInstances("microservice-simple-provider-user-my-metadata");
    }
}
