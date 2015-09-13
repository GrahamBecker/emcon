package emcon.api;

import emcon.domain.User;
import emcon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by graham on 2015/09/13.
 */

@RestController
@RequestMapping("/api/**")
public class HomePage {
    @Autowired
    private UserService service;
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String Index(){
        return "This is a home page";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUser(){
        User user = new User.Builder(8000L)
                .firstName("Graham")
                .lastName("Becker")
                .dob("20/11/1984")
                .address("15 Oranje Street")
                .contact("0219051204")
                .build();
        return user;
    }
}


