package emcon.conf.factory;

import emcon.domain.MedAid;

/**
 * Created by
 * GrahamBecker on 2015/04/26.
 */
public class MedAidFactory {

    public static MedAid createMedAid
            (String medAidNo,
             String medAidCompany,
             String medAidContact) {

        MedAid medAid = new MedAid
                .Builder(medAidNo)
                .medAidCompany(medAidCompany)
                .medAidContact(medAidContact)
                .build();

        return medAid;
    }
}
