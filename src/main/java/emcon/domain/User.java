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
    @Column(unique = true)
    private int regNo;
    private String firstName;
    private String lastName;
    private String dob;

    private User() {
    }
    public User(Builder builder) {
        regNo=builder.regNo;
        firstName=builder.firstName;
        lastName=builder.lastName;
        dob=builder.dob;
    }
    public int getRegNo() {
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

    public static class Builder{
        private int regNo;
        private String firstName;
        private String lastName;
        private String dob;

        public Builder(int regNo) {
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

        public Builder copy(User value){
            this.regNo=value.getRegNo();
            this.firstName=value.getFirstName();
            this.lastName=value.getLastName();
            this.dob=value.getDob();
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return !(regNo != null ? !regNo.equals(User.regNo) : User.regNo != null);
    }
    @Override
    public int hashCode() {
        return regNo != null ? regNo.hashCode() : 0;
    }
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    */
}
