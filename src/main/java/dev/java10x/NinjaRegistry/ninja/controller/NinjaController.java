package dev.java10x.NinjaRegistry.ninja.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Ninja Registry";
    }

    @PostMapping
    public String createNinja() {
        return "createNinja";
    }

    @GetMapping("/{id}")
    public String getNinjaById(@PathVariable String id) {
        return "getNinjaById";
    }

    @PutMapping("/{id}")
    public String modifyNinja(@PathVariable String id) {
        return "modifyNinja";
    }

    @DeleteMapping("/{id}")
    public String deleteNinja(@PathVariable String id) {
        return "deleteNinja";
    }
}
