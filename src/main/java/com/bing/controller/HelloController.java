package com.bing.controller;

import com.bing.service.CallHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private CallHelloService callHelloService;

    @RequestMapping(value = "sayHello",method = RequestMethod.GET)
    public String sayHello() {
        return callHelloService.sayHello();
    }
}
