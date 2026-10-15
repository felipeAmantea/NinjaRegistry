package dev.java10x.NinjaRegistry.mission.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missions")
public class MissionController {

    @PostMapping
    public String createMission() {
        return "Mission created";
    }

    @GetMapping
    public String listMissions() {
        return "Missions listed";
    }

    @GetMapping("/{id}")
    public String getMissionById(@PathVariable String id) {
        return "Get mission with id: " + id;
    }

    @PutMapping("{id}")
    public String updateMission(@PathVariable String id) {
        return "Update mission with id: " + id;
    }

    @DeleteMapping("{id}")
    public String deleteMission(@PathVariable String id) {
        return "Delete mission with id: " + id;
    }


}
