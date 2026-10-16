package dev.java10x.NinjaRegistry.ninja.model;

import dev.java10x.NinjaRegistry.mission.model.MissionModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {
    private Long id;
    private String name;
    private String email;
    private int age;
    private NinjaRank rank;
    private MissionModel missions;
}
