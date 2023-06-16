package com.example.project_11.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<ProductEntity> getAllProduct() {
        return productRepository.findAll();
    }

    public ProductEntity getProduct(int id) {
        return productRepository.findById(id).get();
    }

    public void addProduct(ProductEntity product) {
        productRepository.save(product);
    }

    public void updateProduct(int id, ProductEntity productEntity) {
        if (productRepository.findById(id).isPresent()) {
            ProductEntity modifiedProductEntity = productRepository.findById(id).get();
            modifiedProductEntity.setName(productEntity.getName());
            modifiedProductEntity.setDescription(productEntity.getDescription());
            productRepository.save(modifiedProductEntity);
        }
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
