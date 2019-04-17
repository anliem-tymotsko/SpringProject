package com.example.labkatablemongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Kafedra {
    @Id
    private String id;
    private String name;
    private String zavKafedra;
    private Faculty faculty;

    public Kafedra() {
    }

    public Kafedra(String name, String zavKafedra, Faculty faculty) {
        this.name = name;
        this.zavKafedra = zavKafedra;
        this.faculty = faculty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZavKafedra() {
        return zavKafedra;
    }

    public void setZavKafedra(String zavKafedra) {
        this.zavKafedra = zavKafedra;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
