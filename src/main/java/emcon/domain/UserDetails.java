package emcon.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by graham on 2015/04/26.
 */
@Embeddable
public class UserDetails implements Serializable {
    private String emconNo;

    public UserDetails(Builder builder){
        emconNo = builder.emconNo;

    }

    public String getEmconNo(){
        return emconNo;
    }


    public static class Builder {
        private String emconNo;


        public Builder(String emconNo) {
            this.emconNo = emconNo;
        }


        public UserDetails build() {
            return new UserDetails(this);
        }
    }
}

