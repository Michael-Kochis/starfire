package com.kiragames.starfire.repository;

import com.kiragames.starfire.entity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends Neo4jRepository<Person, Long> {
    Optional<Person> findPersonByName(String namae);

    @Query("MATCH(p :Person)<-[:CIVILIAN_ID]-(m :Mask {name: $maskName}) return p")
    List<Person> findPersonByMask(String maskName);

    @Query("MERGE (p :Person {name: $pName})<-[:CIVILIAN_ID]-(m :Mask {name: $mName}) return p")
    Person wearMask(String pName, String mName);
}
