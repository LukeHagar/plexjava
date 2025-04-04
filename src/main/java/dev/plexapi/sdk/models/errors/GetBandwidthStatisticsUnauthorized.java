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
import java.io.InputStream;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * GetBandwidthStatisticsUnauthorized
 * 
 * <p>Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
 */
@SuppressWarnings("serial")
public class GetBandwidthStatisticsUnauthorized extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    private Optional<? extends List<GetBandwidthStatisticsStatisticsErrors>> errors;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("RawResponse")
    private Optional<? extends HttpResponse<InputStream>> rawResponse;

    @JsonCreator
    public GetBandwidthStatisticsUnauthorized(
            @JsonProperty("errors") Optional<? extends List<GetBandwidthStatisticsStatisticsErrors>> errors,
            @JsonProperty("RawResponse") Optional<? extends HttpResponse<InputStream>> rawResponse) {
        Utils.checkNotNull(errors, "errors");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.errors = errors;
        this.rawResponse = rawResponse;
    }
    
    public GetBandwidthStatisticsUnauthorized() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetBandwidthStatisticsStatisticsErrors>> errors() {
        return (Optional<List<GetBandwidthStatisticsStatisticsErrors>>) errors;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<HttpResponse<InputStream>> rawResponse() {
        return (Optional<HttpResponse<InputStream>>) rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetBandwidthStatisticsUnauthorized withErrors(List<GetBandwidthStatisticsStatisticsErrors> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = Optional.ofNullable(errors);
        return this;
    }

    public GetBandwidthStatisticsUnauthorized withErrors(Optional<? extends List<GetBandwidthStatisticsStatisticsErrors>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetBandwidthStatisticsUnauthorized withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = Optional.ofNullable(rawResponse);
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetBandwidthStatisticsUnauthorized withRawResponse(Optional<? extends HttpResponse<InputStream>> rawResponse) {
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
        GetBandwidthStatisticsUnauthorized other = (GetBandwidthStatisticsUnauthorized) o;
        return 
            Objects.deepEquals(this.errors, other.errors) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            errors,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBandwidthStatisticsUnauthorized.class,
                "errors", errors,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<GetBandwidthStatisticsStatisticsErrors>> errors = Optional.empty();
 
        private Optional<? extends HttpResponse<InputStream>> rawResponse;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder errors(List<GetBandwidthStatisticsStatisticsErrors> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = Optional.ofNullable(errors);
            return this;
        }

        public Builder errors(Optional<? extends List<GetBandwidthStatisticsStatisticsErrors>> errors) {
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
        
        public GetBandwidthStatisticsUnauthorized build() {
            return new GetBandwidthStatisticsUnauthorized(
                errors,
                rawResponse);
        }
    }
}

