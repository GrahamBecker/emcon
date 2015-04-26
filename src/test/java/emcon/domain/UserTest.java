package emcon.domain;

import emcon.conf.factory.UserFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.TestExecutionListeners;

/**
 * Created by graham on 2015/04/26.
 */
public class UserTest {
    @Before
    public void setUp() throws Exception{

    }

    @Test
    public void testCreateUser() throws Exception{

        User user = UserFactory.createUser(12345,"Graham","Becker","20/11/1984");

        Assert.assertEquals(12345,user.getRegNo());
        Assert.assertEquals("Graham",user.getFirstName());
        Assert.assertEquals("Becker",user.getLastName());
        Assert.assertEquals("20/11/1984",user.getDob());

    }

}
