package dev.java10x.NinjaRegistry.ninja.controller;

import dev.java10x.NinjaRegistry.ninja.model.NinjaModel;
import dev.java10x.NinjaRegistry.ninja.service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Ninja Registry";
    }

    @PostMapping
    public NinjaModel createNinja(@RequestBody NinjaModel ninjaModel) {
        return ninjaService.createNinja(ninjaModel);
    }

    @GetMapping("/all")
    public List<NinjaModel> getAllNinja() {
        return ninjaService.getAllNinja();
    }

    @GetMapping("/{id}")
    public NinjaModel getNinjaById(@PathVariable Long id) {
        return ninjaService.findById(id);
    }

    @PutMapping("/{id}")
    public String modifyNinja(@PathVariable String id) {
        return "modifyNinja";
    }

    @DeleteMapping("/{id}")
    public void deleteNinja(@PathVariable Long id) {
       ninjaService.deleteNinjaById(id);
    }
}
