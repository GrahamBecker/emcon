package emcon.domain;

import emcon.conf.factory.VehicleDescriptionFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by graham on 2015/05/03.
 */
public class VehicleDescriptionTest {

    @Before
    public void setUp() throws Exception{

    }

    @Test
    public void testVehicleDescription() throws Exception{

        VehicleDescription vehDesc = VehicleDescriptionFactory.createVehicleDescription
                ("Toyota", "Camry", "White", 2004);

        Assert.assertEquals("Toyota", vehDesc.getVehMake());
        Assert.assertEquals("Camry",vehDesc.getVehModel());
        Assert.assertEquals("White",vehDesc.getVehColor());
        Assert.assertEquals(2004,vehDesc.getVehYear());

    }
}
