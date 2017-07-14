package com.gradbook.gradbookfriend.controllers;

import com.gradbook.gradbookfriend.user.User;
import com.gradbook.gradbookfriend.user.UserRepository;
import java.security.Principal;
import java.util.List;

import com.gradbook.gradbookfriend.userfriend.helper.UserFriendResourceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Munna on 10-Jul-17.
 */
@RestController
public class UserFriendResource {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserFriendResourceHelper helper;


    @GetMapping("userFriend/existingFriends")
    public List<User> getExistingFriends(Principal principal){
        return helper.getExistingFriends(principal);
    }

    @GetMapping("userFriend/friendSuggestion")
    public List<User> getFriendSuggestion(Principal principal){
        return helper.getFriendSuggestion(principal);
    }

    @PostMapping("userFriend/saveFriends")
    ResponseEntity<?> saveFriends(Principal principal,@RequestBody List<User> users){
        return helper.saveFriends(principal, users);
    }

}
