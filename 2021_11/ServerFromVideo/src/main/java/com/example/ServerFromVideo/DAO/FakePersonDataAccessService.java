package com.example.ServerFromVideo.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import com.example.ServerFromVideo.Model.Person;
import org.springframework.stereotype.Repository;

@Repository("fakeDAO")
public class FakePersonDataAccessService implements PersonDAO {
    
    private static List<Person> DB = new ArrayList<>(); /* sets the json objects with the names and ids as array lists in the form of json arrays */

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName(), person.getCohort())); /* adds a person to the data base */
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB; /* returns the data base after the get */
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream().filter(person -> person.getId().equals(id)).findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> personMaybe = selectPersonById(id);
        if (personMaybe.isEmpty()) {
            return 0;
        }
        DB.remove(personMaybe.get());
        return 1;  
    }

    @Override
    public int updatePersonById(UUID id, Person update) {
        return selectPersonById(id).map(person -> {
            int indexOfPersonToUpdate = DB.indexOf(person);
            if (indexOfPersonToUpdate >= 0) {
                DB.set(indexOfPersonToUpdate, new Person(id, update.getName(), update.getCohort()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }
}
