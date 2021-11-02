package com.example.firstServer.api;

import com.example.firstServer.model.Person;
import com.example.firstServer.service.PersonService;

public class PersonController {
    
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
