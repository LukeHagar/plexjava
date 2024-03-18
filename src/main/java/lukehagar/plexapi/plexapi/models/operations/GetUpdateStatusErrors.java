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


public class GetUpdateStatusErrors {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<? extends Double> code;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<? extends String> message;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends Double> status;

    public GetUpdateStatusErrors(
            @JsonProperty("code") Optional<? extends Double> code,
            @JsonProperty("message") Optional<? extends String> message,
            @JsonProperty("status") Optional<? extends Double> status) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(status, "status");
        this.code = code;
        this.message = message;
        this.status = status;
    }

    public Optional<? extends Double> code() {
        return code;
    }

    public Optional<? extends String> message() {
        return message;
    }

    public Optional<? extends Double> status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetUpdateStatusErrors withCode(double code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    public GetUpdateStatusErrors withCode(Optional<? extends Double> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public GetUpdateStatusErrors withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    public GetUpdateStatusErrors withMessage(Optional<? extends String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    public GetUpdateStatusErrors withStatus(double status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public GetUpdateStatusErrors withStatus(Optional<? extends Double> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        GetUpdateStatusErrors other = (GetUpdateStatusErrors) o;
        return 
            java.util.Objects.deepEquals(this.code, other.code) &&
            java.util.Objects.deepEquals(this.message, other.message) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            code,
            message,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetUpdateStatusErrors.class,
                "code", code,
                "message", message,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends Double> code = Optional.empty();
 
        private Optional<? extends String> message = Optional.empty();
 
        private Optional<? extends Double> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder code(double code) {
            Utils.checkNotNull(code, "code");
            this.code = Optional.ofNullable(code);
            return this;
        }

        public Builder code(Optional<? extends Double> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }

        public Builder message(Optional<? extends String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        public Builder status(double status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends Double> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public GetUpdateStatusErrors build() {
            return new GetUpdateStatusErrors(
                code,
                message,
                status);
        }
    }
}

