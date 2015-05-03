package emcon.conf.factory;

import emcon.domain.PreferredContactMethod;

/**
 * Created by
 * GrahamBecker on 2015/04/26.
 */
public class PreferredContactMethodFactory {

    public static PreferredContactMethod createPreferredContactMethod
            (String contactMethod) {

        PreferredContactMethod prefCont = new PreferredContactMethod
                .Builder(contactMethod)
                .build();

        return prefCont;
    }
}
