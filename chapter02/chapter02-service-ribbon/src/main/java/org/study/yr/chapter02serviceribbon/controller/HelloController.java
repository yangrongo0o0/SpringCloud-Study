package org.study.yr.chapter02serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.study.yr.chapter02serviceribbon.service.HelloService;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("hi")
    public String hi(@RequestParam("name") String name) {
        return helloService.helloService(name);
    }
}
