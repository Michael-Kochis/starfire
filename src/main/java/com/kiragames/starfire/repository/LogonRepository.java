package com.kiragames.starfire.repository;

import com.kiragames.starfire.entity.Logon;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

public interface LogonRepository extends Neo4jRepository<Logon, Long> {
    Optional<Logon> findByUsername(String username);
}
