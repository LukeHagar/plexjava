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

public class Field {

    @JsonProperty("key")
    private String key;

    @JsonProperty("title")
    private String title;

    @JsonProperty("type")
    private String type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subType")
    private Optional<String> subType;

    @JsonCreator
    public Field(
            @JsonProperty("key") String key,
            @JsonProperty("title") String title,
            @JsonProperty("type") String type,
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
    
    public Field(
            String key,
            String title,
            String type) {
        this(key, title, type, Optional.empty());
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
    public Optional<String> subType() {
        return subType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public Field withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public Field withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public Field withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public Field withSubType(String subType) {
        Utils.checkNotNull(subType, "subType");
        this.subType = Optional.ofNullable(subType);
        return this;
    }

    public Field withSubType(Optional<String> subType) {
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
        Field other = (Field) o;
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
        return Utils.toString(Field.class,
                "key", key,
                "title", title,
                "type", type,
                "subType", subType);
    }
    
    public final static class Builder {
 
        private String key;
 
        private String title;
 
        private String type;
 
        private Optional<String> subType = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
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
        
        public Field build() {
            return new Field(
                key,
                title,
                type,
                subType);
        }
    }
}
