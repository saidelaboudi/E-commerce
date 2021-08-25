package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Image;
import com.ecommerce.payload.ImageResponse;

public interface ImageService {

	public Image save(Image image);

	public Image findByFileName(String fileName);

	public Image findByUuid(String uuid);
	
	public List<ImageResponse> findAllImageResponse();

}
