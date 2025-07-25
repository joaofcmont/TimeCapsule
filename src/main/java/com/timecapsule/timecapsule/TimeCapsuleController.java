package com.timecapsule.timecapsule;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("time-capsules")
public class TimeCapsuleController {

    @GetMapping
    public List<TimeCapsule> getTimeCapsules(){
        return List.of(
                new TimeCapsule(
                        1,
                        "João Monteiro",
                        "Olá tudo bem contigo?"
                )
        );
    }

}
