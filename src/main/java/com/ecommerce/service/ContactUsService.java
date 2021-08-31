package com.ecommerce.service;

import com.ecommerce.model.ContactUs;

public interface ContactUsService {
    public void save(ContactUs contactUs);

    public ContactUs getContactUs();

    public void update(ContactUs contactUs);
}
