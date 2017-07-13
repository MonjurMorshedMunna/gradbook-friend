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
 * Created by Munna on 13-Jul-17.
 */
@Component
public class UserFriendResourceHelper {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserFriendRepository userFriendRepository;

    public List<User> getExistingFriends(Principal principal){
        User user = userRepository.findOne(Long.parseLong(principal.getName()));
        List<UserFriend> friends = userFriendRepository.findByUserId(user.getId());
        List<User> users = new ArrayList<>();
        for(UserFriend friend: friends){
            User friendUser = userRepository.findOne(friend.getFriendId());
            friendUser.setPassword("");
            users.add(friendUser);
        }
        return users;
    }

    public List<User> getFriendSuggestion(Principal principal){
        User user = userRepository.findOne(Long.parseLong(principal.getName()));
        List<UserFriend> friends = userFriendRepository.findByUserId(user.getId());
        List<User> users = new ArrayList<>();

        if(friends.size()==0){
            return userRepository.findByEmailNotIn(user.getEmail());
        }else{
            List<Long> userIds = new ArrayList<>();
            List<String> emails = new ArrayList<>();
            for(UserFriend friend: friends){
                User friendUser = userRepository.getOne(friend.getFriendId());
                userIds.add(friend.getFriendId());
                emails.add(friendUser.getEmail());
            }
            users = userRepository.findByEmailNotIn(emails);
            return users;
        }

    }

}
