package com.kiragames.starfire.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import java.util.Optional;

@Node
@Getter
@Setter
@NoArgsConstructor
public class StarfireItem {
    @Id
    @GeneratedValue
    private String elementId;

    private String name;
    private String stub;

    private String civstub;

    private String ruleset;
    private Integer sl;
    private Float cost;
    private Integer size;

    @Property("civcost")
    private Optional<Float> civcost;

    @Property("drive")
    private Optional<Float> drive;

    @Property("min")
    private Optional<Integer> min;

    @Property("max")
    private Optional<Integer> max;

}
