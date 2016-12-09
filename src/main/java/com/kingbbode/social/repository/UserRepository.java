package com.kingbbode.social.repository;

import com.kingbbode.social.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by YG-MAC on 2016. 12. 9..
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
