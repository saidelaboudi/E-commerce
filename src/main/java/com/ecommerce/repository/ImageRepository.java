package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {

    Image findByFileName(String fileName);


}