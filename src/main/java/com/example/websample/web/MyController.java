package com.example.websample.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("sample")
    String get() {
        return "Hello World!!";
    }
}
