package emcon.conf.factory;

import emcon.domain.User;
import java.util.Date;
import emcon.domain.UserDetails;


/**
 * Created by graham on 2015/04/26.
 */
public class UserFactory {

    public static User createUser(String regNo, String firstName, String lastName, String dob){

        User user = new User
                .Builder(regNo)
                .firstName(firstName)
                .lastName(lastName)
                .dob(dob)
                .build();
        return user;
    }

}