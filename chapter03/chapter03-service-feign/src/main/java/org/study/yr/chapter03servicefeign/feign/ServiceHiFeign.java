package org.study.yr.chapter03servicefeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.study.yr.chapter03servicefeign.service.SchedualServiceHiHystric;

@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface ServiceHiFeign {

    @GetMapping("/home")
    String home(@RequestParam("name") String name);
}
