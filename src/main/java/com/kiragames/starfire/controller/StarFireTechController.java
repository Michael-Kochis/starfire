package com.kiragames.starfire.controller;

import com.kiragames.starfire.entity.StarfireTech;
import com.kiragames.starfire.service.StarFireTechService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tech")
public class StarFireTechController {
    private final StarFireTechService ts;

    public StarFireTechController(StarFireTechService service) {
        this.ts = service;
    }

    @GetMapping("/")
    public ResponseEntity<List<StarfireTech>> getAll() {
        return new ResponseEntity<>(ts.getAllTechs(), HttpStatus.OK);
    }
}
