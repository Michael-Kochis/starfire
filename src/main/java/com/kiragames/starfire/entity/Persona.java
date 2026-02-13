package com.kiragames.starfire.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Getter
@Setter
@NoArgsConstructor
public class Persona {
    @Id
    @GeneratedValue
    private String elementId;
    private String name;
    private String gender;
}
