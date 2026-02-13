package com.kiragames.starfire.controller;

import com.kiragames.starfire.entity.StarfireItem;
import com.kiragames.starfire.service.StarfireItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/item")
public class StarfireItemController {
    private final StarfireItemService is;

     public StarfireItemController(StarfireItemService service) {
         this.is = service;
     }

    @GetMapping("/")
    public ResponseEntity<List<StarfireItem>> getAll() {
        return new ResponseEntity<>(is.findAllItems(), HttpStatus.OK);
    }
}
