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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Meta - The Meta object is only included in the response if the `includeMeta` parameter is set to `1`.
 * 
 */

public class Meta {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Type")
    private Optional<? extends List<GetRecentlyAddedType>> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("FieldType")
    private Optional<? extends List<GetRecentlyAddedFieldType>> fieldType;

    @JsonCreator
    public Meta(
            @JsonProperty("Type") Optional<? extends List<GetRecentlyAddedType>> type,
            @JsonProperty("FieldType") Optional<? extends List<GetRecentlyAddedFieldType>> fieldType) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(fieldType, "fieldType");
        this.type = type;
        this.fieldType = fieldType;
    }
    
    public Meta() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetRecentlyAddedType>> type() {
        return (Optional<List<GetRecentlyAddedType>>) type;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetRecentlyAddedFieldType>> fieldType() {
        return (Optional<List<GetRecentlyAddedFieldType>>) fieldType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Meta withType(List<GetRecentlyAddedType> type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public Meta withType(Optional<? extends List<GetRecentlyAddedType>> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public Meta withFieldType(List<GetRecentlyAddedFieldType> fieldType) {
        Utils.checkNotNull(fieldType, "fieldType");
        this.fieldType = Optional.ofNullable(fieldType);
        return this;
    }

    public Meta withFieldType(Optional<? extends List<GetRecentlyAddedFieldType>> fieldType) {
        Utils.checkNotNull(fieldType, "fieldType");
        this.fieldType = fieldType;
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
        Meta other = (Meta) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.fieldType, other.fieldType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            fieldType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Meta.class,
                "type", type,
                "fieldType", fieldType);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<GetRecentlyAddedType>> type = Optional.empty();
 
        private Optional<? extends List<GetRecentlyAddedFieldType>> fieldType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(List<GetRecentlyAddedType> type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends List<GetRecentlyAddedType>> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder fieldType(List<GetRecentlyAddedFieldType> fieldType) {
            Utils.checkNotNull(fieldType, "fieldType");
            this.fieldType = Optional.ofNullable(fieldType);
            return this;
        }

        public Builder fieldType(Optional<? extends List<GetRecentlyAddedFieldType>> fieldType) {
            Utils.checkNotNull(fieldType, "fieldType");
            this.fieldType = fieldType;
            return this;
        }
        
        public Meta build() {
            return new Meta(
                type,
                fieldType);
        }
    }
}
