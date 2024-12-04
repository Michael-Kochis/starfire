package com.kiragames.starfire.controller;

import com.kiragames.starfire.DTO.MaskDTO;
import com.kiragames.starfire.entity.Mask;
import com.kiragames.starfire.service.MaskService;
import com.kiragames.starfire.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mask")
public class MaskController {
    private final MaskService ms;
    private final PersonService ps;

    public MaskController(MaskService mask, PersonService person) {
        this.ms = mask;
        this.ps = person;
    }

    @GetMapping("/")
    public ResponseEntity<List<Mask>> allMask() {
        return new ResponseEntity<>(ms.getAllMasks(), HttpStatus.OK);
    }

    @GetMapping("/{namae}")
    public ResponseEntity<Mask> findMaskByName(@PathVariable String namae) {
        Mask mask = ms.getMaskByName(namae);
        if (mask != null) {
            return new ResponseEntity<>(mask, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/wornBy/{namae}")
    public ResponseEntity<MaskDTO> findMaskAndWearers(@PathVariable String namae) {
        MaskDTO returnMe = new MaskDTO(ms.getMaskByName(namae));
        returnMe.setWearers(ps.getPersonsByMask(namae));
        return new ResponseEntity<>(returnMe, HttpStatus.OK);
    }
}
