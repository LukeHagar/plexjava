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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GetCompanionsDataResponse implements Response {

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
     * Companions Data
     */
    private Optional<? extends List<ResponseBody>> responseBodies;

    @JsonCreator
    public GetCompanionsDataResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends List<ResponseBody>> responseBodies) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(responseBodies, "responseBodies");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.responseBodies = responseBodies;
    }
    
    public GetCompanionsDataResponse(
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
     * Companions Data
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ResponseBody>> responseBodies() {
        return (Optional<List<ResponseBody>>) responseBodies;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetCompanionsDataResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetCompanionsDataResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetCompanionsDataResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Companions Data
     */
    public GetCompanionsDataResponse withResponseBodies(List<ResponseBody> responseBodies) {
        Utils.checkNotNull(responseBodies, "responseBodies");
        this.responseBodies = Optional.ofNullable(responseBodies);
        return this;
    }

    /**
     * Companions Data
     */
    public GetCompanionsDataResponse withResponseBodies(Optional<? extends List<ResponseBody>> responseBodies) {
        Utils.checkNotNull(responseBodies, "responseBodies");
        this.responseBodies = responseBodies;
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
        GetCompanionsDataResponse other = (GetCompanionsDataResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.responseBodies, other.responseBodies);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            responseBodies);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCompanionsDataResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "responseBodies", responseBodies);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends List<ResponseBody>> responseBodies = Optional.empty();  
        
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
         * Companions Data
         */
        public Builder responseBodies(List<ResponseBody> responseBodies) {
            Utils.checkNotNull(responseBodies, "responseBodies");
            this.responseBodies = Optional.ofNullable(responseBodies);
            return this;
        }

        /**
         * Companions Data
         */
        public Builder responseBodies(Optional<? extends List<ResponseBody>> responseBodies) {
            Utils.checkNotNull(responseBodies, "responseBodies");
            this.responseBodies = responseBodies;
            return this;
        }
        
        public GetCompanionsDataResponse build() {
            return new GetCompanionsDataResponse(
                contentType,
                statusCode,
                rawResponse,
                responseBodies);
        }
    }
}

