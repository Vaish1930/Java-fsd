package com.example.rest_api_two.hobby;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbyService {

    @Autowired
    private HobbyRepository hobbyRepository;

    public String findByPersonId(int personId) {
        return hobbyRepository.findByPersonId(personId);
    }

    public void addHobby(HobbyEntity hobbyEntity) {
        hobbyRepository.save(hobbyEntity);
    }
}
