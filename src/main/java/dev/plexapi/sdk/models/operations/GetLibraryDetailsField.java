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


public class GetLibraryDetailsField {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subType")
    private Optional<String> subType;

    @JsonCreator
    public GetLibraryDetailsField(
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("subType") Optional<String> subType) {
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(subType, "subType");
        this.key = key;
        this.title = title;
        this.type = type;
        this.subType = subType;
    }
    
    public GetLibraryDetailsField() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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

    @JsonIgnore
    public Optional<String> subType() {
        return subType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLibraryDetailsField withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetLibraryDetailsField withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetLibraryDetailsField withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public GetLibraryDetailsField withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public GetLibraryDetailsField withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public GetLibraryDetailsField withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetLibraryDetailsField withSubType(String subType) {
        Utils.checkNotNull(subType, "subType");
        this.subType = Optional.ofNullable(subType);
        return this;
    }

    public GetLibraryDetailsField withSubType(Optional<String> subType) {
        Utils.checkNotNull(subType, "subType");
        this.subType = subType;
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
        GetLibraryDetailsField other = (GetLibraryDetailsField) o;
        return 
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.subType, other.subType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            key,
            title,
            type,
            subType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLibraryDetailsField.class,
                "key", key,
                "title", title,
                "type", type,
                "subType", subType);
    }
    
    public final static class Builder {
 
        private Optional<String> key = Optional.empty();
 
        private Optional<String> title = Optional.empty();
 
        private Optional<String> type = Optional.empty();
 
        private Optional<String> subType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder subType(String subType) {
            Utils.checkNotNull(subType, "subType");
            this.subType = Optional.ofNullable(subType);
            return this;
        }

        public Builder subType(Optional<String> subType) {
            Utils.checkNotNull(subType, "subType");
            this.subType = subType;
            return this;
        }
        
        public GetLibraryDetailsField build() {
            return new GetLibraryDetailsField(
                key,
                title,
                type,
                subType);
        }
    }
}
