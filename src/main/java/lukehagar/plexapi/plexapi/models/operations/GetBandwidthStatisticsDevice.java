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

public class GetBandwidthStatisticsDevice {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends Integer> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("platform")
    private Optional<? extends String> platform;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("clientIdentifier")
    private Optional<? extends String> clientIdentifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("createdAt")
    private Optional<? extends Integer> createdAt;

    @JsonCreator
    public GetBandwidthStatisticsDevice(
            @JsonProperty("id") Optional<? extends Integer> id,
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("platform") Optional<? extends String> platform,
            @JsonProperty("clientIdentifier") Optional<? extends String> clientIdentifier,
            @JsonProperty("createdAt") Optional<? extends Integer> createdAt) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(platform, "platform");
        Utils.checkNotNull(clientIdentifier, "clientIdentifier");
        Utils.checkNotNull(createdAt, "createdAt");
        this.id = id;
        this.name = name;
        this.platform = platform;
        this.clientIdentifier = clientIdentifier;
        this.createdAt = createdAt;
    }
    
    public GetBandwidthStatisticsDevice() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> id() {
        return (Optional<Integer>) id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> name() {
        return (Optional<String>) name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> platform() {
        return (Optional<String>) platform;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> clientIdentifier() {
        return (Optional<String>) clientIdentifier;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> createdAt() {
        return (Optional<Integer>) createdAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetBandwidthStatisticsDevice withId(int id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GetBandwidthStatisticsDevice withId(Optional<? extends Integer> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetBandwidthStatisticsDevice withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public GetBandwidthStatisticsDevice withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public GetBandwidthStatisticsDevice withPlatform(String platform) {
        Utils.checkNotNull(platform, "platform");
        this.platform = Optional.ofNullable(platform);
        return this;
    }

    public GetBandwidthStatisticsDevice withPlatform(Optional<? extends String> platform) {
        Utils.checkNotNull(platform, "platform");
        this.platform = platform;
        return this;
    }

    public GetBandwidthStatisticsDevice withClientIdentifier(String clientIdentifier) {
        Utils.checkNotNull(clientIdentifier, "clientIdentifier");
        this.clientIdentifier = Optional.ofNullable(clientIdentifier);
        return this;
    }

    public GetBandwidthStatisticsDevice withClientIdentifier(Optional<? extends String> clientIdentifier) {
        Utils.checkNotNull(clientIdentifier, "clientIdentifier");
        this.clientIdentifier = clientIdentifier;
        return this;
    }

    public GetBandwidthStatisticsDevice withCreatedAt(int createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public GetBandwidthStatisticsDevice withCreatedAt(Optional<? extends Integer> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
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
        GetBandwidthStatisticsDevice other = (GetBandwidthStatisticsDevice) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.platform, other.platform) &&
            java.util.Objects.deepEquals(this.clientIdentifier, other.clientIdentifier) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            name,
            platform,
            clientIdentifier,
            createdAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBandwidthStatisticsDevice.class,
                "id", id,
                "name", name,
                "platform", platform,
                "clientIdentifier", clientIdentifier,
                "createdAt", createdAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends Integer> id = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends String> platform = Optional.empty();
 
        private Optional<? extends String> clientIdentifier = Optional.empty();
 
        private Optional<? extends Integer> createdAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(int id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<? extends Integer> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder platform(String platform) {
            Utils.checkNotNull(platform, "platform");
            this.platform = Optional.ofNullable(platform);
            return this;
        }

        public Builder platform(Optional<? extends String> platform) {
            Utils.checkNotNull(platform, "platform");
            this.platform = platform;
            return this;
        }

        public Builder clientIdentifier(String clientIdentifier) {
            Utils.checkNotNull(clientIdentifier, "clientIdentifier");
            this.clientIdentifier = Optional.ofNullable(clientIdentifier);
            return this;
        }

        public Builder clientIdentifier(Optional<? extends String> clientIdentifier) {
            Utils.checkNotNull(clientIdentifier, "clientIdentifier");
            this.clientIdentifier = clientIdentifier;
            return this;
        }

        public Builder createdAt(int createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<? extends Integer> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }
        
        public GetBandwidthStatisticsDevice build() {
            return new GetBandwidthStatisticsDevice(
                id,
                name,
                platform,
                clientIdentifier,
                createdAt);
        }
    }
}

