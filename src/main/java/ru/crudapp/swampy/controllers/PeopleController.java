package ru.crudapp.swampy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pelople")
public class PeopleController {

    //return people list
    @GetMapping()
    public String index(Model model) {
        //get all people from dao and pass them to view
        return null;
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        //get person with defined id from dao and pass him to view
        return null;
    }
}
