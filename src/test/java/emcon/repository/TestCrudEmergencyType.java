package emcon.repository;

import emcon.App;
import emcon.domain.EmergencyType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by graham on 2015/05/03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestCrudEmergencyType {

    private String description;

    @Autowired
    EmergencyTypeRepository repository;

    @Test
    public void testCreate() throws Exception {

        EmergencyType eType = new EmergencyType
                .Builder("Car Accident")
                .ice("Phone next of kin")
                .build();

        repository.save(eType);

        description = eType.getDescription();

        Assert.assertNotNull(eType.getDescription());
    }

    @Test
    public void testRead() throws Exception {
        EmergencyType eType = repository.findOne(description);
        Assert.assertEquals("Car Accident",eType.getDescription());
    }
    @Test
    public void testUpdate() throws Exception {

        EmergencyType eType = repository.findOne(description);

        EmergencyType newEType = new EmergencyType
                .Builder("Unknown")
                .ice("Phone hospital")
                .build();

        repository.save(newEType);

        Assert.assertEquals("Unknown", newEType.getDescription());
        Assert.assertEquals("Phone hospital",newEType.getIce());

    }
    @Test
    public void testDelete() throws Exception {

        EmergencyType eType = repository.findOne(description);

        repository.delete(eType);
        EmergencyType newEType = repository.findOne(description);
        Assert.assertNull(newEType);
    }
}