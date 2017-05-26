package com.example.demo.jenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ryf
 * @Date 2017/5/26 0026
 */
@RestController
public class JenkinsController {

    @RequestMapping("/index")
    public String findTenantInfo(Long userId,Long busiSystemId) {
        return "Hello Jenkins";
    }
}
