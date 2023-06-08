package com.example.project_10.eproduct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class EproductController {

    @Autowired
    private EproductService eproductService;

    private static Logger logger = LogManager.getLogger(EproductController.class);

    @GetMapping("/{id}")
    public Eproduct getDepartment(@PathVariable int id) {
        logger.info("Retrieving Product with id: " + id);
        return eproductService.getProduct(id);
    }

}
