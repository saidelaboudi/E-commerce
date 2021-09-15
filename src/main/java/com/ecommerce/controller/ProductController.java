package com.ecommerce.controller;

import com.ecommerce.model.Image;
import com.ecommerce.model.Product;
import com.ecommerce.service.ImageService;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ImageService imageService;

    @PostMapping(value = "/newProduct")
    public Product newProduct(@RequestBody Product product){
        return productService.newProduct(product);
    }
    @PutMapping(value="/{id}")
    public void addImageToProduct(@PathVariable Long id , @RequestBody MultipartFile file){
        Product product = productService.getProduct(id);
        Image image = Image.buildImage(file);
        product.setImage(image);
        productService.newProduct(product);
    }
    @GetMapping("/{id}/images")
    public ResponseEntity<byte[]> getImage(@PathVariable Long id) throws Exception {
        Product product = productService.getProduct(id);
        Image image = product.getImage();
        return ResponseEntity.ok().contentType(MediaType.valueOf(image.getFileType())).body(image.getData());
    }
    @GetMapping(value = "/{id}")
    public Product getProduct(Long id){
        return productService.getProduct(id);
    }
    @DeleteMapping(value = "/remove/{id]")
    public void removeProduct(Long id){
        productService.remove(id);
    }
    @GetMapping("/all")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/category/{id}")
    public List<Product> getProductsByCatedory(@PathVariable Long id){
        return productService.getProductsByCatedory(id);
    }
    @PutMapping("/update")
    public void updateProduct(@RequestBody Product product){
        productService.newProduct(product);
    }
    @PutMapping("/{id}/setBestSelling")
    public void setBestSelling(@PathVariable Long id , boolean isBestSelling){
        productService.setBestSelling(id , isBestSelling);
    }
}
