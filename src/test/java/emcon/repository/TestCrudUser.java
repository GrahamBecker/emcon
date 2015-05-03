package emcon.repository;

        import emcon.App;
        import emcon.domain.User;
        import org.junit.Assert;
        import org.junit.Test;
        import org.junit.runner.RunWith;
     //   import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.SpringApplicationConfiguration;
        import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
        import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by graham on 2015/05/03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestCrudUser {

    String regNo;

    //@Autowired
    UserRepository repository;

    @Test
    public void testCreate() throws Exception {

        User user = new User
                .Builder("C8001")
                .firstName("Graham")
                .lastName("Becker")
                .dob("20/11/1984")
                .build();

        repository.save(user);

        regNo = user.getRegNo();

        Assert.assertNotNull(user.getRegNo());
    }
    /*
    @Test
    public void testRead() throws Exception {
        User user = repository.findOne(regNo);
        Assert.assertEquals("Graham",user.getFirstName());
    }
    @Test
    public void testUpdate() throws Exception {

       // User user = repository.findOne(regNo);

        User newUser = new User
                .Builder("C8002")
                .firstName("Chuck")
                .lastName("Norris")
                .dob("01/01/1950")
                .build();

        repository.save(newUser);

        Assert.assertEquals("C8002", newUser.getRegNo());
        Assert.assertEquals("Graham",newUser.getFirstName());
        Assert.assertEquals("Becker",newUser.getLastName());
        Assert.assertEquals("20/11/1984",newUser.getDob());
    }
    @Test
    public void testDelete() throws Exception {

        User user = repository.findOne(regNo);

        repository.delete(user);
        User newUser = repository.findOne(regNo);
        Assert.assertNull(newUser);
    }*/
}