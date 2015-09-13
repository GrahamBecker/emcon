package emcon.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by graham on 2015/04/26.
 */
@Entity
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long regNo;
    private String firstName;
    private String lastName;
    private String dob;
    private String address;
    private String contact;

    private User() {
    }
    public User(Builder builder) {
        regNo=builder.regNo;
        firstName=builder.firstName;
        lastName=builder.lastName;
        dob=builder.dob;
        address=builder.address;
        contact=builder.contact;
    }
    public Long getRegNo() {
        return regNo;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDob() {
        return dob;
    }
    public String getAddress() {
        return address;
    }
    public String getContact() {
        return contact;
    }

    public static class Builder{
        private Long regNo;
        private String firstName;
        private String lastName;
        private String dob;
        private String address;
        private String contact;

        public Builder(Long regNo) {
            this.regNo = regNo;
        }
        public Builder firstName(String value){
            this.firstName=value;
            return this;
        }
        public Builder lastName(String value){
            this.lastName=value;
            return this;
        }
        public Builder dob(String value){
            this.dob=value;
            return this;
        }
        public Builder address(String value){
            this.address=value;
            return this;
        }
        public Builder contact(String value){
            this.contact=value;
            return this;
        }

        public Builder copy(User value){
            this.regNo=value.getRegNo();
            this.firstName=value.getFirstName();
            this.lastName=value.getLastName();
            this.dob=value.getDob();
            this.address=value.getAddress();
            this.contact=value.getContact();
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return !(regNo != null ? !regNo.equals(user.regNo) : user.regNo != null);
    }
    @Override
    public int hashCode() {
        return regNo != null ? regNo.hashCode() : 0;
    }
    @Override
    public String toString() {
        return "User{" +
                "regNo=" + regNo +
                ", FirstName='" + firstName + '\'' +
                '}';
    }

}
