package emcon.services;

import emcon.App;
import emcon.domain.MedicalInformation;
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
public class MedicalInformationServiceTest extends AbstractTestNGSpringContextTests{

    @Autowired
    private MedicalInformationService service;

    @Autowired
    private MedicalInformationService repository;
    private List<MedicalInformation> medicalInformations;
    @BeforeMethod
    public void setUp() throws Exception {
        medicalInformations = new ArrayList<MedicalInformation>();
    }

    @Test
    public void create() throws Exception {

    }

    @Test
    public void testGetMedicalInformation() throws Exception {

        List<MedicalInformation> medicalInformations = service.getMedicalInformation();
        Assert.assertTrue(medicalInformations.size() == 2);
    }
}