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
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class Errors {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<Integer> code;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<String> message;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<Integer> status;

    @JsonCreator
    public Errors(
            @JsonProperty("code") Optional<Integer> code,
            @JsonProperty("message") Optional<String> message,
            @JsonProperty("status") Optional<Integer> status) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(status, "status");
        this.code = code;
        this.message = message;
        this.status = status;
    }
    
    public Errors() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Integer> code() {
        return code;
    }

    @JsonIgnore
    public Optional<String> message() {
        return message;
    }

    @JsonIgnore
    public Optional<Integer> status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Errors withCode(int code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    public Errors withCode(Optional<Integer> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public Errors withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    public Errors withMessage(Optional<String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    public Errors withStatus(int status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public Errors withStatus(Optional<Integer> status) {
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
        Errors other = (Errors) o;
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
        return Utils.toString(Errors.class,
                "code", code,
                "message", message,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<Integer> code = Optional.empty();
 
        private Optional<String> message = Optional.empty();
 
        private Optional<Integer> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder code(int code) {
            Utils.checkNotNull(code, "code");
            this.code = Optional.ofNullable(code);
            return this;
        }

        public Builder code(Optional<Integer> code) {
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

        public Builder status(int status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<Integer> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public Errors build() {
            return new Errors(
                code,
                message,
                status);
        }
    }
}

