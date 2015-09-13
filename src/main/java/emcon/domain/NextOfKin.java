package emcon.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by graham on 2015/04/26.
 */
@Embeddable
public class NextOfKin implements Serializable {
    private String relationship;
    private String name;
    private String surname;
    private String contact;

    public NextOfKin(Builder builder){
        name=builder.name;
        surname=builder.surname;
        contact=builder.contact;
        relationship = builder.relationship;
    }

    public String getRelationship(){
        return relationship;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getContact(){
        return contact;
    }


    public static class Builder {
        private String relationship;
        private String name;
        private String surname;
        private String contact;


        public Builder (String relationship) {
            this.relationship = relationship;
        }

        public Builder name(String value){
            this.name=value;
            return this;
        }

        public Builder surname(String value){
            this.surname=value;
            return this;
        }

        public Builder contact(String value){
            this.contact=value;
            return this;
        }

        public Builder copy(NextOfKin value){
            this.relationship=value.getRelationship();
            this.name=value.getName();
            this.surname=value.getSurname();
            this.contact=value.getContact();
            return this;
        }

        public NextOfKin build() {
            return new NextOfKin(this);
        }
    }
}

