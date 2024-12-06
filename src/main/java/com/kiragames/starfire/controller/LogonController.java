package com.kiragames.starfire.controller;

import com.kiragames.starfire.DTO.LogonDTO;
import com.kiragames.starfire.entity.Logon;
import com.kiragames.starfire.request.CreateLogonRequest;
import com.kiragames.starfire.service.CreateLogonService;
import com.kiragames.starfire.service.LogonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/auth")
public class LogonController {
    private final LogonService ls;
    private final CreateLogonService neo;

    public LogonController(LogonService logon, CreateLogonService neoLogon) {
        this.ls = logon;
        this.neo = neoLogon;
    }

    @GetMapping("/me")
    public Principal loggedInUser(Principal principal) {
        return principal;
    }

    @PostMapping("/")
    public ResponseEntity<LogonDTO> registerLogon(@RequestBody CreateLogonRequest request) {
        Logon logon = neo.createLogon(request);
        LogonDTO dto = new LogonDTO();

        if (logon == null) {
            // do nothing
        } else {
            dto.setId(logon.getId());
            dto.setName(logon.getName());
            dto.setUsername(logon.getUsername());
            dto.setRoles(logon.getRoles());
        }

        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
