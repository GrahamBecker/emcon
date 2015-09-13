package emcon.api;

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
}
