package com.kiragames.starfire.service;

import com.kiragames.starfire.entity.Person;
import com.kiragames.starfire.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository pr;

    public PersonService(PersonRepository person) {
        this.pr = person;
    }

    public List<Person> getAllPersons() {
        return pr.findAll();
    }

    public Person getPersonByName(String namae) {
        return pr.findPersonByName(namae)
                .orElse(null);
    }

    public List<Person> getPersonsByMask(String namae) {
        return pr.findPersonByMask(namae);
    }
    public Person wearMask(String pName, String mName) {
        return pr.wearMask(pName, mName);
    }
}
