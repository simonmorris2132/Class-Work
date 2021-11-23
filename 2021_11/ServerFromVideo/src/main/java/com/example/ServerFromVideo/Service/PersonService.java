package com.example.ServerFromVideo.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import com.example.ServerFromVideo.DAO.PersonDAO;
import com.example.ServerFromVideo.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
    private final PersonDAO personDAO;

    @Autowired
    public PersonService(@Qualifier("fakeDAO") PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public int addPerson(Person person) {/* this inserts a person from the DAO class */
        return personDAO.insertPerson(person);
    }

    public List<Person> getAllPeople() {
        return personDAO.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id) { /* This sets the parameters for searching a person by their id */
        return personDAO.selectPersonById(id);
    }

    public int deletePersonById(UUID id) {
        return personDAO.deletePersonById(id);
    }

    public int updatePersonById(UUID id, Person person) {
        return personDAO.updatePersonById(id, person);
    }

}
