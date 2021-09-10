package com.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@CrossOrigin
public class OAuth2Controller {
    @RequestMapping("user")
    @ResponseBody
    public Principal getUser(Principal principal){
        return principal;
    }
}
