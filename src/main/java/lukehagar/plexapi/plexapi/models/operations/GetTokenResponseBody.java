/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
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
 * GetTokenResponseBody - X-Plex-Client-Identifier is missing
 */

public class GetTokenResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    private Optional<? extends java.util.List<GetTokenErrors>> errors;

    public GetTokenResponseBody(
            @JsonProperty("errors") Optional<? extends java.util.List<GetTokenErrors>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
    }

    public Optional<? extends java.util.List<GetTokenErrors>> errors() {
        return errors;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetTokenResponseBody withErrors(java.util.List<GetTokenErrors> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = Optional.ofNullable(errors);
        return this;
    }

    public GetTokenResponseBody withErrors(Optional<? extends java.util.List<GetTokenErrors>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
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
        GetTokenResponseBody other = (GetTokenResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.errors, other.errors);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            errors);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTokenResponseBody.class,
                "errors", errors);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<GetTokenErrors>> errors = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder errors(java.util.List<GetTokenErrors> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = Optional.ofNullable(errors);
            return this;
        }

        public Builder errors(Optional<? extends java.util.List<GetTokenErrors>> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = errors;
            return this;
        }
        
        public GetTokenResponseBody build() {
            return new GetTokenResponseBody(
                errors);
        }
    }
}

