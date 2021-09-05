package com.ecommerce.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Image;
import com.ecommerce.repository.ImageRepository;
import com.ecommerce.service.ImageService;

@Service
public class ImageServiceImpl implements ImageService {

	@Autowired
	private ImageRepository imageRepository;

	@Override
	public Image save(Image image) throws NullPointerException {
		return imageRepository.save(image);
	}

	@Override
	public Image findByFileName(String fileName) {
		return this.imageRepository.findByFileName(fileName);
	}

}
