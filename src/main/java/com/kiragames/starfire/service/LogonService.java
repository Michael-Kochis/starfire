package com.kiragames.starfire.service;

import com.kiragames.starfire.repository.LogonRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class LogonService implements UserDetailsService {
    private final LogonRepository lr;

    public LogonService(LogonRepository logon) {
        this.lr = logon;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        return lr.findByUsername(username)
                .orElse(null);
    }
}
