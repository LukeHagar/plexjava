/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class PostUsersSignInDataServices {

    @JsonProperty("identifier")
    private String identifier;

    @JsonProperty("endpoint")
    private String endpoint;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("token")
    private Optional<String> token;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("secret")
    private Optional<String> secret;

    @JsonProperty("status")
    private PostUsersSignInDataStatus status;

    @JsonCreator
    public PostUsersSignInDataServices(
            @JsonProperty("identifier") String identifier,
            @JsonProperty("endpoint") String endpoint,
            @JsonProperty("token") Optional<String> token,
            @JsonProperty("secret") Optional<String> secret,
            @JsonProperty("status") PostUsersSignInDataStatus status) {
        Utils.checkNotNull(identifier, "identifier");
        Utils.checkNotNull(endpoint, "endpoint");
        Utils.checkNotNull(token, "token");
        Utils.checkNotNull(secret, "secret");
        Utils.checkNotNull(status, "status");
        this.identifier = identifier;
        this.endpoint = endpoint;
        this.token = token;
        this.secret = secret;
        this.status = status;
    }
    
    public PostUsersSignInDataServices(
            String identifier,
            String endpoint,
            PostUsersSignInDataStatus status) {
        this(identifier, endpoint, Optional.empty(), Optional.empty(), status);
    }

    @JsonIgnore
    public String identifier() {
        return identifier;
    }

    @JsonIgnore
    public String endpoint() {
        return endpoint;
    }

    @JsonIgnore
    public Optional<String> token() {
        return token;
    }

    @JsonIgnore
    public Optional<String> secret() {
        return secret;
    }

    @JsonIgnore
    public PostUsersSignInDataStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostUsersSignInDataServices withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    public PostUsersSignInDataServices withEndpoint(String endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = endpoint;
        return this;
    }

    public PostUsersSignInDataServices withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = Optional.ofNullable(token);
        return this;
    }

    public PostUsersSignInDataServices withToken(Optional<String> token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
        return this;
    }

    public PostUsersSignInDataServices withSecret(String secret) {
        Utils.checkNotNull(secret, "secret");
        this.secret = Optional.ofNullable(secret);
        return this;
    }

    public PostUsersSignInDataServices withSecret(Optional<String> secret) {
        Utils.checkNotNull(secret, "secret");
        this.secret = secret;
        return this;
    }

    public PostUsersSignInDataServices withStatus(PostUsersSignInDataStatus status) {
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
        PostUsersSignInDataServices other = (PostUsersSignInDataServices) o;
        return 
            Objects.deepEquals(this.identifier, other.identifier) &&
            Objects.deepEquals(this.endpoint, other.endpoint) &&
            Objects.deepEquals(this.token, other.token) &&
            Objects.deepEquals(this.secret, other.secret) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            identifier,
            endpoint,
            token,
            secret,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostUsersSignInDataServices.class,
                "identifier", identifier,
                "endpoint", endpoint,
                "token", token,
                "secret", secret,
                "status", status);
    }
    
    public final static class Builder {
 
        private String identifier;
 
        private String endpoint;
 
        private Optional<String> token = Optional.empty();
 
        private Optional<String> secret = Optional.empty();
 
        private PostUsersSignInDataStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder identifier(String identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }

        public Builder endpoint(String endpoint) {
            Utils.checkNotNull(endpoint, "endpoint");
            this.endpoint = endpoint;
            return this;
        }

        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = Optional.ofNullable(token);
            return this;
        }

        public Builder token(Optional<String> token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }

        public Builder secret(String secret) {
            Utils.checkNotNull(secret, "secret");
            this.secret = Optional.ofNullable(secret);
            return this;
        }

        public Builder secret(Optional<String> secret) {
            Utils.checkNotNull(secret, "secret");
            this.secret = secret;
            return this;
        }

        public Builder status(PostUsersSignInDataStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public PostUsersSignInDataServices build() {
            return new PostUsersSignInDataServices(
                identifier,
                endpoint,
                token,
                secret,
                status);
        }
    }
}

