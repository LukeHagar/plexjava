/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.errors;

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

public class AddPlaylistContentsErrors {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<? extends Double> code;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<? extends String> message;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends Double> status;

    @JsonCreator
    public AddPlaylistContentsErrors(
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
    
    public AddPlaylistContentsErrors() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> code() {
        return (Optional<Double>) code;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> message() {
        return (Optional<String>) message;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> status() {
        return (Optional<Double>) status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AddPlaylistContentsErrors withCode(double code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    public AddPlaylistContentsErrors withCode(Optional<? extends Double> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public AddPlaylistContentsErrors withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    public AddPlaylistContentsErrors withMessage(Optional<? extends String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    public AddPlaylistContentsErrors withStatus(double status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public AddPlaylistContentsErrors withStatus(Optional<? extends Double> status) {
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
        AddPlaylistContentsErrors other = (AddPlaylistContentsErrors) o;
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
        return Utils.toString(AddPlaylistContentsErrors.class,
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
        
        public AddPlaylistContentsErrors build() {
            return new AddPlaylistContentsErrors(
                code,
                message,
                status);
        }
    }
}

