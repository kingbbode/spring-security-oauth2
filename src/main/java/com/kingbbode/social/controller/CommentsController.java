package com.kingbbode.social.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.impl.FacebookTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by YG-MAC on 2016. 12. 14..
 */
@Controller
@RequestMapping(value = "comments")
public class CommentsController {
    @PostMapping
    public ResponseEntity<String> save(OAuth2ClientContext context){
        Facebook facebook = new FacebookTemplate(context.getAccessToken().getValue());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
