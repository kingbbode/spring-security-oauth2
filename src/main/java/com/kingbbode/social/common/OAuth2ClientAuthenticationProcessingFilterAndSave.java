package com.kingbbode.social.common;

import com.kingbbode.social.enums.SocialType;
import com.kingbbode.social.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.filter.OAuth2ClientAuthenticationProcessingFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by YG-MAC on 2016. 12. 10..
 */
public class OAuth2ClientAuthenticationProcessingFilterAndSave extends OAuth2ClientAuthenticationProcessingFilter {
    @Autowired
    UserRepository userRepository;

    private final SocialType type;

    public OAuth2ClientAuthenticationProcessingFilterAndSave(SocialType type, String defaultFilterProcessesUrl) {
        super(defaultFilterProcessesUrl);
        this.type = type;
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        super.successfulAuthentication(request, response, chain, authResult);
        //save
    }
}
