package com.kingbbode.social.enums;

/**
 * Created by YG-MAC on 2016. 12. 9..
 */
public enum  SocialType {
    FACEBOOK("facebook"),
    TWITTER("twitter");

    private String url;

    SocialType(String url) {
        this.url = "/login/" + url;
    }

    public String getUrl() {
        return url;
    }
}
