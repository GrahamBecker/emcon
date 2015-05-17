package emcon.repository;

import emcon.domain.User;
import junit.framework.TestCase;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by graham on 2015/05/17.
 */
public class UserRepositoryTest extends TestCase {

    @Autowired
    UserRepository repository;

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testFindByCode() throws Exception {

        User user = new User.Builder(8000L).firstName("Graham").lastName("Becker").dob("20/11/1984").build();

        repository.save(user);

        Assert.assertNotNull(user.getRegNo());

        //user = repository.findOne(user.getRegNo());
        //Assert.assertEquals("Graham", user.getFirstName());
    }
}