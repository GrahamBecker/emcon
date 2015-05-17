package emcon.services;

import emcon.domain.MedicalInformation;

import java.util.List;

/**
 * Created by graham on 2015/05/17.
 */
public interface MedicalInformationService {
    List<MedicalInformation> getMedicalInformation();
}
