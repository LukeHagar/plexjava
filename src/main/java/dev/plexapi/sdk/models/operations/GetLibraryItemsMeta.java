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
 * GetLibraryItemsMeta
 * 
 * <p>The Meta object is only included in the response if the `includeMeta` parameter is set to `1`.
 */
public class GetLibraryItemsMeta {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Type")
    private Optional<? extends List<GetLibraryItemsLibraryResponseType>> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("FieldType")
    private Optional<? extends List<GetLibraryItemsLibraryFieldType>> fieldType;

    @JsonCreator
    public GetLibraryItemsMeta(
            @JsonProperty("Type") Optional<? extends List<GetLibraryItemsLibraryResponseType>> type,
            @JsonProperty("FieldType") Optional<? extends List<GetLibraryItemsLibraryFieldType>> fieldType) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(fieldType, "fieldType");
        this.type = type;
        this.fieldType = fieldType;
    }
    
    public GetLibraryItemsMeta() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetLibraryItemsLibraryResponseType>> type() {
        return (Optional<List<GetLibraryItemsLibraryResponseType>>) type;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetLibraryItemsLibraryFieldType>> fieldType() {
        return (Optional<List<GetLibraryItemsLibraryFieldType>>) fieldType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetLibraryItemsMeta withType(List<GetLibraryItemsLibraryResponseType> type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public GetLibraryItemsMeta withType(Optional<? extends List<GetLibraryItemsLibraryResponseType>> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetLibraryItemsMeta withFieldType(List<GetLibraryItemsLibraryFieldType> fieldType) {
        Utils.checkNotNull(fieldType, "fieldType");
        this.fieldType = Optional.ofNullable(fieldType);
        return this;
    }

    public GetLibraryItemsMeta withFieldType(Optional<? extends List<GetLibraryItemsLibraryFieldType>> fieldType) {
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
        GetLibraryItemsMeta other = (GetLibraryItemsMeta) o;
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
        return Utils.toString(GetLibraryItemsMeta.class,
                "type", type,
                "fieldType", fieldType);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<GetLibraryItemsLibraryResponseType>> type = Optional.empty();
 
        private Optional<? extends List<GetLibraryItemsLibraryFieldType>> fieldType = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(List<GetLibraryItemsLibraryResponseType> type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends List<GetLibraryItemsLibraryResponseType>> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder fieldType(List<GetLibraryItemsLibraryFieldType> fieldType) {
            Utils.checkNotNull(fieldType, "fieldType");
            this.fieldType = Optional.ofNullable(fieldType);
            return this;
        }

        public Builder fieldType(Optional<? extends List<GetLibraryItemsLibraryFieldType>> fieldType) {
            Utils.checkNotNull(fieldType, "fieldType");
            this.fieldType = fieldType;
            return this;
        }
        
        public GetLibraryItemsMeta build() {
            return new GetLibraryItemsMeta(
                type,
                fieldType);
        }
    }
}
