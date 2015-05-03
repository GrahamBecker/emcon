package emcon.conf.factory;

import emcon.domain.NextOfKin;

/**
 * Created by
 * GrahamBecker on 2015/04/26.
 */
public class NextOfKinFactory {

    public static NextOfKin createNextOfKin
            (String relationship) {

        NextOfKin NOK = new NextOfKin
                .Builder(relationship)
                .build();

        return NOK;
    }
}
