package emcon.conf.factory;

import emcon.domain.ContactInformation;

/**
 * Created by
 * GrahamBecker on 2015/04/26.
 */

public class ContactInformationFactory {

    public static ContactInformation createContactInformation
            (String cellNumber, String homeNumber, String email, String skype){

        ContactInformation cI = new ContactInformation
                .Builder(cellNumber)
                .homeNumber(homeNumber)
                .email(email)
                .skype(skype)
                .build();
        return cI;

    }

}
