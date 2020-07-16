package org.study.yr.chapter03servicefeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi")
public interface ServiceHiFeign {

    @GetMapping("/home")
    String home(@RequestParam("name") String name);
}
