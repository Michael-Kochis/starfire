package com.kiragames.starfire.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateLogonRequest {
    private String name;
    private String username;
    private String roles;
    private String password;

    public CreateLogonRequest(String neoName, String neoUserName, String neoRoles, String neoPassword) {
        this.name = neoName;
        this.username = neoUserName;
        this.roles = neoRoles;
        this.password = neoPassword;
    }
}
