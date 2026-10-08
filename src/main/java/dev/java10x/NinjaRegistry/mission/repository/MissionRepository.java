package dev.java10x.NinjaRegistry.mission.repository;

import dev.java10x.NinjaRegistry.mission.model.MissionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<MissionModel, Long> {
}
