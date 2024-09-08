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
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetLibraryDetailsFilter {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    private Optional<String> filter;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filterType")
    private Optional<String> filterType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonCreator
    public GetLibraryDetailsFilter(
            @JsonProperty("filter") Optional<String> filter,
            @JsonProperty("filterType") Optional<String> filterType,
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("type") Optional<String> type) {
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(filterType, "filterType");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(type, "type");
        this.filter = filter;
        this.filterType = filterType;
        this.key = key;
        this.title = title;
        this.type = type;
    }
    
    public GetLibraryDetailsFilter() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> filter() {
        return filter;
    }

    @JsonIgnore
    public Optional<String> filterType() {
        return filterType;
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLibraryDetailsFilter withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    public GetLibraryDetailsFilter withFilter(Optional<String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    public GetLibraryDetailsFilter withFilterType(String filterType) {
        Utils.checkNotNull(filterType, "filterType");
        this.filterType = Optional.ofNullable(filterType);
        return this;
    }

    public GetLibraryDetailsFilter withFilterType(Optional<String> filterType) {
        Utils.checkNotNull(filterType, "filterType");
        this.filterType = filterType;
        return this;
    }

    public GetLibraryDetailsFilter withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetLibraryDetailsFilter withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetLibraryDetailsFilter withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public GetLibraryDetailsFilter withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public GetLibraryDetailsFilter withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public GetLibraryDetailsFilter withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        GetLibraryDetailsFilter other = (GetLibraryDetailsFilter) o;
        return 
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.filterType, other.filterType) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            filter,
            filterType,
            key,
            title,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLibraryDetailsFilter.class,
                "filter", filter,
                "filterType", filterType,
                "key", key,
                "title", title,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> filter = Optional.empty();
 
        private Optional<String> filterType = Optional.empty();
 
        private Optional<String> key = Optional.empty();
 
        private Optional<String> title = Optional.empty();
 
        private Optional<String> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        public Builder filter(Optional<String> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        public Builder filterType(String filterType) {
            Utils.checkNotNull(filterType, "filterType");
            this.filterType = Optional.ofNullable(filterType);
            return this;
        }

        public Builder filterType(Optional<String> filterType) {
            Utils.checkNotNull(filterType, "filterType");
            this.filterType = filterType;
            return this;
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public GetLibraryDetailsFilter build() {
            return new GetLibraryDetailsFilter(
                filter,
                filterType,
                key,
                title,
                type);
        }
    }
}
