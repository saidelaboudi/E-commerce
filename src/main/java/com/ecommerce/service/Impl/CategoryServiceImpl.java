package com.ecommerce.service.Impl;

import com.ecommerce.model.Category;
import com.ecommerce.repository.CategoryRepository;
import com.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void delete(Long id) {
        Category category = this.getCategory(id);
        if(category!=null)
            categoryRepository.delete(category);
    }

    @Override
    public Category getCategory(Long id) {
        return categoryRepository.findById(id).get();
    }
}
