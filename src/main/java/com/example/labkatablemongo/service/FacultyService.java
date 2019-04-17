package com.example.labkatablemongo.service;

import com.example.labkatablemongo.model.Faculty;
import com.example.labkatablemongo.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultyService {
    List<Faculty> facultyList = new ArrayList<>();
    @Autowired
    FacultyRepository facultyRepository;

    public List<Faculty> getAll(){

        return facultyRepository.findAll();
    }
}
