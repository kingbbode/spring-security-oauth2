package com.kingbbode.social.common;

import com.kingbbode.social.enums.SocialType;
import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.List;
import java.util.Map;

/**
 * Created by YG-MAC on 2016. 12. 12..
 */
public class UserTokenServices extends UserInfoTokenServices
{
    public UserTokenServices(ClientResources client, SocialType type)
    {
        super(client.getResource().getUserInfoUri(), client.getClient().getClientId());
        setAuthoritiesExtractor(new OAuth2AuthoritiesExtractor(type));
    }

    public static class OAuth2AuthoritiesExtractor implements AuthoritiesExtractor
    {
        private final SocialType type;

        public OAuth2AuthoritiesExtractor(SocialType type){
            this.type = type;
        }

        @Override
        public List<GrantedAuthority> extractAuthorities(Map<String, Object> map)
        {
            return AuthorityUtils.createAuthorityList(this.type.toString());
        }
    }
}
