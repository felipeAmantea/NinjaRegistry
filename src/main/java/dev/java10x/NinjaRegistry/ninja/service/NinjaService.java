package dev.java10x.NinjaRegistry.ninja.service;

import dev.java10x.NinjaRegistry.ninja.model.NinjaModel;
import dev.java10x.NinjaRegistry.ninja.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public NinjaModel updateNinja(Long id, NinjaModel ninjaModel) {
        if (ninjaRepository.existsById(id)) {
            ninjaModel.setId(id);
            return ninjaRepository.save(ninjaModel);
        }
        return null;
    }
}
