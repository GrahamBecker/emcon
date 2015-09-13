package emcon.conf.factory;

import emcon.domain.User;
import java.util.Date;
import emcon.domain.UserDetails;


/**
 * Created by
 * GrahamBecker on 2015/04/26.
 */
public class UserFactory {

    public static User createUser(Long regNo, String firstName, String lastName, String dob, String address, String contact){

        User user = new User
                .Builder(regNo)
                .firstName(firstName)
                .lastName(lastName)
                .dob(dob)
                .address(address)
                .contact(contact)
                .build();
        return user;
    }

}