package emcon.services;

import emcon.App;
import emcon.domain.UniqueIdentifiers;
import emcon.repository.UniqueIdentifiersRepository;
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
public class UniqueIdentifiersServiceTest extends AbstractTestNGSpringContextTests{

    private Long regNo;

    @Autowired
    private UniqueIdentifiersService service;

    @Autowired
    private UniqueIdentifiersRepository repository;
    private List<UniqueIdentifiers> uniqueIdentifierses;
    @BeforeMethod
    public void setUp() throws Exception {
        uniqueIdentifierses = new ArrayList<UniqueIdentifiers>();
    }

    @Test
    public void create() throws Exception {

    }

    @Test
    public void testGetUniqueIdentifiers() throws Exception {

        List<UniqueIdentifiers> uniqueIdentifierses = service.getUniqueIdentifiers();
        Assert.assertTrue(uniqueIdentifierses.size() == 2);
    }
}