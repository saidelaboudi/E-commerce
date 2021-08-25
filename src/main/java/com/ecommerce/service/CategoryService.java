package com.ecommerce.service;

import com.ecommerce.model.Category;
import com.ecommerce.model.Product;

import java.util.List;

public interface CategoryService {
    public void addCategory(Category category);

    public void delete(Long id);

    public Category getCategory(Long id);

    public List<Category> getAllCategories();

    public List<Product> getProductsByCategory(Long id);
}
