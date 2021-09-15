package com.ecommerce.service;

import com.ecommerce.model.Product;

import java.util.List;

public interface ProductService {
    public Product getProduct(Long id);

    public Product newProduct(Product product);

    public void remove(Long id);

    public List<Product> getAllProducts();

    public List<Product> getProductsByCatedory(Long id);

    public void setBestSelling(Long id , boolean isBestSelling);
}
