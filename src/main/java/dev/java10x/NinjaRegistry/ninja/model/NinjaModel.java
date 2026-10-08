package dev.java10x.NinjaRegistry.ninja.model;

import dev.java10x.NinjaRegistry.mission.model.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_ninjas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private int age;
    @ManyToOne
    @JoinColumn(name = "missions_id")
    private MissionModel missions;

}
