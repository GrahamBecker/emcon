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
    private String medAid;
    private String medAidNumber;

    public MedicalInformation(Builder builder){
        bloodType = builder.bloodType;
        allergies = builder.allergies;
        additionalInfo = builder.additionalInfo;
        medAid = builder.medAid;
        medAidNumber = builder.medAidNumber;
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

    public String getMedAid(){
        return medAid;
    }

    public String getMedAidNumber(){
        return medAidNumber;
    }

    public static class Builder {
        private String bloodType;
        private String allergies;
        private String additionalInfo;
        private String medAid;
        private String medAidNumber;

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

        public Builder medAid(String value) {
            this.medAid = value;
            return this;
        }

        public Builder medAidNumber(String value) {
            this.medAidNumber = value;
            return this;
        }

        public MedicalInformation build() {
            return new MedicalInformation(this);
        }
    }
}

