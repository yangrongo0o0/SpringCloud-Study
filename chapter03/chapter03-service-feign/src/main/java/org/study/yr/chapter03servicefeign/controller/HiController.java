package org.study.yr.chapter03servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.study.yr.chapter03servicefeign.feign.ServiceHiFeign;

@RestController
public class HiController {
    @Autowired
    private ServiceHiFeign serviceHiFeign;

    @GetMapping("/invokeServiceHi")
    public String invokeServiceHi(@RequestParam("name")String name){
        return serviceHiFeign.home(name);
    }
}
