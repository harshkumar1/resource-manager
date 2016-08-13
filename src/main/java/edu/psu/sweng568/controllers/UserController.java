package edu.psu.sweng568.controllers;

import java.util.ArrayList;
import java.util.Collection;

import com.google.common.collect.Lists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.psu.sweng568.models.User;
import edu.psu.sweng568.services.UserService;

@Controller
@RequestMapping("api/{version}/users")
public class UserController
{
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Collection<User> getUsers()
    {
        Collection<User> users = Lists.newArrayList(userService.getAllUsers());
        return users;
    }


    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
