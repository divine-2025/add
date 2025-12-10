package com.example.add;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addController {
    @GetMapping("/add")
    public String add() {
        return "sum of 5 + 5 = " + 5+5;
    }
}
