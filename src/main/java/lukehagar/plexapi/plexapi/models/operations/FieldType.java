/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import lukehagar.plexapi.plexapi.utils.Utils;


public class FieldType {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Operator")
    private Optional<? extends java.util.List<Operator>> operator;

    public FieldType(
            @JsonProperty("type") Optional<? extends String> type,
            @JsonProperty("Operator") Optional<? extends java.util.List<Operator>> operator) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(operator, "operator");
        this.type = type;
        this.operator = operator;
    }

    public Optional<? extends String> type() {
        return type;
    }

    public Optional<? extends java.util.List<Operator>> operator() {
        return operator;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FieldType withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public FieldType withType(Optional<? extends String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public FieldType withOperator(java.util.List<Operator> operator) {
        Utils.checkNotNull(operator, "operator");
        this.operator = Optional.ofNullable(operator);
        return this;
    }

    public FieldType withOperator(Optional<? extends java.util.List<Operator>> operator) {
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
        FieldType other = (FieldType) o;
        return 
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.operator, other.operator);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            type,
            operator);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FieldType.class,
                "type", type,
                "operator", operator);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> type = Optional.empty();
 
        private Optional<? extends java.util.List<Operator>> operator = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder operator(java.util.List<Operator> operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = Optional.ofNullable(operator);
            return this;
        }

        public Builder operator(Optional<? extends java.util.List<Operator>> operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }
        
        public FieldType build() {
            return new FieldType(
                type,
                operator);
        }
    }
}

