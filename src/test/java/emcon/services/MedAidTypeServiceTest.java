package emcon.services;

import emcon.App;
import emcon.domain.MedAid;
import emcon.repository.MedAidRepository;
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
public class MedAidTypeServiceTest extends AbstractTestNGSpringContextTests {

    private Long regNo;

    @Autowired
    private MedAidTypeService service;

    @Autowired
    private MedAidRepository repository;
    private List<MedAid> medAids;

    @BeforeMethod
    public void setUp() throws Exception {
        medAids = new ArrayList<MedAid>();
    }

    @Test
    public void create() throws Exception {

    }

    @Test
    public void testGetMedAidType() throws Exception {

        List<MedAid> medAids = service.getMedAid();
        Assert.assertTrue(medAids.size() == 2);
    }
}