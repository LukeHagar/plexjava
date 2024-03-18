/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;
import lukehagar.plexapi.plexapi.utils.Utils;


public class GetPlaylistContentsResponse implements lukehagar.plexapi.plexapi.utils.Response {

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
     * The playlist contents
     */
    private Optional<? extends GetPlaylistContentsResponseBody> twoHundredApplicationJsonObject;

    /**
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    private Optional<? extends GetPlaylistContentsPlaylistsResponseBody> fourHundredAndOneApplicationJsonObject;

    public GetPlaylistContentsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetPlaylistContentsResponseBody> twoHundredApplicationJsonObject,
            Optional<? extends GetPlaylistContentsPlaylistsResponseBody> fourHundredAndOneApplicationJsonObject) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(twoHundredApplicationJsonObject, "twoHundredApplicationJsonObject");
        Utils.checkNotNull(fourHundredAndOneApplicationJsonObject, "fourHundredAndOneApplicationJsonObject");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.twoHundredApplicationJsonObject = twoHundredApplicationJsonObject;
        this.fourHundredAndOneApplicationJsonObject = fourHundredAndOneApplicationJsonObject;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * The playlist contents
     */
    public Optional<? extends GetPlaylistContentsResponseBody> twoHundredApplicationJsonObject() {
        return twoHundredApplicationJsonObject;
    }

    /**
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    public Optional<? extends GetPlaylistContentsPlaylistsResponseBody> fourHundredAndOneApplicationJsonObject() {
        return fourHundredAndOneApplicationJsonObject;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetPlaylistContentsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetPlaylistContentsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetPlaylistContentsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The playlist contents
     */
    public GetPlaylistContentsResponse withTwoHundredApplicationJsonObject(GetPlaylistContentsResponseBody twoHundredApplicationJsonObject) {
        Utils.checkNotNull(twoHundredApplicationJsonObject, "twoHundredApplicationJsonObject");
        this.twoHundredApplicationJsonObject = Optional.ofNullable(twoHundredApplicationJsonObject);
        return this;
    }

    /**
     * The playlist contents
     */
    public GetPlaylistContentsResponse withTwoHundredApplicationJsonObject(Optional<? extends GetPlaylistContentsResponseBody> twoHundredApplicationJsonObject) {
        Utils.checkNotNull(twoHundredApplicationJsonObject, "twoHundredApplicationJsonObject");
        this.twoHundredApplicationJsonObject = twoHundredApplicationJsonObject;
        return this;
    }

    /**
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    public GetPlaylistContentsResponse withFourHundredAndOneApplicationJsonObject(GetPlaylistContentsPlaylistsResponseBody fourHundredAndOneApplicationJsonObject) {
        Utils.checkNotNull(fourHundredAndOneApplicationJsonObject, "fourHundredAndOneApplicationJsonObject");
        this.fourHundredAndOneApplicationJsonObject = Optional.ofNullable(fourHundredAndOneApplicationJsonObject);
        return this;
    }

    /**
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    public GetPlaylistContentsResponse withFourHundredAndOneApplicationJsonObject(Optional<? extends GetPlaylistContentsPlaylistsResponseBody> fourHundredAndOneApplicationJsonObject) {
        Utils.checkNotNull(fourHundredAndOneApplicationJsonObject, "fourHundredAndOneApplicationJsonObject");
        this.fourHundredAndOneApplicationJsonObject = fourHundredAndOneApplicationJsonObject;
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
        GetPlaylistContentsResponse other = (GetPlaylistContentsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.twoHundredApplicationJsonObject, other.twoHundredApplicationJsonObject) &&
            java.util.Objects.deepEquals(this.fourHundredAndOneApplicationJsonObject, other.fourHundredAndOneApplicationJsonObject);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            twoHundredApplicationJsonObject,
            fourHundredAndOneApplicationJsonObject);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPlaylistContentsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "twoHundredApplicationJsonObject", twoHundredApplicationJsonObject,
                "fourHundredAndOneApplicationJsonObject", fourHundredAndOneApplicationJsonObject);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetPlaylistContentsResponseBody> twoHundredApplicationJsonObject = Optional.empty();
 
        private Optional<? extends GetPlaylistContentsPlaylistsResponseBody> fourHundredAndOneApplicationJsonObject = Optional.empty();  
        
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
         * The playlist contents
         */
        public Builder twoHundredApplicationJsonObject(GetPlaylistContentsResponseBody twoHundredApplicationJsonObject) {
            Utils.checkNotNull(twoHundredApplicationJsonObject, "twoHundredApplicationJsonObject");
            this.twoHundredApplicationJsonObject = Optional.ofNullable(twoHundredApplicationJsonObject);
            return this;
        }

        /**
         * The playlist contents
         */
        public Builder twoHundredApplicationJsonObject(Optional<? extends GetPlaylistContentsResponseBody> twoHundredApplicationJsonObject) {
            Utils.checkNotNull(twoHundredApplicationJsonObject, "twoHundredApplicationJsonObject");
            this.twoHundredApplicationJsonObject = twoHundredApplicationJsonObject;
            return this;
        }

        /**
         * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
         */
        public Builder fourHundredAndOneApplicationJsonObject(GetPlaylistContentsPlaylistsResponseBody fourHundredAndOneApplicationJsonObject) {
            Utils.checkNotNull(fourHundredAndOneApplicationJsonObject, "fourHundredAndOneApplicationJsonObject");
            this.fourHundredAndOneApplicationJsonObject = Optional.ofNullable(fourHundredAndOneApplicationJsonObject);
            return this;
        }

        /**
         * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
         */
        public Builder fourHundredAndOneApplicationJsonObject(Optional<? extends GetPlaylistContentsPlaylistsResponseBody> fourHundredAndOneApplicationJsonObject) {
            Utils.checkNotNull(fourHundredAndOneApplicationJsonObject, "fourHundredAndOneApplicationJsonObject");
            this.fourHundredAndOneApplicationJsonObject = fourHundredAndOneApplicationJsonObject;
            return this;
        }
        
        public GetPlaylistContentsResponse build() {
            return new GetPlaylistContentsResponse(
                contentType,
                statusCode,
                rawResponse,
                twoHundredApplicationJsonObject,
                fourHundredAndOneApplicationJsonObject);
        }
    }
}

