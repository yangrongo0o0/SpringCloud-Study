package org.study.yr.chapter03servicefeign.service;

import org.springframework.stereotype.Service;
import org.study.yr.chapter03servicefeign.feign.ServiceHiFeign;

@Service
public class SchedualServiceHiHystric implements ServiceHiFeign {
    @Override
    public String home(String name) {
        return "hi," + name + ",sorry,Error";
    }
}
