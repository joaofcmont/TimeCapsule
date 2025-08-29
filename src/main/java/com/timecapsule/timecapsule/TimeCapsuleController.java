package com.timecapsule.timecapsule;

import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.List;

@RestController
public class TimeCapsuleController {

    private final TimeCapsuleService timeCapsuleService;

    public TimeCapsuleController(TimeCapsuleService timeCapsuleService) {
        this.timeCapsuleService = timeCapsuleService;
    }

    @GetMapping("/time-capsules")
    public List<TimeCapsule> getAllTimeCapsules(){
        return timeCapsuleService.getAllTimeCapsules();
    }

    @PostMapping("/time-capsule")
    public void setTimeCapsules(@RequestBody TimeCapsule timeCapsules){
        timeCapsuleService.setTimeCapsules(timeCapsules);
    }

    @GetMapping("/time-capsules/{id}")
    public TimeCapsule getOneTimeCapsule(@PathVariable Integer id){
        return timeCapsuleService.findById(id).orElseThrow(() -> new TimeCapsuleNotFoundException(id));
    }



}
