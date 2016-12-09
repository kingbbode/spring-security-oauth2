package com.kingbbode.social.model;

import com.kingbbode.social.enums.SocialType;

import javax.persistence.*;

/**
 * Created by YG-MAC on 2016. 12. 9..
 */
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue
    private Long idx;

    @Column
    @Enumerated(EnumType.STRING)
    private SocialType type;

    @Column(unique = true, nullable = false)
    private String providerUserId;

    @Column(nullable = false)
    private String name;

    private boolean deleted;


    public User() {

    }

    public User(String providerUserId, String name, String type) {
        this.name = name;
        this.type = SocialType.valueOf(type.toUpperCase());
        this.providerUserId = providerUserId;
        this.deleted = false;
    }
}
