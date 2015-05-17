package emcon.services.Impl;

import emcon.domain.MedicalInformation;
import emcon.repository.MedicalInformationRepository;
import emcon.services.MedicalInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by graham on 2015/05/17.
 */
@Service
public class MedicalInformationServiceImpl implements MedicalInformationService{

    @Autowired
    MedicalInformationRepository repository;
    public List<MedicalInformation> getMedicalInformation() {

        List<MedicalInformation> allMedicalInformation = new ArrayList<MedicalInformation>();

        Iterable<MedicalInformation> medicalInformations = repository.findAll();
        for (MedicalInformation medicalInformation :medicalInformations) {
            allMedicalInformation.add(medicalInformation);
        }
        return allMedicalInformation;
    }
}
