package com.example.project_11.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<ProductEntity> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/product/{id}")
    public ProductEntity getProduct(@PathVariable Integer id) {
        return productService.getProduct(id);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody ProductEntity productEntity) {
        productService.addProduct(productEntity);
    }

    @PostMapping("/product/{id}")
    public void updateProduct(@PathVariable Integer id, @RequestBody ProductEntity productEntity) {
        productService.updateProduct(id, productEntity);
    }

    @PostMapping("/product/delete/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }
}
