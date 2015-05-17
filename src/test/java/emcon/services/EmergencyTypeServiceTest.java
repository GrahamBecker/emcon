package emcon.services;

import emcon.App;
import emcon.conf.factory.ContactInformationFactory;
import emcon.conf.factory.EmergencyTypeFactory;
import emcon.domain.ContactInformation;
import emcon.domain.EmergencyType;
import emcon.repository.EmergencyTypeRepository;
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
public class EmergencyTypeServiceTest extends AbstractTestNGSpringContextTests {

    private String id;

    @Autowired
    private EmergencyTypeService service;

    @Autowired
    private EmergencyTypeRepository repository;
    private List<EmergencyType> emergencyTypes;

    @BeforeMethod
    public void setUp() throws Exception {
        emergencyTypes = new ArrayList<EmergencyType>();
    }

    @Test
    public void create() throws Exception {

        EmergencyType emergencyType = EmergencyTypeFactory.
                createEmergencyType("Car Accident", "Contact wife");
        EmergencyType emergencyType2 = EmergencyTypeFactory.
                createEmergencyType("Bicycle Accident", "Contact hospital");

        repository.save(emergencyType);
        id=emergencyType.getDescription();
        Assert.assertNotNull(emergencyType.getDescription());

    }

    @Test
    public void testGetEmergencyType() throws Exception {

        List<EmergencyType> emergencyTypes = service.getEmergencyType();
        Assert.assertTrue(emergencyTypes.size() == 2);
    }
}