package com.kiragames.starfire.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TechItemDTO {
    private String ruleset;
    private Integer sl;
    private Float cost;
    private Integer size;
    private Float civcost;
    private Float drive;
    private Integer min;
    private Integer max;
}
