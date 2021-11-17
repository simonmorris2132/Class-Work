package com.example.ServerFromVideo.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.example.ServerFromVideo.Model.Person;
import org.springframework.stereotype.Repository;

@Repository("fakeDAO")
public class FakePersonDataAccessService implements PersonDAO {
    
    private static List<Person> DB = new ArrayList<>(); /* sets the json objects with the names and ids as array lists in the form of json arrays */

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName())); /* adds a person to the data base */
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB; /* returns the data base after the get */
    }
}
