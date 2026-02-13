package com.kiragames.starfire.entity;

import com.kiragames.starfire.DTO.TechItemDTO;
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

    @Property("civstub")
    private String civstub;

    private String ruleset;
    private Integer sl;
    private Double cost;
    private Integer size;

    @Property("civcost")
    private Float civcost;

    @Property("drive")
    private Float drive;

    @Property("min")
    private Integer min;

    @Property("max")
    private Integer max;

    public void copyTechItemDTO(TechItemDTO techItemDTO) {
        this.setSl(techItemDTO.getSl());
        this.setCost(techItemDTO.getCost());
        if (techItemDTO.getSize() != null) {
            this.setSize(techItemDTO.getSize());
        }
        this.setCivcost(techItemDTO.getCivcost());
        this.setDrive(techItemDTO.getDrive());
        this.setMin(techItemDTO.getMin());
        this.setMax(techItemDTO.getMax());
    }
}
