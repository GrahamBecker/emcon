package emcon.repository;

import emcon.App;
import emcon.domain.UserDetails;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by graham on 2015/05/03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestCrudUserDetails {

    private String emconNo;

    @Autowired
    UserDetailsRepository repository;

    @Test
    public void testCreate() throws Exception {

        UserDetails uDet = new UserDetails
                .Builder("A0541")
                .build();

        repository.save(uDet);

        emconNo = uDet.getEmconNo();

        Assert.assertNotNull(uDet.getEmconNo());
    }

    @Test
    public void testRead() throws Exception {
        UserDetails uDet = repository.findOne(emconNo);
        Assert.assertEquals("A0541",uDet.getEmconNo());
    }
    @Test
    public void testUpdate() throws Exception {

        UserDetails uDet = repository.findOne(emconNo);

        UserDetails newUDet = new UserDetails
                .Builder("B5051")
                .build();

        repository.save(newUDet);

        Assert.assertEquals("B5051", newUDet.getEmconNo());

    }
    @Test
    public void testDelete() throws Exception {

        UserDetails uDet = repository.findOne(emconNo);

        repository.delete(uDet);
        UserDetails newUDet = repository.findOne(emconNo);
        Assert.assertNull(newUDet);
    }
}