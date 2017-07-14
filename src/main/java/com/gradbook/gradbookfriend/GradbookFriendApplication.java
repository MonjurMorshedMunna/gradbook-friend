package com.gradbook.gradbookfriend;

import com.gradbook.gradbookfriend.user.User;
import com.gradbook.gradbookfriend.user.UserRepository;
import com.gradbook.gradbookfriend.userfriend.helper.UserFriendResourceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@SpringBootApplication
@EnableCaching
@RestController
public class GradbookFriendApplication {


    @Autowired
    UserRepository userRepository;

    @GetMapping("/all")
    public String fromAll(){
        return "This is from all.";
    }

    @RequestMapping("/user")
    public User getUserInfo(Principal principal){
        return userRepository.findOne(Long.parseLong(principal.getName()));
    }
    @RequestMapping("/resource")
    public String userInfo(Principal principal){
        System.out.println(principal);
        return "Welcome "+principal.getName()+", this is from the protected resource server";
    }

	public static void main(String[] args) {
		SpringApplication.run(GradbookFriendApplication.class, args);
	}
}
