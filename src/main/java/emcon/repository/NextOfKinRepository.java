package emcon.repository;

import emcon.domain.NextOfKin;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by graham on 2015/05/03.
 */
public interface NextOfKinRepository extends CrudRepository<NextOfKin,String> {
    public NextOfKin findByCode(String relationship);
}
