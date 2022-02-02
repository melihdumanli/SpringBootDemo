package com.bilgeadam.demo.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "tblperson")
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    long birthdate;
    String identityNumber;
    int state;

}
