package com.kiragames.starfire.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WearMaskRequest {
    private String personName;
    private String maskName;

    public WearMaskRequest(String personName, String maskName) {
        this.personName = personName;
        this.maskName = maskName;
    }

}
