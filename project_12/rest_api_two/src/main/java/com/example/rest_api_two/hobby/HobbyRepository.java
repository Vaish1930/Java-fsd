package com.example.rest_api_two.hobby;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HobbyRepository extends JpaRepository<HobbyEntity, Integer> {

    @Query("Select h.name FROM HobbyEntity h where h.personId = personId")
    public String findByPersonId(Integer personId);
}
