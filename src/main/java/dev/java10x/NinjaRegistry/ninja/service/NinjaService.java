package dev.java10x.NinjaRegistry.ninja.service;

import dev.java10x.NinjaRegistry.ninja.model.NinjaDTO;
import dev.java10x.NinjaRegistry.ninja.model.NinjaMapper;
import dev.java10x.NinjaRegistry.ninja.model.NinjaModel;
import dev.java10x.NinjaRegistry.ninja.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;
    private final NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository,  NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public NinjaDTO createNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        NinjaModel ninja = ninjaRepository.save(ninjaModel);
        return ninjaMapper.map(ninja);
    }

    public List<NinjaDTO> getAllNinja() {
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream().map(ninjaMapper::map).toList();
    }

    public NinjaDTO findById(Long id) {
        NinjaModel ninja = ninjaRepository.findById(id).orElseThrow(() -> new RuntimeException("Ninja not found"));
        return ninjaMapper.map(ninja);
    }

    public void deleteNinjaById(Long id) {
        ninjaRepository.deleteById(id);
    }

    public NinjaDTO updateNinja(Long id, NinjaDTO ninjaDTO) {
        if (ninjaRepository.existsById(id)) {
            NinjaModel ninja = ninjaMapper.map(ninjaDTO);
            return ninjaMapper.map(ninjaRepository.save(ninja));
        }
        return null;
    }
}
