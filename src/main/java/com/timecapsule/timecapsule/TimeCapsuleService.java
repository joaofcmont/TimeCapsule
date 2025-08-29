package com.timecapsule.timecapsule;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimeCapsuleService {

    private final TimeCapsuleRepository timeCapsuleRepository;

    public TimeCapsuleService(TimeCapsuleRepository timeCapsuleRepository) {
        this.timeCapsuleRepository = timeCapsuleRepository;
    }

    public List<TimeCapsule> getAllTimeCapsules(){
          return timeCapsuleRepository.findAll();
    }

    public Optional<TimeCapsule> findById(Integer id){
        return timeCapsuleRepository.findById(id);
    }

   public void setTimeCapsules(TimeCapsule timeCapsules){
       timeCapsuleRepository.save(timeCapsules);
   }

}
