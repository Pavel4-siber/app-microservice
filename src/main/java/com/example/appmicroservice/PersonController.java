package com.example.appmicroservice;

import com.example.appmicroservice.dao.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @GetMapping("/persons")
    public List<Person> findAll(){
        return service.findByAll();
    }

}
