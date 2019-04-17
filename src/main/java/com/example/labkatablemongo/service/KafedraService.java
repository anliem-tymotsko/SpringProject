package com.example.labkatablemongo.service;

import com.example.labkatablemongo.model.Kafedra;
import com.example.labkatablemongo.repository.KafedraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KafedraService {
    List<Kafedra> facultyList = new ArrayList<>();
    @Autowired
    KafedraRepository kafedraRepository;

    public List<Kafedra> getAll(){

        return kafedraRepository.findAll();
    }
}
