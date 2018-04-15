package org.trianglex.webcrawler.core.controller;

import org.springframework.web.bind.annotation.*;
import org.trianglex.webcrawler.api.dto.DemoDTO;

@RestController
public class TestController {

    @PostMapping(value = "/test")
    public DemoDTO test(@RequestBody DemoDTO demoDTO) {
        return demoDTO;
    }

    @GetMapping("/test1")
    public String test1(@RequestParam String id) {
        return "OK";
    }

}
