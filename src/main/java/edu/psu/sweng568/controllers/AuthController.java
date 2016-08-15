package edu.psu.sweng568.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.psu.sweng568.models.LoginInfo;
import edu.psu.sweng568.models.User;
import edu.psu.sweng568.services.UserService;

/**
 * Created by hshekhar on 15/8/16.
 */
@Controller
@RequestMapping(path = "api/{version}/authenticate")
public class AuthController
{
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST,
                    produces = MediaType.APPLICATION_JSON_VALUE,
                    consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User getAuthenticatedUser(@RequestBody LoginInfo loginInfo) {

        return userService.findUserWithLoginCredential(loginInfo);
    }
}
