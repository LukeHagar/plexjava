/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class PostUsersSignInDataRequest {

    /**
     * The unique identifier for the client application
     * This is used to track the client application and its usage
     * (UUID, serial number, or other number unique per device)
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=X-Plex-Client-Identifier")
    private Optional<String> xPlexClientIdentifier;

    /**
     * Login credentials
     */
    @SpeakeasyMetadata("request:mediaType=application/x-www-form-urlencoded")
    private Optional<? extends PostUsersSignInDataRequestBody> requestBody;

    @JsonCreator
    public PostUsersSignInDataRequest(
            Optional<String> xPlexClientIdentifier,
            Optional<? extends PostUsersSignInDataRequestBody> requestBody) {
        Utils.checkNotNull(xPlexClientIdentifier, "xPlexClientIdentifier");
        Utils.checkNotNull(requestBody, "requestBody");
        this.xPlexClientIdentifier = xPlexClientIdentifier;
        this.requestBody = requestBody;
    }
    
    public PostUsersSignInDataRequest() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The unique identifier for the client application
     * This is used to track the client application and its usage
     * (UUID, serial number, or other number unique per device)
     * 
     */
    @JsonIgnore
    public Optional<String> xPlexClientIdentifier() {
        return xPlexClientIdentifier;
    }

    /**
     * Login credentials
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostUsersSignInDataRequestBody> requestBody() {
        return (Optional<PostUsersSignInDataRequestBody>) requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identifier for the client application
     * This is used to track the client application and its usage
     * (UUID, serial number, or other number unique per device)
     * 
     */
    public PostUsersSignInDataRequest withXPlexClientIdentifier(String xPlexClientIdentifier) {
        Utils.checkNotNull(xPlexClientIdentifier, "xPlexClientIdentifier");
        this.xPlexClientIdentifier = Optional.ofNullable(xPlexClientIdentifier);
        return this;
    }

    /**
     * The unique identifier for the client application
     * This is used to track the client application and its usage
     * (UUID, serial number, or other number unique per device)
     * 
     */
    public PostUsersSignInDataRequest withXPlexClientIdentifier(Optional<String> xPlexClientIdentifier) {
        Utils.checkNotNull(xPlexClientIdentifier, "xPlexClientIdentifier");
        this.xPlexClientIdentifier = xPlexClientIdentifier;
        return this;
    }

    /**
     * Login credentials
     */
    public PostUsersSignInDataRequest withRequestBody(PostUsersSignInDataRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    /**
     * Login credentials
     */
    public PostUsersSignInDataRequest withRequestBody(Optional<? extends PostUsersSignInDataRequestBody> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
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
        PostUsersSignInDataRequest other = (PostUsersSignInDataRequest) o;
        return 
            Objects.deepEquals(this.xPlexClientIdentifier, other.xPlexClientIdentifier) &&
            Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xPlexClientIdentifier,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostUsersSignInDataRequest.class,
                "xPlexClientIdentifier", xPlexClientIdentifier,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private Optional<String> xPlexClientIdentifier = Optional.empty();
 
        private Optional<? extends PostUsersSignInDataRequestBody> requestBody = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identifier for the client application
         * This is used to track the client application and its usage
         * (UUID, serial number, or other number unique per device)
         * 
         */
        public Builder xPlexClientIdentifier(String xPlexClientIdentifier) {
            Utils.checkNotNull(xPlexClientIdentifier, "xPlexClientIdentifier");
            this.xPlexClientIdentifier = Optional.ofNullable(xPlexClientIdentifier);
            return this;
        }

        /**
         * The unique identifier for the client application
         * This is used to track the client application and its usage
         * (UUID, serial number, or other number unique per device)
         * 
         */
        public Builder xPlexClientIdentifier(Optional<String> xPlexClientIdentifier) {
            Utils.checkNotNull(xPlexClientIdentifier, "xPlexClientIdentifier");
            this.xPlexClientIdentifier = xPlexClientIdentifier;
            return this;
        }

        /**
         * Login credentials
         */
        public Builder requestBody(PostUsersSignInDataRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        /**
         * Login credentials
         */
        public Builder requestBody(Optional<? extends PostUsersSignInDataRequestBody> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public PostUsersSignInDataRequest build() {
            return new PostUsersSignInDataRequest(
                xPlexClientIdentifier,
                requestBody);
        }
    }
}
