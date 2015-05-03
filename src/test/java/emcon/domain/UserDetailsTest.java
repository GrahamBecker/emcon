package emcon.domain;

import emcon.conf.factory.UserDetailsFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.TestExecutionListeners;

/**
 * Created by graham on 2015/05/03.
 */
public class UserDetailsTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testUserDetails() throws Exception {

        UserDetails userDet = UserDetailsFactory.createUserDetails("B258");

        Assert.assertEquals("B258", userDet.getEmconNo());


    }
}
