package emcon.domain;

import emcon.conf.factory.NextOfKinFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by graham on 2015/05/03.
 */
public class NextOfKinTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testNextOfKin() throws Exception {

        NextOfKin NOK = NextOfKinFactory.createNextOfKin("Brother", "Chris", "Becker", "021905123");

        Assert.assertEquals("Brother", NOK.getRelationship());
        Assert.assertEquals("Chris", NOK.getName());
        Assert.assertEquals("Becker", NOK.getSurname());
        Assert.assertEquals("021905123", NOK.getContact());

    }
}
