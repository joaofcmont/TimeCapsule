package com.timecapsule.timecapsule;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/time-capsules")
public class TimeCapsuleController {

    private final TimeCapsuleService timeCapsuleService;

    public TimeCapsuleController(TimeCapsuleService timeCapsuleService) {
        this.timeCapsuleService = timeCapsuleService;
    }

    @GetMapping()
    public List<TimeCapsule> getTimeCapsules(){
        return timeCapsuleService.getAllTimeCapsules();
    }

    @PostMapping()
    public void setTimeCapsules(@RequestBody TimeCapsule timeCapsules){
        timeCapsuleService.setTimeCapsules(timeCapsules);
    }


}
