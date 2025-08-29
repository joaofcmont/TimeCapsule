package com.timecapsule.timecapsule;

public class TimeCapsuleNotFoundException extends RuntimeException {
    public TimeCapsuleNotFoundException(Integer id) {
        super("Could not find time capsule" + id);
    }
}
