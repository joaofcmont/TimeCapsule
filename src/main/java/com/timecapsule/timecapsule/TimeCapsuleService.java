package com.timecapsule.timecapsule;

import org.springframework.stereotype.Service;

import java.util.List;

//available to use in other classes
@Service
public class TimeCapsuleService {

    private final TimeCapsuleRepository timeCapsuleRepository;

    public TimeCapsuleService(TimeCapsuleRepository timeCapsuleRepository) {
        this.timeCapsuleRepository = timeCapsuleRepository;
    }

    public List<TimeCapsule> getAllTimeCapsules(){
          return timeCapsuleRepository.findAll();
    }

}
