package emcon.conf.factory;

import emcon.domain.MedAid;
import emcon.domain.UniqueIdentifiers;

/**
 * Created by
 * GrahamBecker on 2015/04/26.
 */
public class UniqueIdentifiersFactory {

    public static UniqueIdentifiers createUniqueIdentifiers
            (String idNo,
             String vehicleReg,
             String imeiNumber) {

        UniqueIdentifiers uIdent = new UniqueIdentifiers
                .Builder(idNo)
                .vehicleReg(vehicleReg)
                .imeiNumber(imeiNumber)
                .build();

        return uIdent;
    }
}
