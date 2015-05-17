package emcon.services.Impl;

import emcon.domain.EmergencyType;
import emcon.repository.EmergencyTypeRepository;
import emcon.services.EmergencyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by graham on 2015/05/17.
 */
@Service
public class EmergencyTypeServiceImpl implements EmergencyTypeService{

    @Autowired
    EmergencyTypeRepository repository;
    public List<EmergencyType> getEmergencyType() {

        List<EmergencyType> allEmergencyTypes = new ArrayList<EmergencyType>();

        Iterable<EmergencyType> emergencyTypes = repository.findAll();
        for (EmergencyType emergencyType : emergencyTypes) {
            allEmergencyTypes.add(emergencyType);
        }
        return allEmergencyTypes;
    }
}
