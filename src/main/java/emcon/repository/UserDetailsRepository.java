package emcon.repository;

import emcon.domain.UserDetails;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by graham on 2015/05/03.
 */
public interface UserDetailsRepository extends CrudRepository<UserDetails,String> {
    public UserDetails findByCode(String emconNo);
}
