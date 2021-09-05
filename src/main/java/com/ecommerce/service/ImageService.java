package com.ecommerce.service;

import com.ecommerce.model.Image;

public interface ImageService {

	public Image save(Image image);

	public Image findByFileName(String fileName);

}
