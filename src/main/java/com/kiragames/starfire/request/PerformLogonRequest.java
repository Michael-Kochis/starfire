package com.kiragames.starfire.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PerformLogonRequest {
    private String username;
    private String password;

}
