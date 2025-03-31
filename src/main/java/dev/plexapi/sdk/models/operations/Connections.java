/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class Connections {

    /**
     * The protocol used for the connection (http, https, etc)
     */
    @JsonProperty("protocol")
    private Protocol protocol;

    /**
     * The (ip) address or domain name used for the connection
     */
    @JsonProperty("address")
    private String address;

    /**
     * The port used for the connection
     */
    @JsonProperty("port")
    private int port;

    /**
     * The full URI of the connection
     */
    @JsonProperty("uri")
    private String uri;

    /**
     * If the connection is local address
     */
    @JsonProperty("local")
    private boolean local;

    /**
     * If the connection is relayed through plex.direct
     */
    @JsonProperty("relay")
    private boolean relay;

    /**
     * If the connection is using IPv6
     */
    @JsonProperty("IPv6")
    private boolean iPv6;

    @JsonCreator
    public Connections(
            @JsonProperty("protocol") Protocol protocol,
            @JsonProperty("address") String address,
            @JsonProperty("port") int port,
            @JsonProperty("uri") String uri,
            @JsonProperty("local") boolean local,
            @JsonProperty("relay") boolean relay,
            @JsonProperty("IPv6") boolean iPv6) {
        Utils.checkNotNull(protocol, "protocol");
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(uri, "uri");
        Utils.checkNotNull(local, "local");
        Utils.checkNotNull(relay, "relay");
        Utils.checkNotNull(iPv6, "iPv6");
        this.protocol = protocol;
        this.address = address;
        this.port = port;
        this.uri = uri;
        this.local = local;
        this.relay = relay;
        this.iPv6 = iPv6;
    }

    /**
     * The protocol used for the connection (http, https, etc)
     */
    @JsonIgnore
    public Protocol protocol() {
        return protocol;
    }

    /**
     * The (ip) address or domain name used for the connection
     */
    @JsonIgnore
    public String address() {
        return address;
    }

    /**
     * The port used for the connection
     */
    @JsonIgnore
    public int port() {
        return port;
    }

    /**
     * The full URI of the connection
     */
    @JsonIgnore
    public String uri() {
        return uri;
    }

    /**
     * If the connection is local address
     */
    @JsonIgnore
    public boolean local() {
        return local;
    }

    /**
     * If the connection is relayed through plex.direct
     */
    @JsonIgnore
    public boolean relay() {
        return relay;
    }

    /**
     * If the connection is using IPv6
     */
    @JsonIgnore
    public boolean iPv6() {
        return iPv6;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The protocol used for the connection (http, https, etc)
     */
    public Connections withProtocol(Protocol protocol) {
        Utils.checkNotNull(protocol, "protocol");
        this.protocol = protocol;
        return this;
    }

    /**
     * The (ip) address or domain name used for the connection
     */
    public Connections withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    /**
     * The port used for the connection
     */
    public Connections withPort(int port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * The full URI of the connection
     */
    public Connections withUri(String uri) {
        Utils.checkNotNull(uri, "uri");
        this.uri = uri;
        return this;
    }

    /**
     * If the connection is local address
     */
    public Connections withLocal(boolean local) {
        Utils.checkNotNull(local, "local");
        this.local = local;
        return this;
    }

    /**
     * If the connection is relayed through plex.direct
     */
    public Connections withRelay(boolean relay) {
        Utils.checkNotNull(relay, "relay");
        this.relay = relay;
        return this;
    }

    /**
     * If the connection is using IPv6
     */
    public Connections withIPv6(boolean iPv6) {
        Utils.checkNotNull(iPv6, "iPv6");
        this.iPv6 = iPv6;
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
        Connections other = (Connections) o;
        return 
            Objects.deepEquals(this.protocol, other.protocol) &&
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.port, other.port) &&
            Objects.deepEquals(this.uri, other.uri) &&
            Objects.deepEquals(this.local, other.local) &&
            Objects.deepEquals(this.relay, other.relay) &&
            Objects.deepEquals(this.iPv6, other.iPv6);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            protocol,
            address,
            port,
            uri,
            local,
            relay,
            iPv6);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Connections.class,
                "protocol", protocol,
                "address", address,
                "port", port,
                "uri", uri,
                "local", local,
                "relay", relay,
                "iPv6", iPv6);
    }
    
    public final static class Builder {
 
        private Protocol protocol;
 
        private String address;
 
        private Integer port;
 
        private String uri;
 
        private Boolean local;
 
        private Boolean relay;
 
        private Boolean iPv6;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The protocol used for the connection (http, https, etc)
         */
        public Builder protocol(Protocol protocol) {
            Utils.checkNotNull(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        /**
         * The (ip) address or domain name used for the connection
         */
        public Builder address(String address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        /**
         * The port used for the connection
         */
        public Builder port(int port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        /**
         * The full URI of the connection
         */
        public Builder uri(String uri) {
            Utils.checkNotNull(uri, "uri");
            this.uri = uri;
            return this;
        }

        /**
         * If the connection is local address
         */
        public Builder local(boolean local) {
            Utils.checkNotNull(local, "local");
            this.local = local;
            return this;
        }

        /**
         * If the connection is relayed through plex.direct
         */
        public Builder relay(boolean relay) {
            Utils.checkNotNull(relay, "relay");
            this.relay = relay;
            return this;
        }

        /**
         * If the connection is using IPv6
         */
        public Builder iPv6(boolean iPv6) {
            Utils.checkNotNull(iPv6, "iPv6");
            this.iPv6 = iPv6;
            return this;
        }
        
        public Connections build() {
            return new Connections(
                protocol,
                address,
                port,
                uri,
                local,
                relay,
                iPv6);
        }
    }
}
