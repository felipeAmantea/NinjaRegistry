package dev.java10x.NinjaRegistry.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/{id}")
    public void getNinjaById(@PathVariable String id) {
    }
}
