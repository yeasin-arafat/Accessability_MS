package com.bhm.user_management.controller;

import com.bhm.user_management.model.User;
import com.bhm.user_management.service.UserService;
import com.sun.xml.internal.ws.util.CompletedFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

/**
 * @author : arafat
 * @version : 1.0.0-snapshot
 * @description ...
 * @project : bhm
 * @since : 7/17/17
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @Async
    public CompletableFuture<Boolean> login(@RequestBody User user){

        boolean isValidUser = userService.login(user);

        return CompletableFuture.completedFuture(isValidUser);
    }

}
