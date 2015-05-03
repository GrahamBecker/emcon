package emcon.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by graham on 2015/04/26.
 */
@Embeddable
public class MedicalInformation implements Serializable {
    private String bloodType;
    private String allergies;
    private String additionalInfo;

    public MedicalInformation(Builder builder){
        bloodType = builder.bloodType;
        allergies = builder.allergies;
        additionalInfo = builder.additionalInfo;
    }

    public String getBloodType(){
        return bloodType;
    }

    public String getAllergies(){
        return allergies;
    }

    public String getAdditionalInfo(){
        return additionalInfo;
    }

    public static class Builder {
        private String bloodType;
        private String allergies;
        private String additionalInfo;

        public Builder(String bloodType) {
            this.bloodType = bloodType;
        }

        public Builder allergies(String value) {
            this.allergies = value;
            return this;
        }

        public Builder additionalInfo(String value) {
            this.additionalInfo = value;
            return this;
        }

        public MedicalInformation build() {
            return new MedicalInformation(this);
        }
    }
}

