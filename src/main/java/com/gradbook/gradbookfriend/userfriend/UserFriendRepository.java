package com.gradbook.gradbookfriend.userfriend;

import com.gradbook.gradbookfriend.userfriend.UserFriend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Munna on 10-Jul-17.
 */
@Repository
public interface UserFriendRepository extends JpaRepository<UserFriend, Long> {

}
