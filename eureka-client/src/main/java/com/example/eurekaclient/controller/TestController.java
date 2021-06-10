package com.example.eurekaclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @RequestMapping(value = "test")
    public String test(String message) {
        log.info(message);
        return message + "啊啊啊";
    }
}
