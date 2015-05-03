package emcon.repository;

import emcon.domain.ContactInformation;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by graham on 2015/05/03.
 */
public interface ContactInformationRepository extends CrudRepository<ContactInformation,String> {
    public ContactInformation findByCode(String cellNumber);
}
