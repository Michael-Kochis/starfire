package com.kiragames.starfire.service;

import com.kiragames.starfire.entity.Mask;
import com.kiragames.starfire.repository.MaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaskService {
    private final MaskRepository mr;

    public MaskService(MaskRepository mask) {
        this.mr = mask;
    }
    public List<Mask> getAllMasks() {
        return mr.findAll();
    }


    public Mask getMaskByName(String namae) {
        return mr.findMaskByName(namae)
                .orElse(null);
    }
}
