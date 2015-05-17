package emcon.repository;

import emcon.domain.User;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by graham on 2015/05/03.
 */
public interface UserRepository extends CrudRepository<User,Long> {
    User findByCode(Long regNo);
}

