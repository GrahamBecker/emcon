package emcon.conf.factory;

import emcon.domain.VehicleDescription;

/**
 * Created by
 * GrahamBecker on 2015/04/26.
 */
public class VehicleDescriptionFactory {

    public static VehicleDescription createVehicleDescription
            (String vehMake,
             String vehModel,
             String vehColor,
             int vehYear) {

        VehicleDescription vehDescr = new VehicleDescription
                .Builder(vehMake)
                .vehModel(vehModel)
                .vehColor(vehColor)
                .vehYear(vehYear)
                .build();

        return vehDescr;
    }
}
