package com.codeup.springblog.controllers;

import javax.persistence.*;

@Entity
@Table(name="dogs")
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(11) UNSIGNED")
    private long id;

    @Column(columnDefinition = "TINYINT(3) UNSIGNED", nullable = false, unique = true)
    private int age;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(name = "reside_state", columnDefinition = "CHAR(2) DEFAULT 'XX'")
    private String resideState;

    public Dog(){};


    //getters and setters:
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReside_state() {
        return resideState;
    }

    public void setReside_state(String reside_state) {
        this.resideState = reside_state;
    }
}
