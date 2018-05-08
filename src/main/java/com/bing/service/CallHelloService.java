package com.bing.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class CallHelloService {
    @Resource
    private RestTemplate restTemplate;

    public String sayHello() {
        String url = "http://BING-FIRST-SERVICE/sayHello?name=RyanWang";
        return restTemplate.getForEntity(url, String.class).getBody();
    }
}
