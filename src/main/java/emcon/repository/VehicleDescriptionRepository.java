package emcon.repository;

import emcon.domain.VehicleDescription;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by graham on 2015/05/03.
 */

public interface VehicleDescriptionRepository extends CrudRepository<VehicleDescription,String> {
    public VehicleDescription findByCode(String vehMake);
}
