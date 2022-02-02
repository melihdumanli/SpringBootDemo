package com.bilgeadam.demo.repository;

import com.bilgeadam.demo.repository.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPersonRepository extends JpaRepository<Person, Long> {

    // 1- You should start with the find method.
    // 2- ATTENTION!!! Variable names are case-sensitive.
    // 3- Variables that will be processed have to be given as parameters to the method.
    // P.S. It is not necessary to name parameters with the same name of variables.
    List<Person> findByName(String name);
    List<Person> findByNameAndIdentityNumber(String name, String identityNumber);
    Optional<Person> findOptionalByIdentityNumber(String identityNumber);
}
