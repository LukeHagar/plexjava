/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import lukehagar.plexapi.plexapi.utils.Utils;
/**
 * GetMyPlexAccountResponseBody - MyPlex Account
 */

public class GetMyPlexAccountResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MyPlex")
    private Optional<? extends MyPlex> myPlex;

    @JsonCreator
    public GetMyPlexAccountResponseBody(
            @JsonProperty("MyPlex") Optional<? extends MyPlex> myPlex) {
        Utils.checkNotNull(myPlex, "myPlex");
        this.myPlex = myPlex;
    }
    
    public GetMyPlexAccountResponseBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MyPlex> myPlex() {
        return (Optional<MyPlex>) myPlex;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetMyPlexAccountResponseBody withMyPlex(MyPlex myPlex) {
        Utils.checkNotNull(myPlex, "myPlex");
        this.myPlex = Optional.ofNullable(myPlex);
        return this;
    }

    public GetMyPlexAccountResponseBody withMyPlex(Optional<? extends MyPlex> myPlex) {
        Utils.checkNotNull(myPlex, "myPlex");
        this.myPlex = myPlex;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetMyPlexAccountResponseBody other = (GetMyPlexAccountResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.myPlex, other.myPlex);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            myPlex);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMyPlexAccountResponseBody.class,
                "myPlex", myPlex);
    }
    
    public final static class Builder {
 
        private Optional<? extends MyPlex> myPlex = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder myPlex(MyPlex myPlex) {
            Utils.checkNotNull(myPlex, "myPlex");
            this.myPlex = Optional.ofNullable(myPlex);
            return this;
        }

        public Builder myPlex(Optional<? extends MyPlex> myPlex) {
            Utils.checkNotNull(myPlex, "myPlex");
            this.myPlex = myPlex;
            return this;
        }
        
        public GetMyPlexAccountResponseBody build() {
            return new GetMyPlexAccountResponseBody(
                myPlex);
        }
    }
}

