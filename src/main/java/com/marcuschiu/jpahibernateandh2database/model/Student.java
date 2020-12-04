package com.marcuschiu.jpahibernateandh2database.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Entity - specifies that the class is an entity
 */
@Data
@Entity
public class Student {

    /**
     * @Id - specifies the primary key of an entity
     * @GeneratedValue - provides for the specification of generation
     * strategies for the values of primary keys
     */
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String passportNumber;

    // JPA needs a default constructor `public Student()` to be happy
    // provided by lombok's @Data
}
