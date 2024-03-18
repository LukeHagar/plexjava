/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;
import lukehagar.plexapi.plexapi.utils.Utils;


public class RefreshLibraryRequest {

    /**
     * the Id of the library to refresh
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sectionId")
    private double sectionId;

    public RefreshLibraryRequest(
            double sectionId) {
        Utils.checkNotNull(sectionId, "sectionId");
        this.sectionId = sectionId;
    }

    /**
     * the Id of the library to refresh
     */
    public double sectionId() {
        return sectionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * the Id of the library to refresh
     */
    public RefreshLibraryRequest withSectionId(double sectionId) {
        Utils.checkNotNull(sectionId, "sectionId");
        this.sectionId = sectionId;
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
        RefreshLibraryRequest other = (RefreshLibraryRequest) o;
        return 
            java.util.Objects.deepEquals(this.sectionId, other.sectionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            sectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RefreshLibraryRequest.class,
                "sectionId", sectionId);
    }
    
    public final static class Builder {
 
        private Double sectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * the Id of the library to refresh
         */
        public Builder sectionId(double sectionId) {
            Utils.checkNotNull(sectionId, "sectionId");
            this.sectionId = sectionId;
            return this;
        }
        
        public RefreshLibraryRequest build() {
            return new RefreshLibraryRequest(
                sectionId);
        }
    }
}

