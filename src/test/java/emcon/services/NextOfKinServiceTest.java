package emcon.services;

import emcon.App;
import emcon.domain.NextOfKin;
import emcon.repository.NextOfKinRepository;
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
public class NextOfKinServiceTest extends AbstractTestNGSpringContextTests{


    @Autowired
    private NextOfKinService service;

    @Autowired
    private NextOfKinRepository repository;
    private List<NextOfKin> nextOfKins;
    @BeforeMethod
    public void setUp() throws Exception {
        nextOfKins = new ArrayList<NextOfKin>();
    }

    @Test
    public void create() throws Exception {

    }

    @Test
    public void testGetNextOfKin() throws Exception {

        List<NextOfKin> nextOfKins = service.getNextOfKin();
        Assert.assertTrue(nextOfKins.size() == 2);
    }
}