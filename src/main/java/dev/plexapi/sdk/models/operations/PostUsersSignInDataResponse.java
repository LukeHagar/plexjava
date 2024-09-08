/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.plexapi.sdk.utils.Response;
import dev.plexapi.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class PostUsersSignInDataResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Returns the user account data with a valid auth token
     */
    private Optional<? extends PostUsersSignInDataUserPlexAccount> userPlexAccount;

    @JsonCreator
    public PostUsersSignInDataResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends PostUsersSignInDataUserPlexAccount> userPlexAccount) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(userPlexAccount, "userPlexAccount");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.userPlexAccount = userPlexAccount;
    }
    
    public PostUsersSignInDataResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Returns the user account data with a valid auth token
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostUsersSignInDataUserPlexAccount> userPlexAccount() {
        return (Optional<PostUsersSignInDataUserPlexAccount>) userPlexAccount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public PostUsersSignInDataResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PostUsersSignInDataResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PostUsersSignInDataResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Returns the user account data with a valid auth token
     */
    public PostUsersSignInDataResponse withUserPlexAccount(PostUsersSignInDataUserPlexAccount userPlexAccount) {
        Utils.checkNotNull(userPlexAccount, "userPlexAccount");
        this.userPlexAccount = Optional.ofNullable(userPlexAccount);
        return this;
    }

    /**
     * Returns the user account data with a valid auth token
     */
    public PostUsersSignInDataResponse withUserPlexAccount(Optional<? extends PostUsersSignInDataUserPlexAccount> userPlexAccount) {
        Utils.checkNotNull(userPlexAccount, "userPlexAccount");
        this.userPlexAccount = userPlexAccount;
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
        PostUsersSignInDataResponse other = (PostUsersSignInDataResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.userPlexAccount, other.userPlexAccount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            userPlexAccount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostUsersSignInDataResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "userPlexAccount", userPlexAccount);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends PostUsersSignInDataUserPlexAccount> userPlexAccount = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Returns the user account data with a valid auth token
         */
        public Builder userPlexAccount(PostUsersSignInDataUserPlexAccount userPlexAccount) {
            Utils.checkNotNull(userPlexAccount, "userPlexAccount");
            this.userPlexAccount = Optional.ofNullable(userPlexAccount);
            return this;
        }

        /**
         * Returns the user account data with a valid auth token
         */
        public Builder userPlexAccount(Optional<? extends PostUsersSignInDataUserPlexAccount> userPlexAccount) {
            Utils.checkNotNull(userPlexAccount, "userPlexAccount");
            this.userPlexAccount = userPlexAccount;
            return this;
        }
        
        public PostUsersSignInDataResponse build() {
            return new PostUsersSignInDataResponse(
                contentType,
                statusCode,
                rawResponse,
                userPlexAccount);
        }
    }
}
