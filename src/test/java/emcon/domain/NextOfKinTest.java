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

        NextOfKin NOK = NextOfKinFactory.createNextOfKin("Brother");

        Assert.assertEquals("Brother", NOK.getRelationship());

    }
}
