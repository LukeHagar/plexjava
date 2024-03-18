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


public class GetPlaylistsResponse implements lukehagar.plexapi.plexapi.utils.Response {

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
     * returns all playlists
     */
    private Optional<? extends GetPlaylistsResponseBody> twoHundredApplicationJsonObject;

    /**
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    private Optional<? extends GetPlaylistsPlaylistsResponseBody> fourHundredAndOneApplicationJsonObject;

    public GetPlaylistsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetPlaylistsResponseBody> twoHundredApplicationJsonObject,
            Optional<? extends GetPlaylistsPlaylistsResponseBody> fourHundredAndOneApplicationJsonObject) {
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
     * returns all playlists
     */
    public Optional<? extends GetPlaylistsResponseBody> twoHundredApplicationJsonObject() {
        return twoHundredApplicationJsonObject;
    }

    /**
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    public Optional<? extends GetPlaylistsPlaylistsResponseBody> fourHundredAndOneApplicationJsonObject() {
        return fourHundredAndOneApplicationJsonObject;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetPlaylistsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetPlaylistsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetPlaylistsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * returns all playlists
     */
    public GetPlaylistsResponse withTwoHundredApplicationJsonObject(GetPlaylistsResponseBody twoHundredApplicationJsonObject) {
        Utils.checkNotNull(twoHundredApplicationJsonObject, "twoHundredApplicationJsonObject");
        this.twoHundredApplicationJsonObject = Optional.ofNullable(twoHundredApplicationJsonObject);
        return this;
    }

    /**
     * returns all playlists
     */
    public GetPlaylistsResponse withTwoHundredApplicationJsonObject(Optional<? extends GetPlaylistsResponseBody> twoHundredApplicationJsonObject) {
        Utils.checkNotNull(twoHundredApplicationJsonObject, "twoHundredApplicationJsonObject");
        this.twoHundredApplicationJsonObject = twoHundredApplicationJsonObject;
        return this;
    }

    /**
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    public GetPlaylistsResponse withFourHundredAndOneApplicationJsonObject(GetPlaylistsPlaylistsResponseBody fourHundredAndOneApplicationJsonObject) {
        Utils.checkNotNull(fourHundredAndOneApplicationJsonObject, "fourHundredAndOneApplicationJsonObject");
        this.fourHundredAndOneApplicationJsonObject = Optional.ofNullable(fourHundredAndOneApplicationJsonObject);
        return this;
    }

    /**
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    public GetPlaylistsResponse withFourHundredAndOneApplicationJsonObject(Optional<? extends GetPlaylistsPlaylistsResponseBody> fourHundredAndOneApplicationJsonObject) {
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
        GetPlaylistsResponse other = (GetPlaylistsResponse) o;
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
        return Utils.toString(GetPlaylistsResponse.class,
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
 
        private Optional<? extends GetPlaylistsResponseBody> twoHundredApplicationJsonObject = Optional.empty();
 
        private Optional<? extends GetPlaylistsPlaylistsResponseBody> fourHundredAndOneApplicationJsonObject = Optional.empty();  
        
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
         * returns all playlists
         */
        public Builder twoHundredApplicationJsonObject(GetPlaylistsResponseBody twoHundredApplicationJsonObject) {
            Utils.checkNotNull(twoHundredApplicationJsonObject, "twoHundredApplicationJsonObject");
            this.twoHundredApplicationJsonObject = Optional.ofNullable(twoHundredApplicationJsonObject);
            return this;
        }

        /**
         * returns all playlists
         */
        public Builder twoHundredApplicationJsonObject(Optional<? extends GetPlaylistsResponseBody> twoHundredApplicationJsonObject) {
            Utils.checkNotNull(twoHundredApplicationJsonObject, "twoHundredApplicationJsonObject");
            this.twoHundredApplicationJsonObject = twoHundredApplicationJsonObject;
            return this;
        }

        /**
         * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
         */
        public Builder fourHundredAndOneApplicationJsonObject(GetPlaylistsPlaylistsResponseBody fourHundredAndOneApplicationJsonObject) {
            Utils.checkNotNull(fourHundredAndOneApplicationJsonObject, "fourHundredAndOneApplicationJsonObject");
            this.fourHundredAndOneApplicationJsonObject = Optional.ofNullable(fourHundredAndOneApplicationJsonObject);
            return this;
        }

        /**
         * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
         */
        public Builder fourHundredAndOneApplicationJsonObject(Optional<? extends GetPlaylistsPlaylistsResponseBody> fourHundredAndOneApplicationJsonObject) {
            Utils.checkNotNull(fourHundredAndOneApplicationJsonObject, "fourHundredAndOneApplicationJsonObject");
            this.fourHundredAndOneApplicationJsonObject = fourHundredAndOneApplicationJsonObject;
            return this;
        }
        
        public GetPlaylistsResponse build() {
            return new GetPlaylistsResponse(
                contentType,
                statusCode,
                rawResponse,
                twoHundredApplicationJsonObject,
                fourHundredAndOneApplicationJsonObject);
        }
    }
}

