package com.kiragames.starfire.repository;

import com.kiragames.starfire.entity.Mask;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

public interface MaskRepository extends Neo4jRepository<Mask, Long> {
    Optional<Mask> findMaskByName(String namae);
}
