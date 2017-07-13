package com.gradbook.gradbookfriend.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * Created by Munna on 10-Jul-17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    @Query("select u from User u  where u.id not in ?1")
    List<User> findByIdWithoutFriends(Collection<Long> userId);

    List<User> findByEmailNotIn(String email);

    List<User> findByEmailNotIn(List<String> email);


}
