package com.example.labkatablemongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Faculty {
    @Id
    private String id;
    private String kerivnyk;
    private Dekanat dekanat;

    public Faculty() {
    }

    public Faculty(String kerivnyk, Dekanat dekanat) {
        this.kerivnyk = kerivnyk;
        this.dekanat = dekanat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKerivnyk() {
        return kerivnyk;
    }

    public void setKerivnyk(String kerivnyk) {
        this.kerivnyk = kerivnyk;
    }

    public Dekanat getDekanat() {
        return dekanat;
    }

    public void setDekanat(Dekanat dekanat) {
        this.dekanat = dekanat;
    }
}
