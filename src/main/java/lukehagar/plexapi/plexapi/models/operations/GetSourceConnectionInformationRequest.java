/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;
import lukehagar.plexapi.plexapi.utils.Utils;

public class GetSourceConnectionInformationRequest {

    /**
     * The source identifier with an included prefix.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=source")
    private String source;

    @JsonCreator
    public GetSourceConnectionInformationRequest(
            String source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
    }

    /**
     * The source identifier with an included prefix.
     */
    @JsonIgnore
    public String source() {
        return source;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The source identifier with an included prefix.
     */
    public GetSourceConnectionInformationRequest withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
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
        GetSourceConnectionInformationRequest other = (GetSourceConnectionInformationRequest) o;
        return 
            java.util.Objects.deepEquals(this.source, other.source);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            source);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSourceConnectionInformationRequest.class,
                "source", source);
    }
    
    public final static class Builder {
 
        private String source;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The source identifier with an included prefix.
         */
        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }
        
        public GetSourceConnectionInformationRequest build() {
            return new GetSourceConnectionInformationRequest(
                source);
        }
    }
}

