package com.kiragames.starfire.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.kiragames.starfire.entity.StarfireItem;


public interface StarfireItemRepository extends Neo4jRepository<StarfireItem, String> {
}
