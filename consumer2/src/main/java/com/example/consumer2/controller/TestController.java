package com.example.consumer2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/consumer2")
public class TestController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 第一种方式
     */
    @RequestMapping("/test1")
    public String test1(String message) {
        String str=restTemplate.getForObject("http://client001/test?message=" + message, String.class);
        log.info(str);
        return str;
    }

    /**
     * 第二种方式
     */

}
