package dev.java10x.NinjaRegistry.ninja.service;

import dev.java10x.NinjaRegistry.ninja.model.NinjaModel;
import dev.java10x.NinjaRegistry.ninja.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public NinjaModel createNinja(NinjaModel ninjaModel) {
        return ninjaRepository.save(ninjaModel);
    }

    public List<NinjaModel> getAllNinja() {
        return ninjaRepository.findAll();
    }

    public NinjaModel findById(Long id) {
        return ninjaRepository.findById(id).orElseThrow(() -> new RuntimeException("Ninja not found"));
    }

    public void deleteNinjaById(Long id) {
        ninjaRepository.deleteById(id);
    }
}
