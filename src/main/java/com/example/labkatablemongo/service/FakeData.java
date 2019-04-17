package com.example.labkatablemongo.service;


import com.example.labkatablemongo.repository.DekanatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakeData {
    @Autowired
    DekanatRepository repository;
/*
    List<Dekanat> dekanats = new ArrayList<>(
            Arrays.asList(
                    new Dekanat("Peduha","Ivanov II"),
                    new Dekanat("IFTKN", "Besaga"),
                    new Dekanat("Optyky", "Angelskyj")
            )
    );

    @PostConstruct
    void init()
    {
        repository.saveAll(dekanats);
    }*/
}
