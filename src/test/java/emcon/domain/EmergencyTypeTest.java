package emcon.domain;

import emcon.conf.factory.EmergencyTypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by graham on 2015/05/03.
 */
public class EmergencyTypeTest {

    @Before
    public void setUp() throws Exception{

    }

    @Test
    public void testEmergencyType() throws Exception{

        EmergencyType eType = EmergencyTypeFactory.createEmergencyType("Car Accident", "Phone next of kin");

        Assert.assertEquals("Car Accident", eType.getDescription());
        Assert.assertEquals("Phone next of kin",eType.getIce());


    }
}
