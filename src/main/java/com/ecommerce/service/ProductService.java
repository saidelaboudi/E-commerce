package com.ecommerce.service;

import com.ecommerce.model.Product;

public interface ProductService {
    public Product getProduct(Long id);

    public void newProduct(Product product);

    public void remove(Long id);
}
