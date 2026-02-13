package com.kiragames.starfire.repository;

import com.kiragames.starfire.entity.Persona;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends Neo4jRepository<Persona, Long> {
    Optional<Persona> findPersonByName(String namae);

    @Query("MATCH(p :Persona)<-[:CIVILIAN_ID]-(m :Mask {name: $maskName}) return p")
    List<Persona> findPersonByMask(String maskName);

    @Query("MERGE (p :Persona {name: $pName})<-[:CIVILIAN_ID]-(m :Mask {name: $mName}) return p")
    Persona wearMask(String pName, String mName);

    @Query("MATCH (p :Persona) WHERE elementId(p) = $id " +
            "SET p.name = $name " +
            "SET p.gender = $gender " +
            "RETURN p")
    Persona updatePersonByID(Long id, String name, String gender);
}
