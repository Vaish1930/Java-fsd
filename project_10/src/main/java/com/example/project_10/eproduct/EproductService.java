package com.example.project_10.eproduct;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EproductService {

    @Autowired
    private EproductRepository eproductRepository;

    public List<Eproduct> getAllProduct() {
        List<Eproduct> products = new ArrayList<>();
        eproductRepository.findAll().forEach(products::add);
        ;
        return products;
    }

    public Eproduct getProduct(int id) {
        return eproductRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Invalid Product id!"));
    }

}
