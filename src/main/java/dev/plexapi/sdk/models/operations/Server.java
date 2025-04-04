/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class Server {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("host")
    private Optional<String> host;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<String> address;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    private Optional<Double> port;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("machineIdentifier")
    private Optional<String> machineIdentifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    private Optional<String> version;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protocol")
    private Optional<String> protocol;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("product")
    private Optional<String> product;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deviceClass")
    private Optional<String> deviceClass;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protocolVersion")
    private Optional<Double> protocolVersion;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protocolCapabilities")
    private Optional<String> protocolCapabilities;

    @JsonCreator
    public Server(
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("host") Optional<String> host,
            @JsonProperty("address") Optional<String> address,
            @JsonProperty("port") Optional<Double> port,
            @JsonProperty("machineIdentifier") Optional<String> machineIdentifier,
            @JsonProperty("version") Optional<String> version,
            @JsonProperty("protocol") Optional<String> protocol,
            @JsonProperty("product") Optional<String> product,
            @JsonProperty("deviceClass") Optional<String> deviceClass,
            @JsonProperty("protocolVersion") Optional<Double> protocolVersion,
            @JsonProperty("protocolCapabilities") Optional<String> protocolCapabilities) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(machineIdentifier, "machineIdentifier");
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(protocol, "protocol");
        Utils.checkNotNull(product, "product");
        Utils.checkNotNull(deviceClass, "deviceClass");
        Utils.checkNotNull(protocolVersion, "protocolVersion");
        Utils.checkNotNull(protocolCapabilities, "protocolCapabilities");
        this.name = name;
        this.host = host;
        this.address = address;
        this.port = port;
        this.machineIdentifier = machineIdentifier;
        this.version = version;
        this.protocol = protocol;
        this.product = product;
        this.deviceClass = deviceClass;
        this.protocolVersion = protocolVersion;
        this.protocolCapabilities = protocolCapabilities;
    }
    
    public Server() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> host() {
        return host;
    }

    @JsonIgnore
    public Optional<String> address() {
        return address;
    }

    @JsonIgnore
    public Optional<Double> port() {
        return port;
    }

    @JsonIgnore
    public Optional<String> machineIdentifier() {
        return machineIdentifier;
    }

    @JsonIgnore
    public Optional<String> version() {
        return version;
    }

    @JsonIgnore
    public Optional<String> protocol() {
        return protocol;
    }

    @JsonIgnore
    public Optional<String> product() {
        return product;
    }

    @JsonIgnore
    public Optional<String> deviceClass() {
        return deviceClass;
    }

    @JsonIgnore
    public Optional<Double> protocolVersion() {
        return protocolVersion;
    }

    @JsonIgnore
    public Optional<String> protocolCapabilities() {
        return protocolCapabilities;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public Server withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public Server withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public Server withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = Optional.ofNullable(host);
        return this;
    }

    public Server withHost(Optional<String> host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    public Server withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    public Server withAddress(Optional<String> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public Server withPort(double port) {
        Utils.checkNotNull(port, "port");
        this.port = Optional.ofNullable(port);
        return this;
    }

    public Server withPort(Optional<Double> port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    public Server withMachineIdentifier(String machineIdentifier) {
        Utils.checkNotNull(machineIdentifier, "machineIdentifier");
        this.machineIdentifier = Optional.ofNullable(machineIdentifier);
        return this;
    }

    public Server withMachineIdentifier(Optional<String> machineIdentifier) {
        Utils.checkNotNull(machineIdentifier, "machineIdentifier");
        this.machineIdentifier = machineIdentifier;
        return this;
    }

    public Server withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = Optional.ofNullable(version);
        return this;
    }

    public Server withVersion(Optional<String> version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    public Server withProtocol(String protocol) {
        Utils.checkNotNull(protocol, "protocol");
        this.protocol = Optional.ofNullable(protocol);
        return this;
    }

    public Server withProtocol(Optional<String> protocol) {
        Utils.checkNotNull(protocol, "protocol");
        this.protocol = protocol;
        return this;
    }

    public Server withProduct(String product) {
        Utils.checkNotNull(product, "product");
        this.product = Optional.ofNullable(product);
        return this;
    }

    public Server withProduct(Optional<String> product) {
        Utils.checkNotNull(product, "product");
        this.product = product;
        return this;
    }

    public Server withDeviceClass(String deviceClass) {
        Utils.checkNotNull(deviceClass, "deviceClass");
        this.deviceClass = Optional.ofNullable(deviceClass);
        return this;
    }

    public Server withDeviceClass(Optional<String> deviceClass) {
        Utils.checkNotNull(deviceClass, "deviceClass");
        this.deviceClass = deviceClass;
        return this;
    }

    public Server withProtocolVersion(double protocolVersion) {
        Utils.checkNotNull(protocolVersion, "protocolVersion");
        this.protocolVersion = Optional.ofNullable(protocolVersion);
        return this;
    }

    public Server withProtocolVersion(Optional<Double> protocolVersion) {
        Utils.checkNotNull(protocolVersion, "protocolVersion");
        this.protocolVersion = protocolVersion;
        return this;
    }

    public Server withProtocolCapabilities(String protocolCapabilities) {
        Utils.checkNotNull(protocolCapabilities, "protocolCapabilities");
        this.protocolCapabilities = Optional.ofNullable(protocolCapabilities);
        return this;
    }

    public Server withProtocolCapabilities(Optional<String> protocolCapabilities) {
        Utils.checkNotNull(protocolCapabilities, "protocolCapabilities");
        this.protocolCapabilities = protocolCapabilities;
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
        Server other = (Server) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.host, other.host) &&
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.port, other.port) &&
            Objects.deepEquals(this.machineIdentifier, other.machineIdentifier) &&
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.protocol, other.protocol) &&
            Objects.deepEquals(this.product, other.product) &&
            Objects.deepEquals(this.deviceClass, other.deviceClass) &&
            Objects.deepEquals(this.protocolVersion, other.protocolVersion) &&
            Objects.deepEquals(this.protocolCapabilities, other.protocolCapabilities);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            host,
            address,
            port,
            machineIdentifier,
            version,
            protocol,
            product,
            deviceClass,
            protocolVersion,
            protocolCapabilities);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Server.class,
                "name", name,
                "host", host,
                "address", address,
                "port", port,
                "machineIdentifier", machineIdentifier,
                "version", version,
                "protocol", protocol,
                "product", product,
                "deviceClass", deviceClass,
                "protocolVersion", protocolVersion,
                "protocolCapabilities", protocolCapabilities);
    }
    
    public final static class Builder {
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> host = Optional.empty();
 
        private Optional<String> address = Optional.empty();
 
        private Optional<Double> port = Optional.empty();
 
        private Optional<String> machineIdentifier = Optional.empty();
 
        private Optional<String> version = Optional.empty();
 
        private Optional<String> protocol = Optional.empty();
 
        private Optional<String> product = Optional.empty();
 
        private Optional<String> deviceClass = Optional.empty();
 
        private Optional<Double> protocolVersion = Optional.empty();
 
        private Optional<String> protocolCapabilities = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = Optional.ofNullable(host);
            return this;
        }

        public Builder host(Optional<String> host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        public Builder address(String address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Builder address(Optional<String> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        public Builder port(double port) {
            Utils.checkNotNull(port, "port");
            this.port = Optional.ofNullable(port);
            return this;
        }

        public Builder port(Optional<Double> port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        public Builder machineIdentifier(String machineIdentifier) {
            Utils.checkNotNull(machineIdentifier, "machineIdentifier");
            this.machineIdentifier = Optional.ofNullable(machineIdentifier);
            return this;
        }

        public Builder machineIdentifier(Optional<String> machineIdentifier) {
            Utils.checkNotNull(machineIdentifier, "machineIdentifier");
            this.machineIdentifier = machineIdentifier;
            return this;
        }

        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = Optional.ofNullable(version);
            return this;
        }

        public Builder version(Optional<String> version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }

        public Builder protocol(String protocol) {
            Utils.checkNotNull(protocol, "protocol");
            this.protocol = Optional.ofNullable(protocol);
            return this;
        }

        public Builder protocol(Optional<String> protocol) {
            Utils.checkNotNull(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        public Builder product(String product) {
            Utils.checkNotNull(product, "product");
            this.product = Optional.ofNullable(product);
            return this;
        }

        public Builder product(Optional<String> product) {
            Utils.checkNotNull(product, "product");
            this.product = product;
            return this;
        }

        public Builder deviceClass(String deviceClass) {
            Utils.checkNotNull(deviceClass, "deviceClass");
            this.deviceClass = Optional.ofNullable(deviceClass);
            return this;
        }

        public Builder deviceClass(Optional<String> deviceClass) {
            Utils.checkNotNull(deviceClass, "deviceClass");
            this.deviceClass = deviceClass;
            return this;
        }

        public Builder protocolVersion(double protocolVersion) {
            Utils.checkNotNull(protocolVersion, "protocolVersion");
            this.protocolVersion = Optional.ofNullable(protocolVersion);
            return this;
        }

        public Builder protocolVersion(Optional<Double> protocolVersion) {
            Utils.checkNotNull(protocolVersion, "protocolVersion");
            this.protocolVersion = protocolVersion;
            return this;
        }

        public Builder protocolCapabilities(String protocolCapabilities) {
            Utils.checkNotNull(protocolCapabilities, "protocolCapabilities");
            this.protocolCapabilities = Optional.ofNullable(protocolCapabilities);
            return this;
        }

        public Builder protocolCapabilities(Optional<String> protocolCapabilities) {
            Utils.checkNotNull(protocolCapabilities, "protocolCapabilities");
            this.protocolCapabilities = protocolCapabilities;
            return this;
        }
        
        public Server build() {
            return new Server(
                name,
                host,
                address,
                port,
                machineIdentifier,
                version,
                protocol,
                product,
                deviceClass,
                protocolVersion,
                protocolCapabilities);
        }
    }
}
