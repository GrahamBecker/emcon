package emcon.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by graham on 2015/04/26.
 */
@Embeddable
public class UniqueIdentifiers implements Serializable {
    private int idNo;
    private String vehicleReg;
    private int imeiNumber;

    public UniqueIdentifiers(Builder builder){
        idNo = builder.idNo;
        vehicleReg = builder.vehicleReg;
        imeiNumber = builder.imeiNumber;
    }

    public int getIdNo(){
        return idNo;
    }

    public String getVehicleReg(){
        return vehicleReg;
    }

    public int getImeiNumber(){
        return imeiNumber;
    }

    public static class Builder {
        private int idNo;
        private String vehicleReg;
        private int imeiNumber;

        public Builder idNo(int value) {
            this.idNo = idNo;
            return this;
        }

        public Builder vehicleReg(String value) {
            this.vehicleReg = vehicleReg;
            return this;
        }

        public Builder imeiNumber(int value) {
            this.imeiNumber = imeiNumber;
            return this;
        }

        public UniqueIdentifiers build() {
            return new UniqueIdentifiers(this);
        }
    }
}

