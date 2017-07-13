package com.gradbook.gradbookfriend.userfriend;

import com.gradbook.gradbookfriend.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Munna on 10-Jul-17.
 */
@Entity
@Table(name="user_friend")
public class UserFriend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="user_id")
    private Long userId;


    @Column(name="friend_id")
    private Long friendId;

    @Column(name="last_modified")
    private Timestamp lastModified;

    public UserFriend(){

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFriendId() {
        return friendId;
    }

    public void setFriendId(Long friendId) {
        this.friendId = friendId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getLastModified() {
        return lastModified;
    }

    public void setLastModified(Timestamp lastModified) {
        this.lastModified = lastModified;
    }
}
