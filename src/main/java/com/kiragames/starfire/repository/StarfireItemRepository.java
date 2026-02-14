package com.kiragames.starfire.repository;

import com.kiragames.starfire.DTO.TechItemDTO;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.kiragames.starfire.entity.StarfireItem;
import org.springframework.data.neo4j.repository.query.Query;


public interface StarfireItemRepository extends Neo4jRepository<StarfireItem, String> {
}
