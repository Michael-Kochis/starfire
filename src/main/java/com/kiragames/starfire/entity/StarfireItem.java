package com.kiragames.starfire.entity;

import com.kiragames.starfire.DTO.TechItemDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.*;

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
    private Double civcost;

    @Property("drive")
    private Double drive;

    @Property("min")
    private Integer min;

    @Property("max")
    private Integer max;

    @Relationship(type = "TECH_ITEM")
    private TechItemDTO techItem;

    public void copyTechItemDTO() {
        this.setRuleset(this.techItem.getRuleset());
        this.setSl(this.techItem.getSl());
        this.setCost(this.techItem.getCost());
        if (this.techItem.getSize() != null) {
            this.setSize(this.techItem.getSize());
        }
        this.setCivcost(this.techItem.getCivcost());
        this.setDrive(this.techItem.getDrive());
        this.setMin(this.techItem.getMin());
        this.setMax(this.techItem.getMax());
    }
}
