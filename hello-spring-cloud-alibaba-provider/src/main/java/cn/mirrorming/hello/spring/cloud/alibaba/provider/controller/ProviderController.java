package cn.mirrorming.hello.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mirror
 */
@RestController
@RefreshScope
public class ProviderController {

    @Value("${test.config}")
    private String testConfig;

    @GetMapping(value = "/echo")
    public String echo() {
        return "Hello Nacos Config :" + testConfig;
    }
}