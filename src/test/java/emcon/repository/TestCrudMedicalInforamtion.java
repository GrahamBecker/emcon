package emcon.repository;

import emcon.App;
import emcon.domain.MedicalInformation;
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
public class TestCrudMedicalInforamtion {

    private String bloodType;

    @Autowired
    MedicalInformationRepository repository;

    @Test
    public void testCreate() throws Exception {

        MedicalInformation medInfo = new MedicalInformation
                .Builder("A Positive")
                .allergies("Peanuts")
                .additionalInfo("None")
                .medAid("None")
                .medAidNumber("N/A")
                .build();

        repository.save(medInfo);

        bloodType = medInfo.getBloodType();

        Assert.assertNotNull(medInfo.getBloodType());
    }

    @Test
    public void testRead() throws Exception {
        MedicalInformation medInfo = repository.findOne(bloodType);
        Assert.assertEquals("A Positive",medInfo.getBloodType());
    }
    @Test
    public void testUpdate() throws Exception {

        MedicalInformation medInfo = repository.findOne(bloodType);

        MedicalInformation newMedInfo = new MedicalInformation
                .Builder("B Positive")
                .allergies("None")
                .additionalInfo("None")
                .medAid("Discovery Health")
                .medAidNumber("A123456")
                .build();

        repository.save(newMedInfo);

        Assert.assertEquals("B Positive", newMedInfo.getBloodType());
        Assert.assertEquals("None",newMedInfo.getAllergies());
        Assert.assertEquals("None", newMedInfo.getAdditionalInfo());
        Assert.assertEquals("Discovery Health", newMedInfo.getMedAid());
        Assert.assertEquals("A123456", newMedInfo.getMedAidNumber());

    }
    @Test
    public void testDelete() throws Exception {

        MedicalInformation medInfo = repository.findOne(bloodType);

        repository.delete(medInfo);
        MedicalInformation newMedInfo = repository.findOne(bloodType);
        Assert.assertNull(newMedInfo);
    }
}