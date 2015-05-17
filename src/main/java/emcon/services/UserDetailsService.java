package emcon.services;

import emcon.domain.UserDetails;

import java.util.List;

/**
 * Created by graham on 2015/05/17.
 */
public interface UserDetailsService {
    List<UserDetails> getUserDetails();
}
