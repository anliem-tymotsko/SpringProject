package com.example.labkatablemongo.controller;


import com.example.labkatablemongo.service.DekanatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DekanatRestController {
    @Autowired
    DekanatService dekanatService;

    @RequestMapping(value = "/api/dekanat/list", method = RequestMethod.GET)
    public  String show(Model model){
        //model.addAttribute("Dekanat", dekanatService);
        return "dekanatList";
    }
    /*public List<Dekanat> showAll()
    {
        return dekanatService.getAll();
    }*/

}
