package com.kiragames.starfire.controller;

import com.kiragames.starfire.entity.Person;
import com.kiragames.starfire.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
    private final PersonService ps;

    public PersonController(PersonService service) {
        this.ps = service;
    }

    @GetMapping("/")
    public ResponseEntity<List<Person>> allPerson() {
        return new ResponseEntity<>(ps.getAllPersons(), HttpStatus.OK);
    }
}
