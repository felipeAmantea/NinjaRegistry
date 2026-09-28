package dev.java10x.NinjaRegistry.mission.model;

import dev.java10x.NinjaRegistry.ninja.model.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missions")
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private MissionRank rank;

    @OneToMany(mappedBy = "missions")
    private List<NinjaModel> ninjas;

    public MissionModel() {

    }

    public MissionModel(Long id, String name, MissionRank rank, List<NinjaModel> ninjas) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.ninjas = ninjas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MissionRank getRank() {
        return rank;
    }

    public void setRank(MissionRank rank) {
        this.rank = rank;
    }

    public List<NinjaModel> getNinjas() {
        return ninjas;
    }

    public void setNinjas(List<NinjaModel> ninjas) {
        this.ninjas = ninjas;
    }
}
