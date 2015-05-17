package emcon.services;

import emcon.App;
import emcon.conf.factory.ContactInformationFactory;
import emcon.domain.ContactInformation;
import emcon.repository.ContactInformationRepository;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by graham on 2015/05/17.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
    public class ContactInformationServiceTest extends AbstractTestNGSpringContextTests{

    private String id;

    @Autowired
        private ContactInformationService service;

        @Autowired
        private ContactInformationRepository repository;
        private List<ContactInformation> contactInformations;
        @BeforeMethod
        public void setUp() throws Exception {
            contactInformations = new ArrayList<ContactInformation>();
        }

    @Test
    public void create() throws Exception {

        ContactInformation contactInformation = ContactInformationFactory.
                createContactInformation("082123456","0219051234","test@test.com","test.skype");
        ContactInformation spouseInformation = ContactInformationFactory.
                createContactInformation("07198765431", "011987456", "test2@test2.com", "test2.skype");

        repository.save(contactInformation);
        id=contactInformation.getCellNumber();
        Assert.assertNotNull(contactInformation.getCellNumber());
    }

    @Test
    public void testGetContactInformation() throws Exception {

        List<ContactInformation> contactInformation = service.getContactInformation();
        Assert.assertTrue(contactInformation.size() == 2);
    }
}