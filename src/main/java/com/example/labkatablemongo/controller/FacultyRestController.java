package com.example.labkatablemongo.controller;

import com.example.labkatablemongo.repository.FacultyRepository;
import com.example.labkatablemongo.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacultyRestController {
    @Autowired
    FacultyService facultyService;
    @RequestMapping(value = "/api/faculty/list", method = RequestMethod.GET)
    public  String show(Model model){
        model.addAttribute("Faculty", facultyService);
        return "dekanatList";
    }
}
