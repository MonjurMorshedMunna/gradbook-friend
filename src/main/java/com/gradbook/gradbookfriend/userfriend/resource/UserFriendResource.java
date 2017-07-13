package com.gradbook.gradbookfriend.userfriend.resource;

import com.gradbook.gradbookfriend.user.User;
import com.gradbook.gradbookfriend.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Munna on 10-Jul-17.
 */
public class UserFriendResource extends MutableUserFriendResource{

    @Autowired
    UserRepository userRepository;

    @GetMapping("/all")
    public User getAll(){
        return userRepository.getOne(1L);
    }
}
