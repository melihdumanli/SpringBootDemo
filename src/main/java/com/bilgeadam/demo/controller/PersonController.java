package com.bilgeadam.demo.controller;

import com.bilgeadam.demo.repository.entity.Person;
import com.bilgeadam.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    //http:localhost:8080/person/hello
    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("First Spring REST API");
    }

    @PostMapping("/save")
    public ResponseEntity<Void> save(String name, String identityNumber) {
        personService.save(Person.builder().identityNumber(identityNumber).name(name).build());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Person>> findAll(){
        return ResponseEntity.ok(personService.findAll());
    }
}
