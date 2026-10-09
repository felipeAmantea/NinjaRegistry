package dev.java10x.NinjaRegistry.ninja.repository;

import dev.java10x.NinjaRegistry.ninja.model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
