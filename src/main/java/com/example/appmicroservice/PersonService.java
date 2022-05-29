package com.example.appmicroservice;

import com.example.appmicroservice.dao.Person;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class PersonService {

    private final UserRepository repository;

    private final Logger logger = LoggerFactory.getLogger(PersonService.class);

    public List<Person> findByAll(){
        logger.info("FindAll service ________________________________________________");
        return repository.findAll();
    }
    public Person findByNameAndId(String name, Long id){
        Optional<Person> person = repository.findByNameAndId(name, id);
        return person.isPresent() ? person.get(): new Person();

    }
}
