package com.kingbbode.social.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by YG-MAC on 2016. 12. 11..
 */
@Controller
@RequestMapping(value = "/auth")
public class AuthController {

    @GetMapping("/{type}")
    public String auth(@PathVariable String type){
        return "redirect:/login/" + type;
    }

    @GetMapping("/complete")
    public String complete(){
        return "test";
    }
}
