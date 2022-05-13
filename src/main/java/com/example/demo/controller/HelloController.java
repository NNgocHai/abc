package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
    String home() {
		String info="Nguyễn Ngọc Hải - 2000 - DakLak";
        return info;
    }
}
