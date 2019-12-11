package com.lw.microservicesimpleprovideruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lw.microservicesimpleprovideruser.bean.User;
import com.lw.microservicesimpleprovideruser.repository.UserRepository;

/**
 * @author liwei-4
 * @description:
 * @date 2019-12-06
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = userRepository.getOne(id);
        System.out.println(user);
        return user;
    }
}
