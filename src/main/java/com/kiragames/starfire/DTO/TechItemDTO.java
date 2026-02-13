package com.kiragames.starfire.DTO;

import com.kiragames.starfire.entity.StarfireTech;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.RelationshipId;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@Getter
@Setter
@NoArgsConstructor
@RelationshipProperties
public class TechItemDTO {
    @RelationshipId
    private String elementID; // Changed to Long, standard for Neo4j internal IDs

    private String ruleset;

    @Property("SL")
    private Integer sl;

    private Double cost;

    // Use Wrapper classes instead of Optional
    private Integer size;
    private Double civcost;
    private Double drive;
    private Integer min;
    private Integer max;

    @TargetNode
    private StarfireTech tech;

}