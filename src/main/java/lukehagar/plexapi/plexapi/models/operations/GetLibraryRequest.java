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
import java.util.Optional;
import lukehagar.plexapi.plexapi.utils.LazySingletonValue;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;
import lukehagar.plexapi.plexapi.utils.Utils;

public class GetLibraryRequest {

    /**
     * the Id of the library to query
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sectionId")
    private double sectionId;

    /**
     * Whether or not to include details for a section (types, filters, and sorts). 
     * Only exists for backwards compatibility, media providers other than the server libraries have it on always.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeDetails")
    private Optional<? extends IncludeDetails> includeDetails;

    @JsonCreator
    public GetLibraryRequest(
            double sectionId,
            Optional<? extends IncludeDetails> includeDetails) {
        Utils.checkNotNull(sectionId, "sectionId");
        Utils.checkNotNull(includeDetails, "includeDetails");
        this.sectionId = sectionId;
        this.includeDetails = includeDetails;
    }
    
    public GetLibraryRequest(
            double sectionId) {
        this(sectionId, Optional.empty());
    }

    /**
     * the Id of the library to query
     */
    @JsonIgnore
    public double sectionId() {
        return sectionId;
    }

    /**
     * Whether or not to include details for a section (types, filters, and sorts). 
     * Only exists for backwards compatibility, media providers other than the server libraries have it on always.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IncludeDetails> includeDetails() {
        return (Optional<IncludeDetails>) includeDetails;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * the Id of the library to query
     */
    public GetLibraryRequest withSectionId(double sectionId) {
        Utils.checkNotNull(sectionId, "sectionId");
        this.sectionId = sectionId;
        return this;
    }

    /**
     * Whether or not to include details for a section (types, filters, and sorts). 
     * Only exists for backwards compatibility, media providers other than the server libraries have it on always.
     * 
     */
    public GetLibraryRequest withIncludeDetails(IncludeDetails includeDetails) {
        Utils.checkNotNull(includeDetails, "includeDetails");
        this.includeDetails = Optional.ofNullable(includeDetails);
        return this;
    }

    /**
     * Whether or not to include details for a section (types, filters, and sorts). 
     * Only exists for backwards compatibility, media providers other than the server libraries have it on always.
     * 
     */
    public GetLibraryRequest withIncludeDetails(Optional<? extends IncludeDetails> includeDetails) {
        Utils.checkNotNull(includeDetails, "includeDetails");
        this.includeDetails = includeDetails;
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
        GetLibraryRequest other = (GetLibraryRequest) o;
        return 
            java.util.Objects.deepEquals(this.sectionId, other.sectionId) &&
            java.util.Objects.deepEquals(this.includeDetails, other.includeDetails);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            sectionId,
            includeDetails);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLibraryRequest.class,
                "sectionId", sectionId,
                "includeDetails", includeDetails);
    }
    
    public final static class Builder {
 
        private Double sectionId;
 
        private Optional<? extends IncludeDetails> includeDetails;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * the Id of the library to query
         */
        public Builder sectionId(double sectionId) {
            Utils.checkNotNull(sectionId, "sectionId");
            this.sectionId = sectionId;
            return this;
        }

        /**
         * Whether or not to include details for a section (types, filters, and sorts). 
         * Only exists for backwards compatibility, media providers other than the server libraries have it on always.
         * 
         */
        public Builder includeDetails(IncludeDetails includeDetails) {
            Utils.checkNotNull(includeDetails, "includeDetails");
            this.includeDetails = Optional.ofNullable(includeDetails);
            return this;
        }

        /**
         * Whether or not to include details for a section (types, filters, and sorts). 
         * Only exists for backwards compatibility, media providers other than the server libraries have it on always.
         * 
         */
        public Builder includeDetails(Optional<? extends IncludeDetails> includeDetails) {
            Utils.checkNotNull(includeDetails, "includeDetails");
            this.includeDetails = includeDetails;
            return this;
        }
        
        public GetLibraryRequest build() {
            if (includeDetails == null) {
                includeDetails = _SINGLETON_VALUE_IncludeDetails.value();
            }
            return new GetLibraryRequest(
                sectionId,
                includeDetails);
        }

        private static final LazySingletonValue<Optional<? extends IncludeDetails>> _SINGLETON_VALUE_IncludeDetails =
                new LazySingletonValue<>(
                        "includeDetails",
                        "0",
                        new TypeReference<Optional<? extends IncludeDetails>>() {});
    }
}
