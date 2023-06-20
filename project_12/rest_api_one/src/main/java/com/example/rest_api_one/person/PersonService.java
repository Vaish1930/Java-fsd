package com.example.rest_api_one.person;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    RestTemplate restTemplate = new RestTemplate();

    public PersonResponse getPerson(int personId) {
        final String uri = "http://localhost:8080/webapitwo/hobby/{personId}";
        Map<String, Integer> params = new HashMap<String, Integer>();
        params.put("personId", personId);

        String result = restTemplate.getForObject(uri, String.class, params);

        PersonEntity personEntity = personRepository.findById(personId).get();

        PersonResponse personResponse = new PersonResponse();
        personResponse.setPersonId(personEntity.getPersonId());
        personResponse.setName(personEntity.getName());
        personResponse.setAge(personEntity.getAge());
        personResponse.setHobby(result);
        return personResponse;

    }

    public void addPerson(PersonEntity personEntity) {
        personRepository.save(personEntity);
    }
}
