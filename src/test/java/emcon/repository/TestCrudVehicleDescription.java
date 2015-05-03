package emcon.repository;

import emcon.App;
import emcon.domain.VehicleDescription;
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
public class TestCrudVehicleDescription {

    private String vehMake;

    @Autowired
    VehicleDescriptionRepository repository;

    @Test
    public void testCreate() throws Exception {

        VehicleDescription vehD = new VehicleDescription
                .Builder("Toyota")
                .vehModel("Camry")
                .vehColor("White")
                .vehYear(1994)
                .build();

        repository.save(vehD);

        vehMake = vehD.getVehMake();

        Assert.assertNotNull(vehD.getVehColor());
    }

    @Test
    public void testRead() throws Exception {
        VehicleDescription vehD = repository.findOne(vehMake);
        Assert.assertEquals("Toyota",vehD.getVehMake());
    }
    @Test
    public void testUpdate() throws Exception {

        VehicleDescription vehD = repository.findOne(vehMake);

        VehicleDescription newVehD = new VehicleDescription
                .Builder("Hyundai")
                .vehModel("i20")
                .vehColor("Black")
                .vehYear(2012)
                .build();

        repository.save(newVehD);

        Assert.assertEquals("Hyundai", newVehD.getVehMake());
        Assert.assertEquals("i20",newVehD.getVehModel());
        Assert.assertEquals("Black", newVehD.getVehColor());
        Assert.assertEquals(2012, newVehD.getVehYear());

    }
    @Test
    public void testDelete() throws Exception {

        VehicleDescription vehD = repository.findOne(vehMake);

        repository.delete(vehD);
        VehicleDescription newVehD = repository.findOne(vehMake);
        Assert.assertNull(newVehD);
    }
}