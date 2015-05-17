package emcon.services;

import emcon.App;
import emcon.domain.User;
import emcon.repository.UserRepository;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by graham on 2015/05/17.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class UserServiceTest extends AbstractTestNGSpringContextTests{

    private Long regNo;

    @Autowired
    private UserService service;

    @Autowired
    private UserRepository repository;
    private List<User> users;
    @BeforeMethod
    public void setUp() throws Exception {
        users = new ArrayList<User>();
    }

    @Test
    public void create() throws Exception {

    }

    @Test
    public void testGetUsers() throws Exception {

        List<User> users = service.getUsers();
        Assert.assertTrue(users.size() == 2);
    }
}