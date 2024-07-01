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
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;
import lukehagar.plexapi.plexapi.utils.Utils;

public class ApplyUpdatesRequest {

    /**
     * Indicate that you want the update to run during the next Butler execution. Omitting this or setting it to false indicates that the update should install
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tonight")
    private Optional<? extends Tonight> tonight;

    /**
     * Indicate that the latest version should be marked as skipped. The &lt;Release&gt; entry for this version will have the `state` set to `skipped`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=skip")
    private Optional<? extends Skip> skip;

    @JsonCreator
    public ApplyUpdatesRequest(
            Optional<? extends Tonight> tonight,
            Optional<? extends Skip> skip) {
        Utils.checkNotNull(tonight, "tonight");
        Utils.checkNotNull(skip, "skip");
        this.tonight = tonight;
        this.skip = skip;
    }
    
    public ApplyUpdatesRequest() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Indicate that you want the update to run during the next Butler execution. Omitting this or setting it to false indicates that the update should install
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Tonight> tonight() {
        return (Optional<Tonight>) tonight;
    }

    /**
     * Indicate that the latest version should be marked as skipped. The &lt;Release&gt; entry for this version will have the `state` set to `skipped`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Skip> skip() {
        return (Optional<Skip>) skip;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Indicate that you want the update to run during the next Butler execution. Omitting this or setting it to false indicates that the update should install
     */
    public ApplyUpdatesRequest withTonight(Tonight tonight) {
        Utils.checkNotNull(tonight, "tonight");
        this.tonight = Optional.ofNullable(tonight);
        return this;
    }

    /**
     * Indicate that you want the update to run during the next Butler execution. Omitting this or setting it to false indicates that the update should install
     */
    public ApplyUpdatesRequest withTonight(Optional<? extends Tonight> tonight) {
        Utils.checkNotNull(tonight, "tonight");
        this.tonight = tonight;
        return this;
    }

    /**
     * Indicate that the latest version should be marked as skipped. The &lt;Release&gt; entry for this version will have the `state` set to `skipped`.
     */
    public ApplyUpdatesRequest withSkip(Skip skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = Optional.ofNullable(skip);
        return this;
    }

    /**
     * Indicate that the latest version should be marked as skipped. The &lt;Release&gt; entry for this version will have the `state` set to `skipped`.
     */
    public ApplyUpdatesRequest withSkip(Optional<? extends Skip> skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = skip;
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
        ApplyUpdatesRequest other = (ApplyUpdatesRequest) o;
        return 
            java.util.Objects.deepEquals(this.tonight, other.tonight) &&
            java.util.Objects.deepEquals(this.skip, other.skip);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            tonight,
            skip);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApplyUpdatesRequest.class,
                "tonight", tonight,
                "skip", skip);
    }
    
    public final static class Builder {
 
        private Optional<? extends Tonight> tonight = Optional.empty();
 
        private Optional<? extends Skip> skip = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Indicate that you want the update to run during the next Butler execution. Omitting this or setting it to false indicates that the update should install
         */
        public Builder tonight(Tonight tonight) {
            Utils.checkNotNull(tonight, "tonight");
            this.tonight = Optional.ofNullable(tonight);
            return this;
        }

        /**
         * Indicate that you want the update to run during the next Butler execution. Omitting this or setting it to false indicates that the update should install
         */
        public Builder tonight(Optional<? extends Tonight> tonight) {
            Utils.checkNotNull(tonight, "tonight");
            this.tonight = tonight;
            return this;
        }

        /**
         * Indicate that the latest version should be marked as skipped. The &lt;Release&gt; entry for this version will have the `state` set to `skipped`.
         */
        public Builder skip(Skip skip) {
            Utils.checkNotNull(skip, "skip");
            this.skip = Optional.ofNullable(skip);
            return this;
        }

        /**
         * Indicate that the latest version should be marked as skipped. The &lt;Release&gt; entry for this version will have the `state` set to `skipped`.
         */
        public Builder skip(Optional<? extends Skip> skip) {
            Utils.checkNotNull(skip, "skip");
            this.skip = skip;
            return this;
        }
        
        public ApplyUpdatesRequest build() {
            return new ApplyUpdatesRequest(
                tonight,
                skip);
        }
    }
}

