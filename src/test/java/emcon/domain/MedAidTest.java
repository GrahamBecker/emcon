package emcon.domain;

import emcon.conf.factory.MedAidFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by graham on 2015/05/03.
 */
public class MedAidTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testMedAid() throws Exception {

        MedAid medAid = MedAidFactory.createMedAid("A0241", "Discovery Health", "+27218441234");

        Assert.assertEquals("A0241", medAid.getMedAidNo());
        Assert.assertEquals("Discovery Health", medAid.getMedAidCompany());
        Assert.assertEquals("+27218441234", medAid.getMedAidContact());
    }
}