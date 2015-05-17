package emcon.services.Impl;

import emcon.domain.User;
import emcon.repository.UserRepository;
import emcon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by graham on 2015/05/03.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;
    public List<User> getUsers() {

        List<User> allUsers = new ArrayList<User>();

        Iterable<User> users = repository.findAll();
        for (User user : users) {
            allUsers.add(user);
        }
        return allUsers;
    }
}
