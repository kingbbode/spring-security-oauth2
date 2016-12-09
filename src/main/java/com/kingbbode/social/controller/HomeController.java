package com.kingbbode.social.controller;

import com.kingbbode.social.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by YG-MAC on 2016. 12. 9..
 */
@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
