package emcon.repository;

import emcon.domain.EmergencyType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by graham on 2015/05/03.
 */

public interface EmergencyTypeRepository extends CrudRepository<EmergencyType,String> {
    public EmergencyType findByCode(String description);
}
