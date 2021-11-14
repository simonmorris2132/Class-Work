package com.example.ServerFromVideo.API;

import com.example.ServerFromVideo.Model.Person;
import com.example.ServerFromVideo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonController {
    
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }

}
