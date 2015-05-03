package emcon.repository;

import emcon.App;
import emcon.domain.MedAid;
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
public class TestCrudMedAid {

    private String medAidNo;

    @Autowired
    MedAidRepository repository;

    @Test
    public void testCreate() throws Exception {

        MedAid medA = new MedAid
                .Builder("A0241")
                .medAidCompany("Discovery Health")
                .medAidContact("+27218441234")
                .build();

        repository.save(medA);

        medAidNo = medA.getMedAidNo();

        Assert.assertNotNull(medA.getMedAidNo());
    }

    @Test
    public void testRead() throws Exception {
        MedAid medA = repository.findOne(medAidNo);
        Assert.assertEquals("A0241",medA.getMedAidNo());
    }
    @Test
    public void testUpdate() throws Exception {

        MedAid medA = repository.findOne(medAidNo);

        MedAid newMedA = new MedAid
                .Builder("B0541")
                .medAidCompany("Discovery Health")
                .medAidContact("+27218441234")
                .build();

        repository.save(newMedA);

        Assert.assertEquals("B0541", newMedA.getMedAidNo());
        Assert.assertEquals("Discovery Health",newMedA.getMedAidCompany());
        Assert.assertEquals("+27218441234", newMedA.getMedAidContact());

    }
    @Test
    public void testDelete() throws Exception {

        MedAid medA = repository.findOne(medAidNo);

        repository.delete(medA);
        MedAid newMedA = repository.findOne(medAidNo);
        Assert.assertNull(newMedA);
    }
}