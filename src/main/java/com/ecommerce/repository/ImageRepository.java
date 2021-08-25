package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Image;
import com.ecommerce.payload.ImageResponse;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {

	Image findByFileName(String fileName);

	Image findByUuid(String uuid);

	@Query(value = "select new com.ecommerce.payload.ImageResponse(im.uuid, im.fileName, im.fileType, im.size) from com.ecommerce.model.Image im where im.status=true", nativeQuery = false)
	List<ImageResponse> findAllImageResponse();

}