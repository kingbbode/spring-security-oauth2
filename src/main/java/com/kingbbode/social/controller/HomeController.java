package com.kingbbode.social.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by YG-MAC on 2016. 12. 9..
 */
@RestController
public class HomeController {

    @GetMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
