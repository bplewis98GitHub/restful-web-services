package com.brandon.rest.web.service.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {
    //retrieveAllUsers
    //retrieveUser(int id)

    @Autowired
    private UserDaoService service;

    @GetMapping("/users")
    public List<User> users(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(int id){
        return service.findOne(id);
    }
}
