/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.errors;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetButlerTasksButlerErrors {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<Long> code;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<String> message;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<Long> status;

    @JsonCreator
    public GetButlerTasksButlerErrors(
            @JsonProperty("code") Optional<Long> code,
            @JsonProperty("message") Optional<String> message,
            @JsonProperty("status") Optional<Long> status) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(status, "status");
        this.code = code;
        this.message = message;
        this.status = status;
    }
    
    public GetButlerTasksButlerErrors() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Long> code() {
        return code;
    }

    @JsonIgnore
    public Optional<String> message() {
        return message;
    }

    @JsonIgnore
    public Optional<Long> status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetButlerTasksButlerErrors withCode(long code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    public GetButlerTasksButlerErrors withCode(Optional<Long> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public GetButlerTasksButlerErrors withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    public GetButlerTasksButlerErrors withMessage(Optional<String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    public GetButlerTasksButlerErrors withStatus(long status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public GetButlerTasksButlerErrors withStatus(Optional<Long> status) {
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
        GetButlerTasksButlerErrors other = (GetButlerTasksButlerErrors) o;
        return 
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.message, other.message) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            code,
            message,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetButlerTasksButlerErrors.class,
                "code", code,
                "message", message,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<Long> code = Optional.empty();
 
        private Optional<String> message = Optional.empty();
 
        private Optional<Long> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder code(long code) {
            Utils.checkNotNull(code, "code");
            this.code = Optional.ofNullable(code);
            return this;
        }

        public Builder code(Optional<Long> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }

        public Builder message(Optional<String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        public Builder status(long status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<Long> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public GetButlerTasksButlerErrors build() {
            return new GetButlerTasksButlerErrors(
                code,
                message,
                status);
        }
    }
}

