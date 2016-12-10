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
    private String id;

    @Column(nullable = false)
    private String name;

    private boolean deleted;


    public User() {

    }

    public User(String id, String name, SocialType type) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.deleted = false;
    }

    public boolean isActivated() {
        return !this.deleted;
    }

    public void update(String name){
        this.name = name;
    }
}
