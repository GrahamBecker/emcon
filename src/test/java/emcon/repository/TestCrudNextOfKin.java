package emcon.repository;

import emcon.App;
import emcon.domain.NextOfKin;
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
public class TestCrudNextOfKin {

    private String relationship;

    @Autowired
    NextOfKinRepository repository;

    @Test
    public void testCreate() throws Exception {

        NextOfKin NOK = new NextOfKin
                .Builder("Brother")
                .build();

        repository.save(NOK);

        relationship = NOK.getRelationship();

        Assert.assertNotNull(NOK.getRelationship());
    }

    @Test
    public void testRead() throws Exception {
        NextOfKin NOK = repository.findOne(relationship);
        Assert.assertEquals("Brother",NOK.getRelationship());
    }
    @Test
    public void testUpdate() throws Exception {

        NextOfKin NOK = repository.findOne(relationship);

        NextOfKin newNOK = new NextOfKin
                .Builder("Wife")
                .build();

        repository.save(newNOK);

        Assert.assertEquals("Wife", newNOK.getRelationship());

    }
    @Test
    public void testDelete() throws Exception {

        NextOfKin NOK = repository.findOne(relationship);

        repository.delete(NOK);
        NextOfKin newNOK = repository.findOne(relationship);
        Assert.assertNull(newNOK);
    }
}