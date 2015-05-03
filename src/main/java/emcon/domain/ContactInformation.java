package emcon.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by graham on 2015/04/26.
 */
@Embeddable
public class ContactInformation implements Serializable {
    private String cellNumber;
    private String homeNumber;
    private String email;
    private String skype;

    public ContactInformation(Builder builder){
        cellNumber = builder.cellNumber;
        homeNumber = builder.homeNumber;
        email = builder.email;
        skype = builder.skype;
    }

    public String getCellNumber(){
        return cellNumber;
    }

    public String getHomeNumber(){
        return homeNumber;
    }

    public String getEmail(){
        return email;
    }

    public String getSkype(){
        return skype;
    }

    public static class Builder {
        private String cellNumber;
        private String homeNumber;
        private String email;
        private String skype;

        public Builder(String cellNumber) {
            this.cellNumber = cellNumber;
        }


        public Builder homeNumber(String value) {
            this.homeNumber = value;
            return this;
        }

        public Builder email(String value) {
            this.email = value;
            return this;
        }

        public Builder skype(String value) {
            this.skype = value;
            return this;
        }

        public Builder copy(ContactInformation value){
            this.cellNumber=value.getCellNumber();
            this.homeNumber=value.getHomeNumber();
            this.email=value.getEmail();
            this.skype=value.getSkype();
            return this;
        }

        public ContactInformation build() {
            return new ContactInformation(this);
        }
    }
}

