/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class GetServerActivitiesMediaContainer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<? extends Double> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Activity")
    private Optional<? extends java.util.List<Activity>> activity;

    @JsonCreator
    public GetServerActivitiesMediaContainer(
            @JsonProperty("size") Optional<? extends Double> size,
            @JsonProperty("Activity") Optional<? extends java.util.List<Activity>> activity) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(activity, "activity");
        this.size = size;
        this.activity = activity;
    }
    
    public GetServerActivitiesMediaContainer() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> size() {
        return (Optional<Double>) size;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<Activity>> activity() {
        return (Optional<java.util.List<Activity>>) activity;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetServerActivitiesMediaContainer withSize(double size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetServerActivitiesMediaContainer withSize(Optional<? extends Double> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetServerActivitiesMediaContainer withActivity(java.util.List<Activity> activity) {
        Utils.checkNotNull(activity, "activity");
        this.activity = Optional.ofNullable(activity);
        return this;
    }

    public GetServerActivitiesMediaContainer withActivity(Optional<? extends java.util.List<Activity>> activity) {
        Utils.checkNotNull(activity, "activity");
        this.activity = activity;
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
        GetServerActivitiesMediaContainer other = (GetServerActivitiesMediaContainer) o;
        return 
            java.util.Objects.deepEquals(this.size, other.size) &&
            java.util.Objects.deepEquals(this.activity, other.activity);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            size,
            activity);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetServerActivitiesMediaContainer.class,
                "size", size,
                "activity", activity);
    }
    
    public final static class Builder {
 
        private Optional<? extends Double> size = Optional.empty();
 
        private Optional<? extends java.util.List<Activity>> activity = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder size(double size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        public Builder size(Optional<? extends Double> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        public Builder activity(java.util.List<Activity> activity) {
            Utils.checkNotNull(activity, "activity");
            this.activity = Optional.ofNullable(activity);
            return this;
        }

        public Builder activity(Optional<? extends java.util.List<Activity>> activity) {
            Utils.checkNotNull(activity, "activity");
            this.activity = activity;
            return this;
        }
        
        public GetServerActivitiesMediaContainer build() {
            return new GetServerActivitiesMediaContainer(
                size,
                activity);
        }
    }
}
