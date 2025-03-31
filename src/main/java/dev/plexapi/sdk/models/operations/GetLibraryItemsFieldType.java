/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class GetLibraryItemsFieldType {

    @JsonProperty("type")
    private String type;

    @JsonProperty("Operator")
    private List<GetLibraryItemsOperator> operator;

    @JsonCreator
    public GetLibraryItemsFieldType(
            @JsonProperty("type") String type,
            @JsonProperty("Operator") List<GetLibraryItemsOperator> operator) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(operator, "operator");
        this.type = type;
        this.operator = operator;
    }

    @JsonIgnore
    public String type() {
        return type;
    }

    @JsonIgnore
    public List<GetLibraryItemsOperator> operator() {
        return operator;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetLibraryItemsFieldType withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetLibraryItemsFieldType withOperator(List<GetLibraryItemsOperator> operator) {
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
        GetLibraryItemsFieldType other = (GetLibraryItemsFieldType) o;
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
        return Utils.toString(GetLibraryItemsFieldType.class,
                "type", type,
                "operator", operator);
    }
    
    public final static class Builder {
 
        private String type;
 
        private List<GetLibraryItemsOperator> operator;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder operator(List<GetLibraryItemsOperator> operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }
        
        public GetLibraryItemsFieldType build() {
            return new GetLibraryItemsFieldType(
                type,
                operator);
        }
    }
}
