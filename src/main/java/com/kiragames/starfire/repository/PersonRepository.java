package com.kiragames.starfire.repository;

import com.kiragames.starfire.entity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PersonRepository extends Neo4jRepository<Person, Long> {

}
