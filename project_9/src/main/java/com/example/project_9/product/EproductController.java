package com.example.project_9.product;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class EproductController {

    @Autowired
    private EproductService userService;

    private static Logger logger = LogManager.getLogger(EproductController.class);

    @GetMapping
    public List<Eproduct> getAllProducts() {
        logger.info("Retrieving all Products");
        return userService.getAllProduct();
    }

}
