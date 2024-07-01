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
import java.net.http.HttpResponse;
import java.util.Optional;
import lukehagar.plexapi.plexapi.utils.Utils;

/**
 * GetTimelineResponseBody - Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
 */
public class GetTimelineResponseBody extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    private Optional<? extends java.util.List<GetTimelineErrors>> errors;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("-")
    private Optional<? extends HttpResponse<InputStream>> rawResponse;

    @JsonCreator
    public GetTimelineResponseBody(
            @JsonProperty("errors") Optional<? extends java.util.List<GetTimelineErrors>> errors,
            @JsonProperty("RawResponse") Optional<? extends HttpResponse<InputStream>> rawResponse) {
        Utils.checkNotNull(errors, "errors");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.errors = errors;
        this.rawResponse = rawResponse;
    }
    
    public GetTimelineResponseBody() {
        this(Optional.empty(), Optional.empty());
    }

    public Optional<? extends java.util.List<GetTimelineErrors>> errors(){
        return errors;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public Optional<? extends HttpResponse<InputStream>> rawResponse(){
        return rawResponse;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public GetTimelineResponseBody withErrors(java.util.List<GetTimelineErrors> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = Optional.ofNullable(errors);
        return this;
    }
    
    public GetTimelineResponseBody withErrors(Optional<? extends java.util.List<GetTimelineErrors>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetTimelineResponseBody withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = Optional.ofNullable(rawResponse);
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetTimelineResponseBody withRawResponse(Optional<? extends HttpResponse<InputStream>> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
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
        GetTimelineResponseBody other = (GetTimelineResponseBody) o;
        return
            java.util.Objects.deepEquals(this.errors, other.errors) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            errors,
            rawResponse);
    }

    @Override
    public String toString() {
        return Utils.toString(GetTimelineResponseBody.class,
                "errors", errors,
                "rawResponse", rawResponse);
    }

    public final static class Builder {

        private Optional<? extends java.util.List<GetTimelineErrors>> errors = Optional.empty();

        private Optional<? extends HttpResponse<InputStream>> rawResponse;

        private Builder() {
          // force use of static builder() method
        }

        public Builder errors(java.util.List<GetTimelineErrors> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = Optional.ofNullable(errors);
            return this;
        }
        
        public Builder errors(Optional<? extends java.util.List<GetTimelineErrors>> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = errors;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = Optional.ofNullable(rawResponse);
            return this;
        }
        
        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(Optional<? extends HttpResponse<InputStream>> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        public GetTimelineResponseBody build() {
            return new GetTimelineResponseBody(
                errors,
                rawResponse);
        }
    }
}
