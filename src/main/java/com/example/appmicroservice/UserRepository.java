package com.example.appmicroservice;

import com.example.appmicroservice.dao.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByNameAndId(String name, Long id);
}
