package emcon.services;

import emcon.App;
import emcon.domain.PreferredContactMethod;
import emcon.repository.PreferredContactMethodRepository;
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
public class PreferredContactMethodServiceTest extends AbstractTestNGSpringContextTests{

    @Autowired
    private PreferredContactMethodService service;

    @Autowired
    private PreferredContactMethodRepository repository;
    private List<PreferredContactMethod> preferredContactMethods;
    @BeforeMethod
    public void setUp() throws Exception {
        preferredContactMethods = new ArrayList<PreferredContactMethod>();
    }

    @Test
    public void create() throws Exception {

    }

    @Test
    public void testGetPreferredContactMethod() throws Exception {

        List<PreferredContactMethod> preferredContactMethods = service.getPreferredContactMethod();
        Assert.assertTrue(preferredContactMethods.size() == 2);
    }
}