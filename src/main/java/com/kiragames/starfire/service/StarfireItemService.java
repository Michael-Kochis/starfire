package com.kiragames.starfire.service;

import com.kiragames.starfire.DTO.TechItemDTO;
import com.kiragames.starfire.entity.StarfireItem;
import com.kiragames.starfire.repository.StarfireItemRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarfireItemService {
    private final StarfireItemRepository ir;

    public StarfireItemService(StarfireItemRepository repository) {
        this.ir = repository;
    }

    public List<StarfireItem> findAllItems() {
        List<StarfireItem> returnThis = this.ir.findAll();
        for (StarfireItem item: returnThis) {
            item.copyTechItemDTO();
            item.setElementId("[REDACTED]");
        }
        return returnThis;
    }

}
