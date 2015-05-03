package emcon.services.Impl;

import emcon.repository.UserRepository;
import emcon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by graham on 2015/05/03.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    Iterable user = repository.findAll();
}
