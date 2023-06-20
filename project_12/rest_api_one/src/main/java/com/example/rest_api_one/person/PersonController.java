package com.example.rest_api_one.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/webapione")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person/{personId}")
    public PersonResponse getPerson(@PathVariable Integer personId) {
        return personService.getPerson(personId);
    }

    @PostMapping("/person")
    public void addPerson(@RequestBody PersonEntity personEntity) {
        personService.addPerson(personEntity);
    }
}
