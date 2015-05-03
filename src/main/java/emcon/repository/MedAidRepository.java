package emcon.repository;

import emcon.domain.MedAid;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by graham on 2015/05/03.
 */
public interface MedAidRepository extends CrudRepository<MedAid,String> {
    public MedAid findByCode(String medAidNo);
}