package com.ecommerce.service;

import com.ecommerce.model.Category;

public interface CategoryService {
    public void addCategory(Category category);

    public void delete(Long id);

    public Category getCategory(Long id);
}
