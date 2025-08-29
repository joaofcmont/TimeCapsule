package com.timecapsule.timecapsule;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
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

    @GetMapping("/time-capsules/{id}")
    public TimeCapsule getOneTimeCapsule(@PathVariable Integer id){
        return timeCapsuleService.findById(id).orElseThrow(() -> new TimeCapsuleNotFoundException(id));
    }

    @PostMapping("/time-capsule")
    public void setTimeCapsules(@RequestBody TimeCapsule timeCapsules){
        timeCapsuleService.setTimeCapsules(timeCapsules);
    }



}
