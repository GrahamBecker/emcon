package emcon.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by graham on 2015/04/26.
 */
@Embeddable
public class ContactInformation implements Serializable {
    private int cellNumber;
    private int homeNumber;
    private String email;
    private String skype;

    public ContactInformation(Builder builder){
        cellNumber = builder.cellNumber;
        homeNumber = builder.homeNumber;
        email = builder.email;
        skype = builder.skype;
    }

    public int getCellNumber(){
        return cellNumber;
    }

    public int getHomeNumber(){
        return homeNumber;
    }

    public String getEmail(){
        return email;
    }

    public String getSkype(){
        return skype;
    }

    public static class Builder {
        private int cellNumber;
        private int homeNumber;
        private String email;
        private String skype;

        public Builder cellNumber(int value) {
            this.cellNumber = cellNumber;
            return this;
        }

        public Builder homeNumber(int value) {
            this.homeNumber = homeNumber;
            return this;
        }

        public Builder email(String value) {
            this.email = email;
            return this;
        }

        public Builder skype(String value) {
            this.skype = skype;
            return this;
        }

        public ContactInformation build() {
            return new ContactInformation(this);
        }
    }
}

