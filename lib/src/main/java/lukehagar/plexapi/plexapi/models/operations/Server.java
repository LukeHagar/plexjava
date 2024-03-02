/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Server {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public Server withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("host")
    public String host;

    public Server withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    public String address;

    public Server withAddress(String address) {
        this.address = address;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    public Double port;

    public Server withPort(Double port) {
        this.port = port;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("machineIdentifier")
    public String machineIdentifier;

    public Server withMachineIdentifier(String machineIdentifier) {
        this.machineIdentifier = machineIdentifier;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    public String version;

    public Server withVersion(String version) {
        this.version = version;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protocol")
    public String protocol;

    public Server withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("product")
    public String product;

    public Server withProduct(String product) {
        this.product = product;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deviceClass")
    public String deviceClass;

    public Server withDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protocolVersion")
    public Double protocolVersion;

    public Server withProtocolVersion(Double protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protocolCapabilities")
    public String protocolCapabilities;

    public Server withProtocolCapabilities(String protocolCapabilities) {
        this.protocolCapabilities = protocolCapabilities;
        return this;
    }
    
    public Server(){}
}