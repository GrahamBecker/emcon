package emcon.conf.factory;

import emcon.domain.MedicalInformation;

/**
 * Created by
 * GrahamBecker on 2015/04/26.
 */
public class MedicalInformationFactory {

    public static MedicalInformation createMedicalInformation
            (String bloodType,
             String allergies,
             String additionalInfo,
             String medAid,
             String medAidNumber)
    {

            MedicalInformation medInfo = new MedicalInformation
                    .Builder(bloodType)
                    .allergies(allergies)
                    .additionalInfo(additionalInfo)
                    .medAid(medAid)
                    .medAidNumber(medAidNumber)
                .build();

        return medInfo;
    }
}
