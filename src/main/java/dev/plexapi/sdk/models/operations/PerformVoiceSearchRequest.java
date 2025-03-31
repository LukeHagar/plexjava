/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.utils.LazySingletonValue;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class PerformVoiceSearchRequest {

    /**
     * The query term
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    private String query;

    /**
     * This gives context to the search, and can result in re-ordering of search result hubs
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sectionId")
    private Optional<Double> sectionId;

    /**
     * The number of items to return per hub
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<Double> limit;

    @JsonCreator
    public PerformVoiceSearchRequest(
            String query,
            Optional<Double> sectionId,
            Optional<Double> limit) {
        Utils.checkNotNull(query, "query");
        Utils.checkNotNull(sectionId, "sectionId");
        Utils.checkNotNull(limit, "limit");
        this.query = query;
        this.sectionId = sectionId;
        this.limit = limit;
    }
    
    public PerformVoiceSearchRequest(
            String query) {
        this(query, Optional.empty(), Optional.empty());
    }

    /**
     * The query term
     */
    @JsonIgnore
    public String query() {
        return query;
    }

    /**
     * This gives context to the search, and can result in re-ordering of search result hubs
     */
    @JsonIgnore
    public Optional<Double> sectionId() {
        return sectionId;
    }

    /**
     * The number of items to return per hub
     */
    @JsonIgnore
    public Optional<Double> limit() {
        return limit;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The query term
     */
    public PerformVoiceSearchRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }

    /**
     * This gives context to the search, and can result in re-ordering of search result hubs
     */
    public PerformVoiceSearchRequest withSectionId(double sectionId) {
        Utils.checkNotNull(sectionId, "sectionId");
        this.sectionId = Optional.ofNullable(sectionId);
        return this;
    }

    /**
     * This gives context to the search, and can result in re-ordering of search result hubs
     */
    public PerformVoiceSearchRequest withSectionId(Optional<Double> sectionId) {
        Utils.checkNotNull(sectionId, "sectionId");
        this.sectionId = sectionId;
        return this;
    }

    /**
     * The number of items to return per hub
     */
    public PerformVoiceSearchRequest withLimit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * The number of items to return per hub
     */
    public PerformVoiceSearchRequest withLimit(Optional<Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
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
        PerformVoiceSearchRequest other = (PerformVoiceSearchRequest) o;
        return 
            Objects.deepEquals(this.query, other.query) &&
            Objects.deepEquals(this.sectionId, other.sectionId) &&
            Objects.deepEquals(this.limit, other.limit);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            query,
            sectionId,
            limit);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PerformVoiceSearchRequest.class,
                "query", query,
                "sectionId", sectionId,
                "limit", limit);
    }
    
    public final static class Builder {
 
        private String query;
 
        private Optional<Double> sectionId = Optional.empty();
 
        private Optional<Double> limit;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The query term
         */
        public Builder query(String query) {
            Utils.checkNotNull(query, "query");
            this.query = query;
            return this;
        }

        /**
         * This gives context to the search, and can result in re-ordering of search result hubs
         */
        public Builder sectionId(double sectionId) {
            Utils.checkNotNull(sectionId, "sectionId");
            this.sectionId = Optional.ofNullable(sectionId);
            return this;
        }

        /**
         * This gives context to the search, and can result in re-ordering of search result hubs
         */
        public Builder sectionId(Optional<Double> sectionId) {
            Utils.checkNotNull(sectionId, "sectionId");
            this.sectionId = sectionId;
            return this;
        }

        /**
         * The number of items to return per hub
         */
        public Builder limit(double limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * The number of items to return per hub
         */
        public Builder limit(Optional<Double> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }
        
        public PerformVoiceSearchRequest build() {
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }
            return new PerformVoiceSearchRequest(
                query,
                sectionId,
                limit);
        }

        private static final LazySingletonValue<Optional<Double>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "3",
                        new TypeReference<Optional<Double>>() {});
    }
}
