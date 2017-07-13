package com.gradbook.gradbookfriend.userfriend.helper;

import com.gradbook.gradbookfriend.user.User;
import com.gradbook.gradbookfriend.user.UserRepository;
import com.gradbook.gradbookfriend.userfriend.UserFriend;
import com.gradbook.gradbookfriend.userfriend.UserFriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Munna on 10-Jul-17.
 */
@Component
public class UserFriendResourceHelper {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserFriendRepository userFriendRepository;

    List<User> getFriends(Principal principal){
        User user = userRepository.findByEmail(principal.getName());
        List<UserFriend> userFriends = userFriendRepository.findByUserId(user.getId());
        List<User> users = new ArrayList<>();
        for(UserFriend userFriend: userFriends){
            User usersFriend = userRepository.findOne(userFriend.getFriendId());
            usersFriend.setPassword("");
            users.add(usersFriend);
        }
        return users;
    }
}
