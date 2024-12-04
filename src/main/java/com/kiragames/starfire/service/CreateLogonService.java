package com.kiragames.starfire.service;

import com.kiragames.starfire.entity.Logon;
import com.kiragames.starfire.repository.LogonRepository;
import com.kiragames.starfire.request.CreateLogonRequest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CreateLogonService implements UserDetailsService {
    private final LogonRepository lr;
    private final PasswordEncoder pwEncoder;

    public CreateLogonService(LogonRepository logon, PasswordEncoder coder) {
        this.lr = logon;
        this.pwEncoder = coder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        return lr.findByUsername(username)
                .orElse(null);
    }

    public Logon createLogon(CreateLogonRequest request) {
        Logon neoLogon = new Logon();

        neoLogon.setName(request.getName());
        neoLogon.setUsername(request.getUsername());
        neoLogon.setRoles(request.getRoles());
        neoLogon.setPassword(pwEncoder.encode(request.getPassword()));

        lr.save(neoLogon);

        return neoLogon;
    }
}
