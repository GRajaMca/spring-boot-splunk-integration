package com.javabeans.io.springbootsplunkintegration.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SplunkController {
    @GetMapping("")
    public String getData() {
        log.info("Hello world!");
        return "Hello world!";
    }

    @GetMapping("/splunk/{input}")
    public String addIntoSplunk(@PathVariable String input) {
        log.info("Input request : {}", input);
        return "Request received";
    }
}
