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

public class GetDevicesMediaContainer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<? extends Double> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifier")
    private Optional<? extends String> identifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Device")
    private Optional<? extends java.util.List<Device>> device;

    @JsonCreator
    public GetDevicesMediaContainer(
            @JsonProperty("size") Optional<? extends Double> size,
            @JsonProperty("identifier") Optional<? extends String> identifier,
            @JsonProperty("Device") Optional<? extends java.util.List<Device>> device) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(identifier, "identifier");
        Utils.checkNotNull(device, "device");
        this.size = size;
        this.identifier = identifier;
        this.device = device;
    }
    
    public GetDevicesMediaContainer() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> size() {
        return (Optional<Double>) size;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> identifier() {
        return (Optional<String>) identifier;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<Device>> device() {
        return (Optional<java.util.List<Device>>) device;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetDevicesMediaContainer withSize(double size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetDevicesMediaContainer withSize(Optional<? extends Double> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetDevicesMediaContainer withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = Optional.ofNullable(identifier);
        return this;
    }

    public GetDevicesMediaContainer withIdentifier(Optional<? extends String> identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    public GetDevicesMediaContainer withDevice(java.util.List<Device> device) {
        Utils.checkNotNull(device, "device");
        this.device = Optional.ofNullable(device);
        return this;
    }

    public GetDevicesMediaContainer withDevice(Optional<? extends java.util.List<Device>> device) {
        Utils.checkNotNull(device, "device");
        this.device = device;
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
        GetDevicesMediaContainer other = (GetDevicesMediaContainer) o;
        return 
            java.util.Objects.deepEquals(this.size, other.size) &&
            java.util.Objects.deepEquals(this.identifier, other.identifier) &&
            java.util.Objects.deepEquals(this.device, other.device);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            size,
            identifier,
            device);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetDevicesMediaContainer.class,
                "size", size,
                "identifier", identifier,
                "device", device);
    }
    
    public final static class Builder {
 
        private Optional<? extends Double> size = Optional.empty();
 
        private Optional<? extends String> identifier = Optional.empty();
 
        private Optional<? extends java.util.List<Device>> device = Optional.empty();  
        
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

        public Builder identifier(String identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = Optional.ofNullable(identifier);
            return this;
        }

        public Builder identifier(Optional<? extends String> identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }

        public Builder device(java.util.List<Device> device) {
            Utils.checkNotNull(device, "device");
            this.device = Optional.ofNullable(device);
            return this;
        }

        public Builder device(Optional<? extends java.util.List<Device>> device) {
            Utils.checkNotNull(device, "device");
            this.device = device;
            return this;
        }
        
        public GetDevicesMediaContainer build() {
            return new GetDevicesMediaContainer(
                size,
                identifier,
                device);
        }
    }
}

