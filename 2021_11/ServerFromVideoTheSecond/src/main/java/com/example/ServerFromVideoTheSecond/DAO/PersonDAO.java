package com.example.ServerFromVideoTheSecond.DAO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.ServerFromVideoTheSecond.Model.Person;

public interface PersonDAO {
    
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {/* this inserts a person with a random id and a name we give to the data base */
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);

}
