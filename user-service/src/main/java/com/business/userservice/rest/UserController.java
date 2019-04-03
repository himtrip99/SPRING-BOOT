package com.business.userservice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping(path = "/getUserDetails/{id}/{name}")
    public String getUser(@PathVariable int id, @PathVariable String name) {
        return "Hello Mr."+ name + " your ID is "+id;
    }
}
