package com.kingbbode.social.config;

import com.kingbbode.social.common.SocialTemplateFactory;
import com.kingbbode.social.enums.SocialType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

/**
 * Created by YG_king on 2016-12-14.
 */
@Configuration
public class ApplicationConfig {

    @Bean
    @Scope(value = "request", proxyMode = ScopedProxyMode.INTERFACES)
    public SocialTemplateFactory socialTemplateFactory(OAuth2ClientContext oAuth2ClientContext){
        return new SocialTemplateFactory(
                oAuth2ClientContext.getAccessToken().getValue(),
                SocialType.valueOf(SecurityContextHolder.getContext().getAuthentication().getAuthorities().iterator().next().toString())
        );
    }
}
