package dev.java10x.NinjaRegistry.controller;

import dto.Ninja;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @PostMapping
    public Ninja createNinja(@RequestBody Ninja ninja) {
        return ninja;
    }

    @GetMapping("/{id}")
    public Ninja getNinjaById(@PathVariable String id) {
        return new Ninja();
    }
}
