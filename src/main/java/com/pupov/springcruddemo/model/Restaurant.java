package com.pupov.springcruddemo.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Pupov
 */

@Data
@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "name")
    private String name;

}
