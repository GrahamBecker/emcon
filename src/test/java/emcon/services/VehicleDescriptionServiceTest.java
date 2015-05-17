package emcon.services;

import emcon.App;
import emcon.domain.VehicleDescription;
import emcon.repository.VehicleDescriptionRepository;
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
public class VehicleDescriptionServiceTest extends AbstractTestNGSpringContextTests{

    private Long regNo;

    @Autowired
    private VehicleDescriptionService service;

    @Autowired
    private VehicleDescriptionRepository repository;
    private List<VehicleDescription> vehicleDescriptions;
    @BeforeMethod
    public void setUp() throws Exception {
        vehicleDescriptions = new ArrayList<VehicleDescription>();
    }

    @Test
    public void create() throws Exception {

    }

    @Test
    public void testGetVehicleDescription() throws Exception {

        List<VehicleDescription> vehicleDescriptions = service.getVehicleDescription();
        Assert.assertTrue(vehicleDescriptions.size() == 2);
    }
}