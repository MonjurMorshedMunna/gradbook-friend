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

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="friend_id")
    private User friend;

    @Column(name="last_modified")
    private Timestamp lastModified;

    public UserFriend(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getFriend() {
        return friend;
    }

    public void setFriend(User friend) {
        this.friend = friend;
    }

    public Timestamp getLastModified() {
        return lastModified;
    }

    public void setLastModified(Timestamp lastModified) {
        this.lastModified = lastModified;
    }
}
