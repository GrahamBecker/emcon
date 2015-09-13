package emcon.repository;

import emcon.App;
import emcon.domain.User;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;


/**
 * Created by graham on 2015/05/03.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestCrudUser extends AbstractTestNGSpringContextTests{

    private Long regNo;

    @Autowired
    UserRepository repository;
    @Test
    public void create() throws Exception {
        System.out.println("Hello World");
        User user = new User.Builder(8000L).firstName("Graham").lastName("Becker").dob("20/11/1984").address("15 Oranje Street").contact("graham@fang.co.za").build();
        repository.save(user);
        regNo=user.getRegNo();
        Assert.assertNotNull(user.getRegNo());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        User user = repository.findOne(regNo);
        Assert.assertEquals("Graham", user.getFirstName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        User user = repository.findOne(regNo);
        User newUser = new User.Builder(8001L).firstName("Steven").lastName("Jones").dob("1 January 1990").address("16 Brian Street").contact("steven@brianstreet.co.za").build();
        repository.save(newUser);

        User updatedUser = repository.findOne(regNo);

        Assert.assertEquals("Steven", updatedUser.getFirstName());

    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        User user = repository.findOne(regNo);
        repository.delete(user);
        User newUser = repository.findOne(regNo);
        Assert.assertNull(newUser);

    }

}