package emcon.domain;

import emcon.conf.factory.ContactInformationFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by GrahamBecker on 2015/04/26.
 */
public class ContactInformationTest {
    @Before
    public void setUp() throws Exception{

    }

    @Test
    public void testCreateUser() throws Exception{

        ContactInformation cI = ContactInformationFactory.createContactInformation
                ("0829978749", "0219051204", "grahamcbecker@gmail.com", "graham.becker.fang");

        Assert.assertEquals("0829978749",cI.getCellNumber());
        Assert.assertEquals("0219051204",cI.getHomeNumber());
        Assert.assertEquals("grahamcbecker@gmail.com",cI.getEmail());
        Assert.assertEquals("graham.becker.fang",cI.getSkype());

    }

}