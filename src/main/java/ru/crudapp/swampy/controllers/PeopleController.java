package ru.crudapp.swampy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.crudapp.swampy.dao.PersonDAO;

@Controller
@RequestMapping("/pelople")
public class PeopleController {

    private final PersonDAO personDAO;

    @Autowired
    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    //return people list
    @GetMapping()
    public String index(Model model) {
        //get all people from dao and pass them to view
        model.addAttribute("people", personDAO.index());
        return "people/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        //get person with defined id from dao and pass him to view
        model.addAttribute("person", personDAO.show(id));
        return "people/show";
    }
}
