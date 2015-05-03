package emcon.domain;

import javax.persistence.Embeddable;

/**
 * Created by
 * GrahamBecker on 2015/04/26.
 */

@Embeddable
public class PreferredContactMethod {

    private String contactMethod;

    public PreferredContactMethod(Builder builder){
        contactMethod = builder.contactMethod;

    }

    public String getContactMethod(){
        return contactMethod;
    }


    public static class Builder {
        private String contactMethod;


        public Builder(String contactMethod) {
            this.contactMethod = contactMethod;
        }


        public PreferredContactMethod build() {
            return new PreferredContactMethod(this);
        }
    }
}
