package emcon.repository;

import emcon.App;
import emcon.domain.PreferredContactMethod;
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
public class TestCrudPreferredContactMethod {

    private String contactMethod;

    @Autowired
    PreferredContactMethodRepository repository;

    @Test
    public void testCreate() throws Exception {

        PreferredContactMethod conInfo = new PreferredContactMethod
                .Builder("Email")
                .build();

        repository.save(conInfo);

        contactMethod = conInfo.getContactMethod();

        Assert.assertNotNull(conInfo.getContactMethod());
    }

    @Test
    public void testRead() throws Exception {
        PreferredContactMethod conInfo = repository.findOne(contactMethod);
        Assert.assertEquals("Email",conInfo.getContactMethod());
    }
    @Test
    public void testUpdate() throws Exception {

        PreferredContactMethod conInfo = repository.findOne(contactMethod);

        PreferredContactMethod newConInfo = new PreferredContactMethod
                .Builder("Phone")
                .build();

        repository.save(newConInfo);

        Assert.assertEquals("Phone", newConInfo.getContactMethod());


    }
    @Test
    public void testDelete() throws Exception {

        PreferredContactMethod conInfo = repository.findOne(contactMethod);

        repository.delete(conInfo);
        PreferredContactMethod newConInfo = repository.findOne(contactMethod);
        Assert.assertNull(newConInfo);
    }
}