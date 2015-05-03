package emcon.repository;

import emcon.App;
import emcon.domain.UniqueIdentifiers;
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
public class TestCrudUniqueIdentifiers {

    private String idNo;

    @Autowired
    UniqueIdentifiersRepository repository;

    @Test
    public void testCreate() throws Exception {

        UniqueIdentifiers unIdent = new UniqueIdentifiers
                .Builder("841120")
                .vehicleReg("CF1234")
                .imeiNumber("3500000000105050")
                .build();

        repository.save(unIdent);

        idNo = unIdent.getIdNo();

        Assert.assertNotNull(unIdent.getIdNo());
    }

    @Test
    public void testRead() throws Exception {
        UniqueIdentifiers unIdent = repository.findOne(idNo);
        Assert.assertEquals("841120",unIdent.getIdNo());
    }
    @Test
    public void testUpdate() throws Exception {

        UniqueIdentifiers unIdent = repository.findOne(idNo);

        UniqueIdentifiers newUnIdent = new UniqueIdentifiers
                .Builder("760012")
                .vehicleReg("CY3505")
                .imeiNumber("35006000505451")
                .build();

        repository.save(newUnIdent);

        Assert.assertEquals("760012", newUnIdent.getIdNo());
        Assert.assertEquals("CY3505",newUnIdent.getVehicleReg());
        Assert.assertEquals("35006000505451", newUnIdent.getImeiNumber());

    }
    @Test
    public void testDelete() throws Exception {

        UniqueIdentifiers unIdent = repository.findOne(idNo);

        repository.delete(unIdent);
        UniqueIdentifiers newUnIdent = repository.findOne(idNo);
        Assert.assertNull(newUnIdent);
    }
}