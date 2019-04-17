package com.example.labkatablemongo.service;


import com.example.labkatablemongo.model.Dekanat;
import com.example.labkatablemongo.repository.DekanatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DekanatService {
    List<Dekanat> dekanats = new ArrayList<>(
            Arrays.asList(
                    new Dekanat("Peduha", "Ivanov II"),
                    new Dekanat("IFTKN", "Besaga"),
                    new Dekanat("Optyky", "Angelskyj")
            )
    );
    @Autowired
    DekanatRepository dekanatRepository;

    public List<Dekanat> getAll() {

        return dekanatRepository.findAll();
    }


}
