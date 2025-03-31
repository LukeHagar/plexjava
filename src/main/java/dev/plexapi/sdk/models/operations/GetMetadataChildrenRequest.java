/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class GetMetadataChildrenRequest {

    /**
     * the id of the library item to return the children of.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ratingKey")
    private double ratingKey;

    /**
     * Adds additional elements to the response. Supported types are (Stream)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeElements")
    private Optional<String> includeElements;

    @JsonCreator
    public GetMetadataChildrenRequest(
            double ratingKey,
            Optional<String> includeElements) {
        Utils.checkNotNull(ratingKey, "ratingKey");
        Utils.checkNotNull(includeElements, "includeElements");
        this.ratingKey = ratingKey;
        this.includeElements = includeElements;
    }
    
    public GetMetadataChildrenRequest(
            double ratingKey) {
        this(ratingKey, Optional.empty());
    }

    /**
     * the id of the library item to return the children of.
     */
    @JsonIgnore
    public double ratingKey() {
        return ratingKey;
    }

    /**
     * Adds additional elements to the response. Supported types are (Stream)
     */
    @JsonIgnore
    public Optional<String> includeElements() {
        return includeElements;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * the id of the library item to return the children of.
     */
    public GetMetadataChildrenRequest withRatingKey(double ratingKey) {
        Utils.checkNotNull(ratingKey, "ratingKey");
        this.ratingKey = ratingKey;
        return this;
    }

    /**
     * Adds additional elements to the response. Supported types are (Stream)
     */
    public GetMetadataChildrenRequest withIncludeElements(String includeElements) {
        Utils.checkNotNull(includeElements, "includeElements");
        this.includeElements = Optional.ofNullable(includeElements);
        return this;
    }

    /**
     * Adds additional elements to the response. Supported types are (Stream)
     */
    public GetMetadataChildrenRequest withIncludeElements(Optional<String> includeElements) {
        Utils.checkNotNull(includeElements, "includeElements");
        this.includeElements = includeElements;
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
        GetMetadataChildrenRequest other = (GetMetadataChildrenRequest) o;
        return 
            Objects.deepEquals(this.ratingKey, other.ratingKey) &&
            Objects.deepEquals(this.includeElements, other.includeElements);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            ratingKey,
            includeElements);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMetadataChildrenRequest.class,
                "ratingKey", ratingKey,
                "includeElements", includeElements);
    }
    
    public final static class Builder {
 
        private Double ratingKey;
 
        private Optional<String> includeElements = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * the id of the library item to return the children of.
         */
        public Builder ratingKey(double ratingKey) {
            Utils.checkNotNull(ratingKey, "ratingKey");
            this.ratingKey = ratingKey;
            return this;
        }

        /**
         * Adds additional elements to the response. Supported types are (Stream)
         */
        public Builder includeElements(String includeElements) {
            Utils.checkNotNull(includeElements, "includeElements");
            this.includeElements = Optional.ofNullable(includeElements);
            return this;
        }

        /**
         * Adds additional elements to the response. Supported types are (Stream)
         */
        public Builder includeElements(Optional<String> includeElements) {
            Utils.checkNotNull(includeElements, "includeElements");
            this.includeElements = includeElements;
            return this;
        }
        
        public GetMetadataChildrenRequest build() {
            return new GetMetadataChildrenRequest(
                ratingKey,
                includeElements);
        }
    }
}
