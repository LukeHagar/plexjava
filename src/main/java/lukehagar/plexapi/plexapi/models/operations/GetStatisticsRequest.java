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

public class GetStatisticsRequest {

    /**
     * The timespan to retrieve statistics for
     * the exact meaning of this parameter is not known
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=Timespan")
    private Optional<? extends Long> timespan;

    @JsonCreator
    public GetStatisticsRequest(
            Optional<? extends Long> timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = timespan;
    }
    
    public GetStatisticsRequest() {
        this(Optional.empty());
    }

    /**
     * The timespan to retrieve statistics for
     * the exact meaning of this parameter is not known
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> timespan() {
        return (Optional<Long>) timespan;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The timespan to retrieve statistics for
     * the exact meaning of this parameter is not known
     * 
     */
    public GetStatisticsRequest withTimespan(long timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = Optional.ofNullable(timespan);
        return this;
    }

    /**
     * The timespan to retrieve statistics for
     * the exact meaning of this parameter is not known
     * 
     */
    public GetStatisticsRequest withTimespan(Optional<? extends Long> timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = timespan;
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
        GetStatisticsRequest other = (GetStatisticsRequest) o;
        return 
            java.util.Objects.deepEquals(this.timespan, other.timespan);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            timespan);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetStatisticsRequest.class,
                "timespan", timespan);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> timespan = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The timespan to retrieve statistics for
         * the exact meaning of this parameter is not known
         * 
         */
        public Builder timespan(long timespan) {
            Utils.checkNotNull(timespan, "timespan");
            this.timespan = Optional.ofNullable(timespan);
            return this;
        }

        /**
         * The timespan to retrieve statistics for
         * the exact meaning of this parameter is not known
         * 
         */
        public Builder timespan(Optional<? extends Long> timespan) {
            Utils.checkNotNull(timespan, "timespan");
            this.timespan = timespan;
            return this;
        }
        
        public GetStatisticsRequest build() {
            return new GetStatisticsRequest(
                timespan);
        }
    }
}
