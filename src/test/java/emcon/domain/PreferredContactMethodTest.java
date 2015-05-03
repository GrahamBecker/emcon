package emcon.domain;

import emcon.conf.factory.PreferredContactMethodFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by graham on 2015/05/03.
 */
public class PreferredContactMethodTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testPreferredContactMethod() throws Exception {

        PreferredContactMethod prefCont = PreferredContactMethodFactory.createPreferredContactMethod("Email");

        Assert.assertEquals("Email", prefCont.getContactMethod());


    }
}
