package emcon.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by graham on 2015/04/26.
 */
@Embeddable
public class UniqueIdentifiers implements Serializable {
    private String idNo;
    private String vehicleReg;
    private String imeiNumber;

    public UniqueIdentifiers(Builder builder){
        idNo = builder.idNo;
        vehicleReg = builder.vehicleReg;
        imeiNumber = builder.imeiNumber;
    }

    public String getIdNo(){
        return idNo;
    }

    public String getVehicleReg(){
        return vehicleReg;
    }

    public String getImeiNumber(){
        return imeiNumber;
    }

    public static class Builder {
        private String idNo;
        private String vehicleReg;
        private String imeiNumber;

        public Builder(String idNo) {
            this.idNo = idNo;
        }

        public Builder vehicleReg(String value) {
            this.vehicleReg = value;
            return this;
        }

        public Builder imeiNumber(String value) {
            this.imeiNumber = value;
            return this;
        }

        public UniqueIdentifiers build() {
            return new UniqueIdentifiers(this);
        }
    }
}

