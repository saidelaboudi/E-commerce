package com.ecommerce.controller;

import com.ecommerce.model.ContactUs;
import com.ecommerce.service.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contactUs")
@CrossOrigin
public class ContactUsController {
    @Autowired
    private ContactUsService contactUsService ;
    @PostMapping("/add")
    public void addContactUs(@RequestBody ContactUs contactUs){
        contactUsService.save(contactUs);
    }
    @GetMapping("/get")
    public ContactUs getContactUs(){
        return contactUsService.getContactUs();
    }
    @PostMapping("/update")
    public void updateContactUs(@RequestBody ContactUs contactUs){
        contactUsService.update(contactUs);
    }
}
