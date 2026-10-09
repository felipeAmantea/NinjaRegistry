package dev.java10x.NinjaRegistry.mission.model;

import dev.java10x.NinjaRegistry.ninja.model.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missions")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ninja_name")
    private String name;
    @Column(name = "ninja_rank")
    private MissionRank rank;
    @OneToMany(mappedBy = "missions")
    private List<NinjaModel> ninjas;
}
