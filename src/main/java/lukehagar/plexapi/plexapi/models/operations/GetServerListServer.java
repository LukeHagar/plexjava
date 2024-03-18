/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
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


public class GetServerListServer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("host")
    private Optional<? extends String> host;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends String> address;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    private Optional<? extends Double> port;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("machineIdentifier")
    private Optional<? extends String> machineIdentifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    private Optional<? extends String> version;

    public GetServerListServer(
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("host") Optional<? extends String> host,
            @JsonProperty("address") Optional<? extends String> address,
            @JsonProperty("port") Optional<? extends Double> port,
            @JsonProperty("machineIdentifier") Optional<? extends String> machineIdentifier,
            @JsonProperty("version") Optional<? extends String> version) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(machineIdentifier, "machineIdentifier");
        Utils.checkNotNull(version, "version");
        this.name = name;
        this.host = host;
        this.address = address;
        this.port = port;
        this.machineIdentifier = machineIdentifier;
        this.version = version;
    }

    public Optional<? extends String> name() {
        return name;
    }

    public Optional<? extends String> host() {
        return host;
    }

    public Optional<? extends String> address() {
        return address;
    }

    public Optional<? extends Double> port() {
        return port;
    }

    public Optional<? extends String> machineIdentifier() {
        return machineIdentifier;
    }

    public Optional<? extends String> version() {
        return version;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetServerListServer withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public GetServerListServer withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public GetServerListServer withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = Optional.ofNullable(host);
        return this;
    }

    public GetServerListServer withHost(Optional<? extends String> host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    public GetServerListServer withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    public GetServerListServer withAddress(Optional<? extends String> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public GetServerListServer withPort(double port) {
        Utils.checkNotNull(port, "port");
        this.port = Optional.ofNullable(port);
        return this;
    }

    public GetServerListServer withPort(Optional<? extends Double> port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    public GetServerListServer withMachineIdentifier(String machineIdentifier) {
        Utils.checkNotNull(machineIdentifier, "machineIdentifier");
        this.machineIdentifier = Optional.ofNullable(machineIdentifier);
        return this;
    }

    public GetServerListServer withMachineIdentifier(Optional<? extends String> machineIdentifier) {
        Utils.checkNotNull(machineIdentifier, "machineIdentifier");
        this.machineIdentifier = machineIdentifier;
        return this;
    }

    public GetServerListServer withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = Optional.ofNullable(version);
        return this;
    }

    public GetServerListServer withVersion(Optional<? extends String> version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
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
        GetServerListServer other = (GetServerListServer) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.address, other.address) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.machineIdentifier, other.machineIdentifier) &&
            java.util.Objects.deepEquals(this.version, other.version);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            host,
            address,
            port,
            machineIdentifier,
            version);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetServerListServer.class,
                "name", name,
                "host", host,
                "address", address,
                "port", port,
                "machineIdentifier", machineIdentifier,
                "version", version);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends String> host = Optional.empty();
 
        private Optional<? extends String> address = Optional.empty();
 
        private Optional<? extends Double> port = Optional.empty();
 
        private Optional<? extends String> machineIdentifier = Optional.empty();
 
        private Optional<? extends String> version = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = Optional.ofNullable(host);
            return this;
        }

        public Builder host(Optional<? extends String> host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        public Builder address(String address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Builder address(Optional<? extends String> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        public Builder port(double port) {
            Utils.checkNotNull(port, "port");
            this.port = Optional.ofNullable(port);
            return this;
        }

        public Builder port(Optional<? extends Double> port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        public Builder machineIdentifier(String machineIdentifier) {
            Utils.checkNotNull(machineIdentifier, "machineIdentifier");
            this.machineIdentifier = Optional.ofNullable(machineIdentifier);
            return this;
        }

        public Builder machineIdentifier(Optional<? extends String> machineIdentifier) {
            Utils.checkNotNull(machineIdentifier, "machineIdentifier");
            this.machineIdentifier = machineIdentifier;
            return this;
        }

        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = Optional.ofNullable(version);
            return this;
        }

        public Builder version(Optional<? extends String> version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }
        
        public GetServerListServer build() {
            return new GetServerListServer(
                name,
                host,
                address,
                port,
                machineIdentifier,
                version);
        }
    }
}

