package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByLogin(String login);

    Person findByLoginAndPassword(String login, String password);
}
