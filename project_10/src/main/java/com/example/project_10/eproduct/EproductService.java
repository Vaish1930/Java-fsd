package com.example.project_10.eproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EproductService {

    @Autowired
    private EproductRepository eproductRepository;

    public Eproduct getProduct(int id) {
        return eproductRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Invalid Product id!"));
    }

}
