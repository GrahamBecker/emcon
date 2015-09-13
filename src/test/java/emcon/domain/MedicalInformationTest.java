package emcon.domain;

import emcon.conf.factory.MedicalInformationFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by graham on 2015/05/03.
 */
public class MedicalInformationTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testMedicalInformation() throws Exception {

        MedicalInformation medInfo = MedicalInformationFactory.createMedicalInformation("A Positive", "Peanuts", "None", "None", "N/A");

        Assert.assertEquals("A Positive", medInfo.getBloodType());
        Assert.assertEquals("Peanuts", medInfo.getAllergies());
        Assert.assertEquals("None", medInfo.getAdditionalInfo());
        Assert.assertEquals("None", medInfo.getMedAid());
        Assert.assertEquals("N/A", medInfo.getMedAidNumber());
    }
}
