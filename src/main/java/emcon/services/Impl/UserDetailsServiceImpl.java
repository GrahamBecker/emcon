package emcon.services.Impl;

import emcon.domain.UserDetails;
import emcon.repository.UserDetailsRepository;
import emcon.services.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by graham on 2015/05/17.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    UserDetailsRepository repository;
    public List<UserDetails> getUserDetails() {

        List<UserDetails> allUserDetails = new ArrayList<UserDetails>();

        Iterable<UserDetails> userDetailses = repository.findAll();
        for (UserDetails userDetails : userDetailses) {
            allUserDetails.add(userDetails);
        }
        return allUserDetails;
    }
}
