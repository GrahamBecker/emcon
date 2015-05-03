package emcon.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by graham on 2015/04/26.
 */
@Embeddable
public class NextOfKin implements Serializable {
    private String relationship;

    public NextOfKin(Builder builder){
        relationship = builder.relationship;
    }

    public String getRelationship(){
        return relationship;
    }

    public static class Builder {
        private String relationship;


        public Builder (String relationship) {
            this.relationship = relationship;
        }

        public NextOfKin build() {
            return new NextOfKin(this);
        }
    }
}

