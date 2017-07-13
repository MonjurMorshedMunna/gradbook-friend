package com.gradbook.gradbookfriend.userfriend;

import com.gradbook.gradbookfriend.user.User;
import com.gradbook.gradbookfriend.userfriend.UserFriend;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Munna on 10-Jul-17.
 */
@Repository
public interface UserFriendRepository extends JpaRepository<UserFriend, Long> {
    @Cacheable
    List<UserFriend> findByUserId(Long userId);
}
