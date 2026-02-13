package com.kiragames.starfire.repository;

import com.kiragames.starfire.entity.StarfireTech;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface StarFireTechRepository extends Neo4jRepository<StarfireTech, String> {
}
