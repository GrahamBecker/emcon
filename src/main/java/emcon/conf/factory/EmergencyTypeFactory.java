package emcon.conf.factory;

import emcon.domain.EmergencyType;

/**
 * Created by
 * GrahamBecker on 2015/04/26.
 */
public class EmergencyTypeFactory {

    public static EmergencyType createEmergencyType
            (String description, String ice) {

        EmergencyType eType = new EmergencyType
                .Builder(description)
                .ice(ice)
                .build();

        return eType;
    }
}
