package com.ecommerce.service.Impl;

import com.ecommerce.model.ContactUs;
import com.ecommerce.repository.ContactUsRepository;
import com.ecommerce.service.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactUsServiceImpl implements ContactUsService {
    @Autowired
    private ContactUsRepository contactUsRepository ;
    @Override
    public void save(ContactUs contactUs) {
        contactUsRepository.save(contactUs);
    }

    @Override
    public ContactUs getContactUs() {
        return contactUsRepository.findAll().get(0);
    }

    @Override
    public void update(ContactUs contactUs) {
        contactUs.setId(getContactUs().getId());
        contactUsRepository.save(contactUs);
    }
}
