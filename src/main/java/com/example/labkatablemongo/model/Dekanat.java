package com.example.labkatablemongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Dekanat {
    @Id
    private String id;
    private String name;
    private String dekan;

    public Dekanat() {
    }

    public Dekanat(String name, String dekan) {
        this.name = name;
        this.dekan = dekan;
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

    public String getDekan() {
        return dekan;
    }

    public void setDekan(String dekan) {
        this.dekan = dekan;
    }
}
