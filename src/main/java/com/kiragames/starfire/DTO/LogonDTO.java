package com.kiragames.starfire.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LogonDTO {
    private Long id;
    private String name;
    private String username;
    private String roles;
}
