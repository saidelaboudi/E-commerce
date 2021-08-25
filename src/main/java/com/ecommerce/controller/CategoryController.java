package com.ecommerce.controller;

import com.ecommerce.model.Category;
import com.ecommerce.model.Product;
import com.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping(value = "/addCategory")
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }
    @GetMapping(value="/getCategory/{id}")
    public Category getCategory(Long id){
        return categoryService.getCategory(id);
    }
    @DeleteMapping(value = "/delCategory/{id}")
    public void removeCategory(Long id){
        categoryService.delete(id);
    }
    @GetMapping
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
    @GetMapping("/{id}")// Category id
    public List<Product> getProductsByCategory(@PathVariable Long id){
        return categoryService.getProductsByCategory(id);
    }
}
