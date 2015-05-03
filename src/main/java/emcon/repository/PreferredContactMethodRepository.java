package emcon.repository;

import emcon.domain.PreferredContactMethod;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by graham on 2015/05/03.
 */
public interface PreferredContactMethodRepository extends CrudRepository<PreferredContactMethod,String> {
    public PreferredContactMethod findByCode(String contactMethod);
}
