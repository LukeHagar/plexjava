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


public class GetFileHashResponse implements lukehagar.plexapi.plexapi.utils.Response {

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
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    private Optional<? extends GetFileHashResponseBody> object;

    public GetFileHashResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetFileHashResponseBody> object) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(object, "object");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.object = object;
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
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    public Optional<? extends GetFileHashResponseBody> object() {
        return object;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetFileHashResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetFileHashResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetFileHashResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    public GetFileHashResponse withObject(GetFileHashResponseBody object) {
        Utils.checkNotNull(object, "object");
        this.object = Optional.ofNullable(object);
        return this;
    }

    /**
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    public GetFileHashResponse withObject(Optional<? extends GetFileHashResponseBody> object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
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
        GetFileHashResponse other = (GetFileHashResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.object, other.object);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            object);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFileHashResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "object", object);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetFileHashResponseBody> object = Optional.empty();  
        
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
         * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
         */
        public Builder object(GetFileHashResponseBody object) {
            Utils.checkNotNull(object, "object");
            this.object = Optional.ofNullable(object);
            return this;
        }

        /**
         * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
         */
        public Builder object(Optional<? extends GetFileHashResponseBody> object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }
        
        public GetFileHashResponse build() {
            return new GetFileHashResponse(
                contentType,
                statusCode,
                rawResponse,
                object);
        }
    }
}

