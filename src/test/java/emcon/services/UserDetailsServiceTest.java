package emcon.services;

import emcon.App;
import emcon.domain.UserDetails;
import emcon.repository.UserDetailsRepository;
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
public class UserDetailsServiceTest extends AbstractTestNGSpringContextTests{

    private Long regNo;

    @Autowired
    private UserDetailsService service;

    @Autowired
    private UserDetailsRepository repository;
    private List<UserDetails> userDetailses;
    @BeforeMethod
    public void setUp() throws Exception {
        userDetailses = new ArrayList<UserDetails>();
    }

    @Test
    public void create() throws Exception {

    }

    @Test
    public void testGetUserDetails() throws Exception {

        List<UserDetails> userDetailses = service.getUserDetails();
        Assert.assertTrue(userDetailses.size() == 2);
    }
}