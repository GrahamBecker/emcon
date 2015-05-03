package emcon.repository;

import emcon.domain.UniqueIdentifiers;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by graham on 2015/05/03.
 */
public interface UniqueIdentifiersRepository extends CrudRepository<UniqueIdentifiers,String> {
    public UniqueIdentifiers findByCode(String idNo);
}
