/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class GetTransientTokenRequest {

    /**
     * `delegation` - This is the only supported `type` parameter.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=type")
    private GetTransientTokenQueryParamType type;

    /**
     * `all` - This is the only supported `scope` parameter.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=scope")
    private Scope scope;

    @JsonCreator
    public GetTransientTokenRequest(
            GetTransientTokenQueryParamType type,
            Scope scope) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(scope, "scope");
        this.type = type;
        this.scope = scope;
    }

    /**
     * `delegation` - This is the only supported `type` parameter.
     */
    @JsonIgnore
    public GetTransientTokenQueryParamType type() {
        return type;
    }

    /**
     * `all` - This is the only supported `scope` parameter.
     */
    @JsonIgnore
    public Scope scope() {
        return scope;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * `delegation` - This is the only supported `type` parameter.
     */
    public GetTransientTokenRequest withType(GetTransientTokenQueryParamType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * `all` - This is the only supported `scope` parameter.
     */
    public GetTransientTokenRequest withScope(Scope scope) {
        Utils.checkNotNull(scope, "scope");
        this.scope = scope;
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
        GetTransientTokenRequest other = (GetTransientTokenRequest) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.scope, other.scope);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            scope);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTransientTokenRequest.class,
                "type", type,
                "scope", scope);
    }
    
    public final static class Builder {
 
        private GetTransientTokenQueryParamType type;
 
        private Scope scope;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * `delegation` - This is the only supported `type` parameter.
         */
        public Builder type(GetTransientTokenQueryParamType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * `all` - This is the only supported `scope` parameter.
         */
        public Builder scope(Scope scope) {
            Utils.checkNotNull(scope, "scope");
            this.scope = scope;
            return this;
        }
        
        public GetTransientTokenRequest build() {
            return new GetTransientTokenRequest(
                type,
                scope);
        }
    }
}

