package emcon.domain;

import emcon.conf.factory.UniqueIdentifiersFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by graham on 2015/05/03.
 */
public class UniqueIdentifiersTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testUniqueIdentifiers() throws Exception {

        UniqueIdentifiers unIdent = UniqueIdentifiersFactory.createUniqueIdentifiers("841120", "CF1234", "None");

        Assert.assertEquals("841120", unIdent.getIdNo());
        Assert.assertEquals("CF1234", unIdent.getVehicleReg());
        Assert.assertEquals("None", unIdent.getImeiNumber());

    }
}
