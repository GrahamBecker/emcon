package emcon.repository;

import emcon.domain.MedicalInformation;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by graham on 2015/05/03.
 */
public interface MedicalInformationRepository extends CrudRepository<MedicalInformation,String> {
    public MedicalInformation findByCode(String bloodType);
}