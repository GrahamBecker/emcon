package emcon.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by graham on 2015/04/26.
 */
@Embeddable
public class VehicleDescription implements Serializable {
    private String vehMake;
    private String vehModel;
    private String vehColor;
    private int vehYear;

    public VehicleDescription(Builder builder){
        vehMake = builder.vehMake;
        vehModel = builder.vehModel;
        vehColor = builder.vehColor;
        vehYear = builder.vehYear;
    }

    public String getVehMake(){
        return vehMake;
    }

    public String getVehModel(){
        return vehModel;
    }

    public String getVehColor(){
        return vehColor;
    }

    public int getVehYear(){
        return vehYear;
    }

    public static class Builder {
        private String vehMake;
        private String vehModel;
        private String vehColor;
        private int vehYear;

        public Builder(String vehMake) {
            this.vehMake = vehMake;
        }

        public Builder vehModel(String value) {
            this.vehModel = value;
            return this;
        }

        public Builder vehColor(String value) {
            this.vehColor = value;
            return this;
        }

        public Builder vehYear(int value) {
            this.vehYear = value;
            return this;
        }

        public VehicleDescription build() {
            return new VehicleDescription(this);
        }
    }
}

