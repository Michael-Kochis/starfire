package com.kiragames.starfire.service;

import com.kiragames.starfire.entity.StarfireTech;
import com.kiragames.starfire.repository.StarFireTechRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarFireTechService {
    private final StarFireTechRepository tr;

    public StarFireTechService(StarFireTechRepository neo) {
        this.tr = neo;
    }

    public List<StarfireTech> getAllTechs() {
        return this.tr.findAll();
    }
}
