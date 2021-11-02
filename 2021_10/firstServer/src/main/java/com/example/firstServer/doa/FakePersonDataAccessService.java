package com.example.firstServer.doa;

import java.util.ArrayList;
import java.util.UUID;

import com.example.firstServer.model.Person;

import scala.collection.immutable.List;

public class FakePersonDataAccessService implements PersonDao {
    
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        // TODO Auto-generated method stub
        return 0;
    }

}
