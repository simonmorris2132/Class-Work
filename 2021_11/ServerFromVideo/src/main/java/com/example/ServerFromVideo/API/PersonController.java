package com.example.ServerFromVideo.API;

import java.util.List;
import com.example.ServerFromVideo.Model.Person;
import com.example.ServerFromVideo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    
    private final PersonService personService;

    @Autowired /* this is basically injecting the personservice class into this method so that it can use the data from that class */
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping /* posts a person to the data base via post man */
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping /* gets all data from data base which holds the people */
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

}
