package emcon.services.Impl;

import emcon.domain.VehicleDescription;
import emcon.repository.VehicleDescriptionRepository;
import emcon.services.VehicleDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by graham on 2015/05/17.
 */
@Service
public class VehicleDescriptionServiceImpl implements VehicleDescriptionService{

    @Autowired
    VehicleDescriptionRepository repository;
    public List<VehicleDescription> getVehicleDescription() {

        List<VehicleDescription> allVehicleDescriptions = new ArrayList<VehicleDescription>();

        Iterable<VehicleDescription> vehicleDescriptions = repository.findAll();
        for (VehicleDescription vehicleDescription : vehicleDescriptions) {
            allVehicleDescriptions.add(vehicleDescription);
        }
        return allVehicleDescriptions;
    }
}
