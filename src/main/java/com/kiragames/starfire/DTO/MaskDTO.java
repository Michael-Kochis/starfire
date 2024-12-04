package com.kiragames.starfire.DTO;

import com.kiragames.starfire.entity.Mask;
import com.kiragames.starfire.entity.Person;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MaskDTO {
    private Long id;
    private String name;
    private List<Person> wearers = new ArrayList<>();

    public MaskDTO(Long neoID, String neoName) {
        this.id = neoID;
        this.name = neoName;
    }

    public MaskDTO(Mask mask) {
        this.id = mask.getId();
        this.name = mask.getName();
    }
}
