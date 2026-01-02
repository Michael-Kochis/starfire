package com.kiragames.starfire.service;

import com.kiragames.starfire.entity.Persona;
import com.kiragames.starfire.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class WearMaskService {
    private final PersonRepository pr;

    public WearMaskService(PersonRepository pr) {
        this.pr = pr;
    }

    public Persona wearMask(String pName, String mName) {
        if (pName != null && !pName.isEmpty()
            && mName != null && !mName.isEmpty()) {
            return pr.wearMask(pName, mName);
        } else {
            return null;
        }
    }
}
