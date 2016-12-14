package com.kingbbode.social.common;

import com.kingbbode.social.enums.SocialType;
import org.springframework.social.ApiBinding;
import org.springframework.social.facebook.api.impl.FacebookTemplate;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

/**
 * Created by YG_king on 2016-12-14.
 */
public class SocialTemplateFactory {
    private ApiBinding apiBinding;

    public SocialTemplateFactory(String accessToken, SocialType socialType) {
        if (SocialType.FACEBOOK.equals(socialType)) {
            apiBinding = new FacebookTemplate(accessToken);
        } else if (SocialType.TWITTER.equals(socialType)) {
            apiBinding = new TwitterTemplate(accessToken);
        }
    }

    public ApiBinding currentApi() {
        return this.apiBinding;
    }
}
