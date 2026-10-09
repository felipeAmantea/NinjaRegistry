package dev.java10x.NinjaRegistry.ninja.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Ninja Registry";
    }

    @GetMapping("/{id}")
    public void getNinjaById(@PathVariable String id) {
    }
}
