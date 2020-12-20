package com.example.evenorodd.controller;

import com.example.evenorodd.service.EvenOddService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/evenOdd")
public class EvenOddController {
    @GetMapping("/returnAnswer/{num}")
    public String returnAnswer(@PathVariable int num) {
        return EvenOddService.returnAnswer(num);
    }
}
