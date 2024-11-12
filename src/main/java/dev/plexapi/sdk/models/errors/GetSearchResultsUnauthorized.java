/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * GetSearchResultsUnauthorized - Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
 */
@SuppressWarnings("serial")
public class GetSearchResultsUnauthorized extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    private Optional<? extends List<GetSearchResultsSearchErrors>> errors;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("RawResponse")
    private Optional<? extends HttpResponse<InputStream>> rawResponse;

    @JsonCreator
    public GetSearchResultsUnauthorized(
            @JsonProperty("errors") Optional<? extends List<GetSearchResultsSearchErrors>> errors,
            @JsonProperty("RawResponse") Optional<? extends HttpResponse<InputStream>> rawResponse) {
        Utils.checkNotNull(errors, "errors");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.errors = errors;
        this.rawResponse = rawResponse;
    }
    
    public GetSearchResultsUnauthorized() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    public Optional<List<GetSearchResultsSearchErrors>> errors(){
        return (Optional<List<GetSearchResultsSearchErrors>>) errors;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @SuppressWarnings("unchecked")
    public Optional<HttpResponse<InputStream>> rawResponse(){
        return (Optional<HttpResponse<InputStream>>) rawResponse;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public GetSearchResultsUnauthorized withErrors(List<GetSearchResultsSearchErrors> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = Optional.ofNullable(errors);
        return this;
    }
    
    public GetSearchResultsUnauthorized withErrors(Optional<? extends List<GetSearchResultsSearchErrors>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetSearchResultsUnauthorized withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = Optional.ofNullable(rawResponse);
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetSearchResultsUnauthorized withRawResponse(Optional<? extends HttpResponse<InputStream>> rawResponse) {
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
        GetSearchResultsUnauthorized other = (GetSearchResultsUnauthorized) o;
        return
            Objects.deepEquals(this.errors, other.errors) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            errors,
            rawResponse);
    }

    @Override
    public String toString() {
        return Utils.toString(GetSearchResultsUnauthorized.class,
                "errors", errors,
                "rawResponse", rawResponse);
    }

    public final static class Builder {

        private Optional<? extends List<GetSearchResultsSearchErrors>> errors = Optional.empty();

        private Optional<? extends HttpResponse<InputStream>> rawResponse;

        private Builder() {
          // force use of static builder() method
        }

        public Builder errors(List<GetSearchResultsSearchErrors> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = Optional.ofNullable(errors);
            return this;
        }
        
        public Builder errors(Optional<? extends List<GetSearchResultsSearchErrors>> errors) {
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

        public GetSearchResultsUnauthorized build() {
            return new GetSearchResultsUnauthorized(
                errors,
                rawResponse);
        }
    }
}
