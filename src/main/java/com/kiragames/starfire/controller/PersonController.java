package com.kiragames.starfire.controller;

import com.kiragames.starfire.entity.Persona;
import com.kiragames.starfire.DTO.PersonDTO;
import com.kiragames.starfire.request.WearMaskRequest;
import com.kiragames.starfire.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persona")
public class PersonController {
    private final PersonService ps;

    public PersonController(PersonService service) {
        this.ps = service;
    }

    @GetMapping("/")
    public ResponseEntity<List<Persona>> allPerson() {
        return new ResponseEntity<>(ps.getAllPersons(), HttpStatus.OK);
    }

    @GetMapping("/{namae}")
    public ResponseEntity<Persona> personByName(@PathVariable String namae) {
        Persona person = ps.getPersonByName(namae);
        if (person != null) {
            return new ResponseEntity<>(person, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping ("/wearMask")
    public ResponseEntity<Persona> wearMask(@RequestBody WearMaskRequest request) {
        String person = request.getPersonName();
        String mask = request.getMaskName();

        if (person != null && !person.isEmpty()
            && mask != null && !mask.isEmpty()) {
            return new ResponseEntity<>(ps.wearMask(person, mask), HttpStatus.OK);
        } else {
            return null;
        }
    }

    @PutMapping("/")
    public ResponseEntity<Persona> updatePerson(@RequestBody PersonDTO other) {
        return new ResponseEntity<>(ps.updatePersonByID(other.getId(), other.getName(), other.getGender()), HttpStatus.OK);
    }
}
