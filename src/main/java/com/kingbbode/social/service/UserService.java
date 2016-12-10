package com.kingbbode.social.service;

import com.kingbbode.social.enums.SocialType;
import com.kingbbode.social.model.User;
import com.kingbbode.social.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by YG-MAC on 2016. 12. 11..
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveOrUpdate(SocialType type) {
        Map<String, String> data = (Map<String, String>) ((OAuth2Authentication) SecurityContextHolder.getContext().getAuthentication())
                .getUserAuthentication().getDetails();
        if (data.containsKey("id")) {
            String id = data.get("id");
            String name = data.get("name");

            User user = userRepository.findByIdAndType(data.get("id"), type);
            if (user != null) {
                user.update(name);
            } else {
                user = new User(id, name, type);
            }

            userRepository.save(user);
        }
    }
}
