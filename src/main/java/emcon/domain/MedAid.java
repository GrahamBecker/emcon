package emcon.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by graham on 2015/04/26.
 */
@Embeddable
public class MedAid implements Serializable {
    private String medAidNo;
    private String medAidCompany;
    private String medAidContact;

    public MedAid(Builder builder){
        medAidNo = builder.medAidNo;
        medAidCompany = builder.medAidCompany;
        medAidContact = builder.medAidContact;
    }

    public String getMedAidNo(){
        return medAidNo;
    }

    public String getMedAidCompany(){
        return medAidCompany;
    }

    public String getMedAidContact(){ return medAidContact;
    }

    public static class Builder {
        private String medAidNo;
        private String medAidCompany;
        private String medAidContact;

        public Builder(String medAidNo) {
            this.medAidNo = medAidNo;
        }

        public Builder medAidCompany(String value) {
            this.medAidCompany = value;
            return this;
        }

        public Builder medAidContact(String value) {
            this.medAidContact = value;
            return this;
        }

        public MedAid build() {
            return new MedAid(this);
        }
    }
}

