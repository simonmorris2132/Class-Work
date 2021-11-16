package com.example.ServerFromVideo.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.example.ServerFromVideo.Model.Person;
import org.springframework.stereotype.Repository;

@Repository("fakeDAO")
public class FakePersonDataAccessService implements PersonDAO {
    
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }
}
