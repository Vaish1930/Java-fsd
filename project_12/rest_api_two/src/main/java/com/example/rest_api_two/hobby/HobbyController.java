package com.example.rest_api_two.hobby;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/webapitwo")
public class HobbyController {

    @Autowired
    private HobbyService hobbyService;

    @GetMapping("/hobby/{personId}")
    public String findByPersonId(@PathVariable Integer personId) {
        return hobbyService.findByPersonId(personId);
    }

    @PostMapping("/hobby")
    public void addHobby(@RequestBody HobbyEntity hobbyEntity) {
        hobbyService.addHobby(hobbyEntity);
    }
}
