package com.example.appmicroservice;

import com.example.appmicroservice.dao.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@Sql({
        "classpath:sql/data.sql"
})
class PersonServiceTest {
    @Autowired
    private UserRepository repository;


    @Test
    void findByAll() {
        List<Person> personList = repository.findAll();
        assertEquals(personList.size(),3);
    }
}
