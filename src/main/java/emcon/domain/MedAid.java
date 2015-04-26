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
    private int medAidContact;

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

    public int getMedAidContact(){ return medAidContact;
    }

    public static class Builder {
        private String medAidNo;
        private String medAidCompany;
        private int medAidContact;

        public Builder medAidNo(String value) {
            this.medAidNo = medAidNo;
            return this;
        }

        public Builder medAidCompany(String value) {
            this.medAidCompany = medAidCompany;
            return this;
        }

        public Builder medAidContact(int value) {
            this.medAidContact = medAidContact;
            return this;
        }

        public MedAid build() {
            return new MedAid(this);
        }
    }
}

