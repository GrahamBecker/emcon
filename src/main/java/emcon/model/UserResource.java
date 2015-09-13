package emcon.model;

import emcon.domain.MedicalInformation;
import emcon.domain.NextOfKin;
import emcon.domain.User;
import emcon.domain.UserDetails;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by graham on 2015/09/13.
 */
public class UserResource extends ResourceSupport {

    private Long regNo;
    private NextOfKin nextOfKin;
    private MedicalInformation medInfo;
    private User user;

    private UserResource() {
    }

    public Long getRegNo() {
        return regNo;
    }

    public NextOfKin getNextOfKin() {
        return nextOfKin;
    }

    public MedicalInformation getMedInfo() {
        return medInfo;
    }

    public UserResource(Builder builder) {
        this.nextOfKin = builder.nextOfKin;
        this.medInfo = builder.medicalInformation;
        this.regNo = builder.regNo;

    }

    public static class Builder {
        private Long regNo;
        private MedicalInformation medicalInformation;
        private NextOfKin nextOfKin;


        public Builder regNo(Long value) {
            this.regNo = value;
            return this;
        }

        public Builder medicalInformation(MedicalInformation value) {
            this.medicalInformation = value;
            return this;
        }

        public Builder nextOfKin(NextOfKin value) {
            this.nextOfKin = value;
            return this;
        }

        public Builder copy(UserResource value) {
            this.regNo = value.regNo;
            this.nextOfKin = value.nextOfKin;
            this.medicalInformation = value.medInfo;
            return this;
        }

        public UserResource build() {
            return new UserResource(this);
        }
    }
}
