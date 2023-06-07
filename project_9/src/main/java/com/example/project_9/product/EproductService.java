package com.example.project_9.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EproductService {

    @Autowired
    private EproductRepository eproductRepositry;

    public List<Eproduct> getAllProduct() {
        List<Eproduct> users = new ArrayList<>();
        eproductRepositry.findAll().forEach(users::add);
        ;
        return users;
    }

}
