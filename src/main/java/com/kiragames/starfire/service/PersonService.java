package com.kiragames.starfire.service;

import com.kiragames.starfire.entity.Persona;
import com.kiragames.starfire.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository pr;

    public PersonService(PersonRepository person) {
        this.pr = person;
    }

    public List<Persona> getAllPersons() {
        return pr.findAll();
    }

    public Persona getPersonByName(String namae) {
        return pr.findPersonByName(namae)
                .orElse(null);
    }

    public List<Persona> getPersonsByMask(String namae) {
        return pr.findPersonByMask(namae);
    }
    public Persona wearMask(String pName, String mName) {
        return pr.wearMask(pName, mName);
    }

    public Persona updatePersonByID(String elementId, String name, String gender) {
        return pr.updatePersonByID(elementId, name, gender);
    }

    public Persona updatePersonByID(Persona other) {
        return pr.updatePersonByID(other.getElementId(), other.getName(), other.getGender());
    }
}
