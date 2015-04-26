package emcon.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by graham on 2015/04/26.
 */
@Embeddable
public class UserDetails implements Serializable {
    private String firstName;
    private String lastName;
    private String dob;

    public UserDetails(Builder builder){
        firstName = builder.firstName;
        lastName = builder.lastName;
        dob = builder.dob;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getDob(){
        return dob;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String dob;

        public Builder firstName(String value) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String value) {
            this.lastName = lastName;
            return this;
        }

        public Builder dob(String value) {
            this.dob = dob;
            return this;
        }

        public UserDetails build() {
            return new UserDetails(this);
        }
    }
}

