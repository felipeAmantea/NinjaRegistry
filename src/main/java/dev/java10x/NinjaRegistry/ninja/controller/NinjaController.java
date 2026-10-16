package dev.java10x.NinjaRegistry.ninja.controller;

import dev.java10x.NinjaRegistry.ninja.model.NinjaDTO;
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
    public NinjaDTO createNinja(@RequestBody NinjaDTO ninjaDTO) {
        return ninjaService.createNinja(ninjaDTO);
    }

    @GetMapping("/all")
    public List<NinjaDTO> getAllNinja() {
        return ninjaService.getAllNinja();
    }

    @GetMapping("/{id}")
    public NinjaDTO getNinjaById(@PathVariable Long id) {
        return ninjaService.findById(id);
    }

    @PutMapping("/{id}")
    public NinjaDTO modifyNinja(@PathVariable Long id, @RequestBody NinjaDTO ninjaDTO) {
        return ninjaService.updateNinja(id, ninjaDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteNinja(@PathVariable Long id) {
       ninjaService.deleteNinjaById(id);
    }
}
