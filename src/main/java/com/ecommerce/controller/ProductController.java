package com.ecommerce.controller;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping(value = "/newProduct")
    public void newProduct(@RequestBody Product product){
        productService.newProduct(product);
    }
    @GetMapping(value = "/{id}")
    public Product getProduct(Long id){
        return productService.getProduct(id);
    }
    @DeleteMapping(value = "/remove/{id]")
    public void removeProduct(Long id){
        productService.remove(id);
    }
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/category/{id}")
    public List<Product> getProductsByCatedory(@PathVariable Long id){
        return productService.getProductsByCatedory(id);
    }
}
