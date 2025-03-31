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

public class GetLibraryDetailsFieldType {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Operator")
    private Optional<? extends List<GetLibraryDetailsOperator>> operator;

    @JsonCreator
    public GetLibraryDetailsFieldType(
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("Operator") Optional<? extends List<GetLibraryDetailsOperator>> operator) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(operator, "operator");
        this.type = type;
        this.operator = operator;
    }
    
    public GetLibraryDetailsFieldType() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetLibraryDetailsOperator>> operator() {
        return (Optional<List<GetLibraryDetailsOperator>>) operator;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetLibraryDetailsFieldType withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public GetLibraryDetailsFieldType withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetLibraryDetailsFieldType withOperator(List<GetLibraryDetailsOperator> operator) {
        Utils.checkNotNull(operator, "operator");
        this.operator = Optional.ofNullable(operator);
        return this;
    }

    public GetLibraryDetailsFieldType withOperator(Optional<? extends List<GetLibraryDetailsOperator>> operator) {
        Utils.checkNotNull(operator, "operator");
        this.operator = operator;
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
        GetLibraryDetailsFieldType other = (GetLibraryDetailsFieldType) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.operator, other.operator);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            operator);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLibraryDetailsFieldType.class,
                "type", type,
                "operator", operator);
    }
    
    public final static class Builder {
 
        private Optional<String> type = Optional.empty();
 
        private Optional<? extends List<GetLibraryDetailsOperator>> operator = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
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

        public Builder operator(List<GetLibraryDetailsOperator> operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = Optional.ofNullable(operator);
            return this;
        }

        public Builder operator(Optional<? extends List<GetLibraryDetailsOperator>> operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }
        
        public GetLibraryDetailsFieldType build() {
            return new GetLibraryDetailsFieldType(
                type,
                operator);
        }
    }
}
