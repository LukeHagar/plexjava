/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class GetRecentlyAddedLibraryFilter {

    @JsonProperty("filter")
    private String filter;

    @JsonProperty("filterType")
    private String filterType;

    @JsonProperty("key")
    private String key;

    @JsonProperty("title")
    private String title;

    @JsonProperty("type")
    private String type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("advanced")
    private Optional<Boolean> advanced;

    @JsonCreator
    public GetRecentlyAddedLibraryFilter(
            @JsonProperty("filter") String filter,
            @JsonProperty("filterType") String filterType,
            @JsonProperty("key") String key,
            @JsonProperty("title") String title,
            @JsonProperty("type") String type,
            @JsonProperty("advanced") Optional<Boolean> advanced) {
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(filterType, "filterType");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(advanced, "advanced");
        this.filter = filter;
        this.filterType = filterType;
        this.key = key;
        this.title = title;
        this.type = type;
        this.advanced = advanced;
    }
    
    public GetRecentlyAddedLibraryFilter(
            String filter,
            String filterType,
            String key,
            String title,
            String type) {
        this(filter, filterType, key, title, type, Optional.empty());
    }

    @JsonIgnore
    public String filter() {
        return filter;
    }

    @JsonIgnore
    public String filterType() {
        return filterType;
    }

    @JsonIgnore
    public String key() {
        return key;
    }

    @JsonIgnore
    public String title() {
        return title;
    }

    @JsonIgnore
    public String type() {
        return type;
    }

    @JsonIgnore
    public Optional<Boolean> advanced() {
        return advanced;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetRecentlyAddedLibraryFilter withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    public GetRecentlyAddedLibraryFilter withFilterType(String filterType) {
        Utils.checkNotNull(filterType, "filterType");
        this.filterType = filterType;
        return this;
    }

    public GetRecentlyAddedLibraryFilter withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetRecentlyAddedLibraryFilter withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public GetRecentlyAddedLibraryFilter withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetRecentlyAddedLibraryFilter withAdvanced(boolean advanced) {
        Utils.checkNotNull(advanced, "advanced");
        this.advanced = Optional.ofNullable(advanced);
        return this;
    }

    public GetRecentlyAddedLibraryFilter withAdvanced(Optional<Boolean> advanced) {
        Utils.checkNotNull(advanced, "advanced");
        this.advanced = advanced;
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
        GetRecentlyAddedLibraryFilter other = (GetRecentlyAddedLibraryFilter) o;
        return 
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.filterType, other.filterType) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.advanced, other.advanced);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            filter,
            filterType,
            key,
            title,
            type,
            advanced);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetRecentlyAddedLibraryFilter.class,
                "filter", filter,
                "filterType", filterType,
                "key", key,
                "title", title,
                "type", type,
                "advanced", advanced);
    }
    
    public final static class Builder {
 
        private String filter;
 
        private String filterType;
 
        private String key;
 
        private String title;
 
        private String type;
 
        private Optional<Boolean> advanced = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        public Builder filterType(String filterType) {
            Utils.checkNotNull(filterType, "filterType");
            this.filterType = filterType;
            return this;
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder advanced(boolean advanced) {
            Utils.checkNotNull(advanced, "advanced");
            this.advanced = Optional.ofNullable(advanced);
            return this;
        }

        public Builder advanced(Optional<Boolean> advanced) {
            Utils.checkNotNull(advanced, "advanced");
            this.advanced = advanced;
            return this;
        }
        
        public GetRecentlyAddedLibraryFilter build() {
            return new GetRecentlyAddedLibraryFilter(
                filter,
                filterType,
                key,
                title,
                type,
                advanced);
        }
    }
}
