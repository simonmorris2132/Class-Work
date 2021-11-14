package com.example.ServerFromVideo.DAO;

import java.util.UUID;

import com.example.ServerFromVideo.Model.Person;

public interface PersonDAO {
    
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

}
