package emcon.conf.factory;

import emcon.domain.UserDetails;

/**
 * Created by
 * GrahamBecker on 2015/04/26.
 */
public class UserDetailsFactory {

    public static UserDetails createUserDetails
            (String emconNo) {

        UserDetails userDet = new UserDetails
                .Builder(emconNo)
                .build();

        return userDet;
    }
}
