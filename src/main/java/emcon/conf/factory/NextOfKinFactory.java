package emcon.conf.factory;

import emcon.domain.NextOfKin;

/**
 * Created by
 * GrahamBecker on 2015/04/26.
 */
public class NextOfKinFactory {

    public static NextOfKin createNextOfKin
            (String relationship, String name, String surname, String contact) {

        NextOfKin NOK = new NextOfKin
                .Builder(relationship)
                .name(name)
                .surname(surname)
                .contact(contact)
                .build();

        return NOK;
    }
}
