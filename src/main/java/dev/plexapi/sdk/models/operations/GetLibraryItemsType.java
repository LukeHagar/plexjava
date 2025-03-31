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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GetLibraryItemsType {

    @JsonProperty("key")
    private String key;

    @JsonProperty("type")
    private String type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subtype")
    private Optional<String> subtype;

    @JsonProperty("title")
    private String title;

    @JsonProperty("active")
    private boolean active;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Filter")
    private Optional<? extends List<GetLibraryItemsFilter>> filter;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Sort")
    private Optional<? extends List<GetLibraryItemsSort>> sort;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Field")
    private Optional<? extends List<GetLibraryItemsField>> field;

    @JsonCreator
    public GetLibraryItemsType(
            @JsonProperty("key") String key,
            @JsonProperty("type") String type,
            @JsonProperty("subtype") Optional<String> subtype,
            @JsonProperty("title") String title,
            @JsonProperty("active") boolean active,
            @JsonProperty("Filter") Optional<? extends List<GetLibraryItemsFilter>> filter,
            @JsonProperty("Sort") Optional<? extends List<GetLibraryItemsSort>> sort,
            @JsonProperty("Field") Optional<? extends List<GetLibraryItemsField>> field) {
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(subtype, "subtype");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(field, "field");
        this.key = key;
        this.type = type;
        this.subtype = subtype;
        this.title = title;
        this.active = active;
        this.filter = filter;
        this.sort = sort;
        this.field = field;
    }
    
    public GetLibraryItemsType(
            String key,
            String type,
            String title,
            boolean active) {
        this(key, type, Optional.empty(), title, active, Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String key() {
        return key;
    }

    @JsonIgnore
    public String type() {
        return type;
    }

    @JsonIgnore
    public Optional<String> subtype() {
        return subtype;
    }

    @JsonIgnore
    public String title() {
        return title;
    }

    @JsonIgnore
    public boolean active() {
        return active;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetLibraryItemsFilter>> filter() {
        return (Optional<List<GetLibraryItemsFilter>>) filter;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetLibraryItemsSort>> sort() {
        return (Optional<List<GetLibraryItemsSort>>) sort;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetLibraryItemsField>> field() {
        return (Optional<List<GetLibraryItemsField>>) field;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetLibraryItemsType withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetLibraryItemsType withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetLibraryItemsType withSubtype(String subtype) {
        Utils.checkNotNull(subtype, "subtype");
        this.subtype = Optional.ofNullable(subtype);
        return this;
    }

    public GetLibraryItemsType withSubtype(Optional<String> subtype) {
        Utils.checkNotNull(subtype, "subtype");
        this.subtype = subtype;
        return this;
    }

    public GetLibraryItemsType withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public GetLibraryItemsType withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    public GetLibraryItemsType withFilter(List<GetLibraryItemsFilter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    public GetLibraryItemsType withFilter(Optional<? extends List<GetLibraryItemsFilter>> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    public GetLibraryItemsType withSort(List<GetLibraryItemsSort> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    public GetLibraryItemsType withSort(Optional<? extends List<GetLibraryItemsSort>> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    public GetLibraryItemsType withField(List<GetLibraryItemsField> field) {
        Utils.checkNotNull(field, "field");
        this.field = Optional.ofNullable(field);
        return this;
    }

    public GetLibraryItemsType withField(Optional<? extends List<GetLibraryItemsField>> field) {
        Utils.checkNotNull(field, "field");
        this.field = field;
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
        GetLibraryItemsType other = (GetLibraryItemsType) o;
        return 
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.subtype, other.subtype) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.sort, other.sort) &&
            Objects.deepEquals(this.field, other.field);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            key,
            type,
            subtype,
            title,
            active,
            filter,
            sort,
            field);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLibraryItemsType.class,
                "key", key,
                "type", type,
                "subtype", subtype,
                "title", title,
                "active", active,
                "filter", filter,
                "sort", sort,
                "field", field);
    }
    
    public final static class Builder {
 
        private String key;
 
        private String type;
 
        private Optional<String> subtype = Optional.empty();
 
        private String title;
 
        private Boolean active;
 
        private Optional<? extends List<GetLibraryItemsFilter>> filter = Optional.empty();
 
        private Optional<? extends List<GetLibraryItemsSort>> sort = Optional.empty();
 
        private Optional<? extends List<GetLibraryItemsField>> field = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder subtype(String subtype) {
            Utils.checkNotNull(subtype, "subtype");
            this.subtype = Optional.ofNullable(subtype);
            return this;
        }

        public Builder subtype(Optional<String> subtype) {
            Utils.checkNotNull(subtype, "subtype");
            this.subtype = subtype;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        public Builder filter(List<GetLibraryItemsFilter> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        public Builder filter(Optional<? extends List<GetLibraryItemsFilter>> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        public Builder sort(List<GetLibraryItemsSort> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = Optional.ofNullable(sort);
            return this;
        }

        public Builder sort(Optional<? extends List<GetLibraryItemsSort>> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = sort;
            return this;
        }

        public Builder field(List<GetLibraryItemsField> field) {
            Utils.checkNotNull(field, "field");
            this.field = Optional.ofNullable(field);
            return this;
        }

        public Builder field(Optional<? extends List<GetLibraryItemsField>> field) {
            Utils.checkNotNull(field, "field");
            this.field = field;
            return this;
        }
        
        public GetLibraryItemsType build() {
            return new GetLibraryItemsType(
                key,
                type,
                subtype,
                title,
                active,
                filter,
                sort,
                field);
        }
    }
}
