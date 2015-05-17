package emcon.repository;

import emcon.App;
import emcon.domain.ContactInformation;
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
public class TestCrudContactInformation {

    private String cellNumber;

    @Autowired
    private ContactInformationRepository repository;

    @Test
    public void testCreate() throws Exception {

        ContactInformation cI = new ContactInformation
                .Builder("+2782915123")
                .homeNumber("0219051234")
                .email("grahamcbecker@gmail.com")
                .skype("graham.becker.fang")
                .build();

        repository.save(cI);

        cellNumber = cI.getCellNumber();

        Assert.assertNotNull(cI.getCellNumber());
    }

    @Test
    public void testRead() throws Exception {
        ContactInformation cI = repository.findOne(cellNumber);
        Assert.assertEquals("+2782915123",cI.getCellNumber());
    }
    @Test
    public void testUpdate() throws Exception {

        ContactInformation cI = repository.findOne(cellNumber);

        ContactInformation newCI = new ContactInformation
                .Builder("+24916246")
                .homeNumber("011548963")
                .email("testemail@gmail.com")
                .skype("skype.address")
                .build();

        repository.save(newCI);

        Assert.assertEquals("+24916246", newCI.getCellNumber());
        Assert.assertEquals("011548963",newCI.getHomeNumber());
        Assert.assertEquals("testemail@gmail.com",newCI.getEmail());
        Assert.assertEquals("skype.address",newCI.getSkype());
    }
    @Test
    public void testDelete() throws Exception {

        ContactInformation cI = repository.findOne(cellNumber);

        repository.delete(cI);
        ContactInformation newCI = repository.findOne(cellNumber);
        Assert.assertNull(newCI);
    }
}