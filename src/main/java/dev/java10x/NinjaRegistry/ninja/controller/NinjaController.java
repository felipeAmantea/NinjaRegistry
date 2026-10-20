package dev.java10x.NinjaRegistry.ninja.controller;

import dev.java10x.NinjaRegistry.ninja.model.NinjaDTO;
import dev.java10x.NinjaRegistry.ninja.service.NinjaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> createNinja(@RequestBody NinjaDTO ninjaDTO) {
        NinjaDTO createdNinjaDTO = ninjaService.createNinja(ninjaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Ninja created successfully with id: " + createdNinjaDTO.getId());
    }

    @GetMapping("/all")
    public ResponseEntity<List<NinjaDTO>> getAllNinja() {
        return ResponseEntity.status(HttpStatus.OK).body(ninjaService.getAllNinja());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getNinjaById(@PathVariable Long id) {
        NinjaDTO ninja = ninjaService.findById(id);
        if (ninja != null) {
            return ResponseEntity.status(HttpStatus.OK).body(ninja);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja not found");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modifyNinja(@PathVariable Long id, @RequestBody NinjaDTO ninjaDTO) {
        NinjaDTO ninja = ninjaService.updateNinja(id, ninjaDTO);

        if (ninja != null) {
            return ResponseEntity.status(HttpStatus.OK).body(ninja);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja not found");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteNinja(@PathVariable Long id) {
        if (ninjaService.findById(id) != null) {
            ninjaService.deleteNinjaById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
