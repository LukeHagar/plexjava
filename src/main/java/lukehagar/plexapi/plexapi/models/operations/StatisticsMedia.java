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

public class StatisticsMedia {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountID")
    private Optional<? extends Integer> accountID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deviceID")
    private Optional<? extends Integer> deviceID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timespan")
    private Optional<? extends Integer> timespan;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("at")
    private Optional<? extends Integer> at;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadataType")
    private Optional<? extends Integer> metadataType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("count")
    private Optional<? extends Integer> count;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<? extends Integer> duration;

    @JsonCreator
    public StatisticsMedia(
            @JsonProperty("accountID") Optional<? extends Integer> accountID,
            @JsonProperty("deviceID") Optional<? extends Integer> deviceID,
            @JsonProperty("timespan") Optional<? extends Integer> timespan,
            @JsonProperty("at") Optional<? extends Integer> at,
            @JsonProperty("metadataType") Optional<? extends Integer> metadataType,
            @JsonProperty("count") Optional<? extends Integer> count,
            @JsonProperty("duration") Optional<? extends Integer> duration) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(deviceID, "deviceID");
        Utils.checkNotNull(timespan, "timespan");
        Utils.checkNotNull(at, "at");
        Utils.checkNotNull(metadataType, "metadataType");
        Utils.checkNotNull(count, "count");
        Utils.checkNotNull(duration, "duration");
        this.accountID = accountID;
        this.deviceID = deviceID;
        this.timespan = timespan;
        this.at = at;
        this.metadataType = metadataType;
        this.count = count;
        this.duration = duration;
    }
    
    public StatisticsMedia() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> accountID() {
        return (Optional<Integer>) accountID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> deviceID() {
        return (Optional<Integer>) deviceID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> timespan() {
        return (Optional<Integer>) timespan;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> at() {
        return (Optional<Integer>) at;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> metadataType() {
        return (Optional<Integer>) metadataType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> count() {
        return (Optional<Integer>) count;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> duration() {
        return (Optional<Integer>) duration;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public StatisticsMedia withAccountID(int accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = Optional.ofNullable(accountID);
        return this;
    }

    public StatisticsMedia withAccountID(Optional<? extends Integer> accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public StatisticsMedia withDeviceID(int deviceID) {
        Utils.checkNotNull(deviceID, "deviceID");
        this.deviceID = Optional.ofNullable(deviceID);
        return this;
    }

    public StatisticsMedia withDeviceID(Optional<? extends Integer> deviceID) {
        Utils.checkNotNull(deviceID, "deviceID");
        this.deviceID = deviceID;
        return this;
    }

    public StatisticsMedia withTimespan(int timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = Optional.ofNullable(timespan);
        return this;
    }

    public StatisticsMedia withTimespan(Optional<? extends Integer> timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = timespan;
        return this;
    }

    public StatisticsMedia withAt(int at) {
        Utils.checkNotNull(at, "at");
        this.at = Optional.ofNullable(at);
        return this;
    }

    public StatisticsMedia withAt(Optional<? extends Integer> at) {
        Utils.checkNotNull(at, "at");
        this.at = at;
        return this;
    }

    public StatisticsMedia withMetadataType(int metadataType) {
        Utils.checkNotNull(metadataType, "metadataType");
        this.metadataType = Optional.ofNullable(metadataType);
        return this;
    }

    public StatisticsMedia withMetadataType(Optional<? extends Integer> metadataType) {
        Utils.checkNotNull(metadataType, "metadataType");
        this.metadataType = metadataType;
        return this;
    }

    public StatisticsMedia withCount(int count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.ofNullable(count);
        return this;
    }

    public StatisticsMedia withCount(Optional<? extends Integer> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }

    public StatisticsMedia withDuration(int duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    public StatisticsMedia withDuration(Optional<? extends Integer> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
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
        StatisticsMedia other = (StatisticsMedia) o;
        return 
            java.util.Objects.deepEquals(this.accountID, other.accountID) &&
            java.util.Objects.deepEquals(this.deviceID, other.deviceID) &&
            java.util.Objects.deepEquals(this.timespan, other.timespan) &&
            java.util.Objects.deepEquals(this.at, other.at) &&
            java.util.Objects.deepEquals(this.metadataType, other.metadataType) &&
            java.util.Objects.deepEquals(this.count, other.count) &&
            java.util.Objects.deepEquals(this.duration, other.duration);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountID,
            deviceID,
            timespan,
            at,
            metadataType,
            count,
            duration);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StatisticsMedia.class,
                "accountID", accountID,
                "deviceID", deviceID,
                "timespan", timespan,
                "at", at,
                "metadataType", metadataType,
                "count", count,
                "duration", duration);
    }
    
    public final static class Builder {
 
        private Optional<? extends Integer> accountID = Optional.empty();
 
        private Optional<? extends Integer> deviceID = Optional.empty();
 
        private Optional<? extends Integer> timespan = Optional.empty();
 
        private Optional<? extends Integer> at = Optional.empty();
 
        private Optional<? extends Integer> metadataType = Optional.empty();
 
        private Optional<? extends Integer> count = Optional.empty();
 
        private Optional<? extends Integer> duration = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountID(int accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = Optional.ofNullable(accountID);
            return this;
        }

        public Builder accountID(Optional<? extends Integer> accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        public Builder deviceID(int deviceID) {
            Utils.checkNotNull(deviceID, "deviceID");
            this.deviceID = Optional.ofNullable(deviceID);
            return this;
        }

        public Builder deviceID(Optional<? extends Integer> deviceID) {
            Utils.checkNotNull(deviceID, "deviceID");
            this.deviceID = deviceID;
            return this;
        }

        public Builder timespan(int timespan) {
            Utils.checkNotNull(timespan, "timespan");
            this.timespan = Optional.ofNullable(timespan);
            return this;
        }

        public Builder timespan(Optional<? extends Integer> timespan) {
            Utils.checkNotNull(timespan, "timespan");
            this.timespan = timespan;
            return this;
        }

        public Builder at(int at) {
            Utils.checkNotNull(at, "at");
            this.at = Optional.ofNullable(at);
            return this;
        }

        public Builder at(Optional<? extends Integer> at) {
            Utils.checkNotNull(at, "at");
            this.at = at;
            return this;
        }

        public Builder metadataType(int metadataType) {
            Utils.checkNotNull(metadataType, "metadataType");
            this.metadataType = Optional.ofNullable(metadataType);
            return this;
        }

        public Builder metadataType(Optional<? extends Integer> metadataType) {
            Utils.checkNotNull(metadataType, "metadataType");
            this.metadataType = metadataType;
            return this;
        }

        public Builder count(int count) {
            Utils.checkNotNull(count, "count");
            this.count = Optional.ofNullable(count);
            return this;
        }

        public Builder count(Optional<? extends Integer> count) {
            Utils.checkNotNull(count, "count");
            this.count = count;
            return this;
        }

        public Builder duration(int duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = Optional.ofNullable(duration);
            return this;
        }

        public Builder duration(Optional<? extends Integer> duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = duration;
            return this;
        }
        
        public StatisticsMedia build() {
            return new StatisticsMedia(
                accountID,
                deviceID,
                timespan,
                at,
                metadataType,
                count,
                duration);
        }
    }
}

