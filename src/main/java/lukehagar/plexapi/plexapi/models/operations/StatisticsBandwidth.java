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

public class StatisticsBandwidth {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountID")
    private Optional<? extends Integer> accountID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deviceID")
    private Optional<? extends Integer> deviceID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timespan")
    private Optional<? extends Long> timespan;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("at")
    private Optional<? extends Integer> at;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lan")
    private Optional<? extends Boolean> lan;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bytes")
    private Optional<? extends Long> bytes;

    @JsonCreator
    public StatisticsBandwidth(
            @JsonProperty("accountID") Optional<? extends Integer> accountID,
            @JsonProperty("deviceID") Optional<? extends Integer> deviceID,
            @JsonProperty("timespan") Optional<? extends Long> timespan,
            @JsonProperty("at") Optional<? extends Integer> at,
            @JsonProperty("lan") Optional<? extends Boolean> lan,
            @JsonProperty("bytes") Optional<? extends Long> bytes) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(deviceID, "deviceID");
        Utils.checkNotNull(timespan, "timespan");
        Utils.checkNotNull(at, "at");
        Utils.checkNotNull(lan, "lan");
        Utils.checkNotNull(bytes, "bytes");
        this.accountID = accountID;
        this.deviceID = deviceID;
        this.timespan = timespan;
        this.at = at;
        this.lan = lan;
        this.bytes = bytes;
    }
    
    public StatisticsBandwidth() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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
    public Optional<Long> timespan() {
        return (Optional<Long>) timespan;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> at() {
        return (Optional<Integer>) at;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> lan() {
        return (Optional<Boolean>) lan;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> bytes() {
        return (Optional<Long>) bytes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public StatisticsBandwidth withAccountID(int accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = Optional.ofNullable(accountID);
        return this;
    }

    public StatisticsBandwidth withAccountID(Optional<? extends Integer> accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public StatisticsBandwidth withDeviceID(int deviceID) {
        Utils.checkNotNull(deviceID, "deviceID");
        this.deviceID = Optional.ofNullable(deviceID);
        return this;
    }

    public StatisticsBandwidth withDeviceID(Optional<? extends Integer> deviceID) {
        Utils.checkNotNull(deviceID, "deviceID");
        this.deviceID = deviceID;
        return this;
    }

    public StatisticsBandwidth withTimespan(long timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = Optional.ofNullable(timespan);
        return this;
    }

    public StatisticsBandwidth withTimespan(Optional<? extends Long> timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = timespan;
        return this;
    }

    public StatisticsBandwidth withAt(int at) {
        Utils.checkNotNull(at, "at");
        this.at = Optional.ofNullable(at);
        return this;
    }

    public StatisticsBandwidth withAt(Optional<? extends Integer> at) {
        Utils.checkNotNull(at, "at");
        this.at = at;
        return this;
    }

    public StatisticsBandwidth withLan(boolean lan) {
        Utils.checkNotNull(lan, "lan");
        this.lan = Optional.ofNullable(lan);
        return this;
    }

    public StatisticsBandwidth withLan(Optional<? extends Boolean> lan) {
        Utils.checkNotNull(lan, "lan");
        this.lan = lan;
        return this;
    }

    public StatisticsBandwidth withBytes(long bytes) {
        Utils.checkNotNull(bytes, "bytes");
        this.bytes = Optional.ofNullable(bytes);
        return this;
    }

    public StatisticsBandwidth withBytes(Optional<? extends Long> bytes) {
        Utils.checkNotNull(bytes, "bytes");
        this.bytes = bytes;
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
        StatisticsBandwidth other = (StatisticsBandwidth) o;
        return 
            java.util.Objects.deepEquals(this.accountID, other.accountID) &&
            java.util.Objects.deepEquals(this.deviceID, other.deviceID) &&
            java.util.Objects.deepEquals(this.timespan, other.timespan) &&
            java.util.Objects.deepEquals(this.at, other.at) &&
            java.util.Objects.deepEquals(this.lan, other.lan) &&
            java.util.Objects.deepEquals(this.bytes, other.bytes);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountID,
            deviceID,
            timespan,
            at,
            lan,
            bytes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StatisticsBandwidth.class,
                "accountID", accountID,
                "deviceID", deviceID,
                "timespan", timespan,
                "at", at,
                "lan", lan,
                "bytes", bytes);
    }
    
    public final static class Builder {
 
        private Optional<? extends Integer> accountID = Optional.empty();
 
        private Optional<? extends Integer> deviceID = Optional.empty();
 
        private Optional<? extends Long> timespan = Optional.empty();
 
        private Optional<? extends Integer> at = Optional.empty();
 
        private Optional<? extends Boolean> lan = Optional.empty();
 
        private Optional<? extends Long> bytes = Optional.empty();  
        
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

        public Builder timespan(long timespan) {
            Utils.checkNotNull(timespan, "timespan");
            this.timespan = Optional.ofNullable(timespan);
            return this;
        }

        public Builder timespan(Optional<? extends Long> timespan) {
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

        public Builder lan(boolean lan) {
            Utils.checkNotNull(lan, "lan");
            this.lan = Optional.ofNullable(lan);
            return this;
        }

        public Builder lan(Optional<? extends Boolean> lan) {
            Utils.checkNotNull(lan, "lan");
            this.lan = lan;
            return this;
        }

        public Builder bytes(long bytes) {
            Utils.checkNotNull(bytes, "bytes");
            this.bytes = Optional.ofNullable(bytes);
            return this;
        }

        public Builder bytes(Optional<? extends Long> bytes) {
            Utils.checkNotNull(bytes, "bytes");
            this.bytes = bytes;
            return this;
        }
        
        public StatisticsBandwidth build() {
            return new StatisticsBandwidth(
                accountID,
                deviceID,
                timespan,
                at,
                lan,
                bytes);
        }
    }
}

