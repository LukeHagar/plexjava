/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class GetTokenByPinIdRequest {

    /**
     * The PinID to retrieve an access token for
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pinID")
    private long pinID;

    /**
     * An opaque identifier unique to the client (UUID, serial number, or other unique device ID)
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Plex-Client-Identifier")
    private String clientID;

    /**
     * The name of the client application. (Plex Web, Plex Media Server, etc.)
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Plex-Product")
    private Optional<String> clientName;

    /**
     * A relatively friendly name for the client device
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Plex-Device")
    private Optional<String> deviceNickname;

    /**
     * The version of the client application.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Plex-Version")
    private Optional<String> clientVersion;

    /**
     * The platform of the client application.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Plex-Platform")
    private Optional<String> platform;

    @JsonCreator
    public GetTokenByPinIdRequest(
            long pinID,
            String clientID,
            Optional<String> clientName,
            Optional<String> deviceNickname,
            Optional<String> clientVersion,
            Optional<String> platform) {
        Utils.checkNotNull(pinID, "pinID");
        Utils.checkNotNull(clientID, "clientID");
        Utils.checkNotNull(clientName, "clientName");
        Utils.checkNotNull(deviceNickname, "deviceNickname");
        Utils.checkNotNull(clientVersion, "clientVersion");
        Utils.checkNotNull(platform, "platform");
        this.pinID = pinID;
        this.clientID = clientID;
        this.clientName = clientName;
        this.deviceNickname = deviceNickname;
        this.clientVersion = clientVersion;
        this.platform = platform;
    }
    
    public GetTokenByPinIdRequest(
            long pinID,
            String clientID) {
        this(pinID, clientID, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The PinID to retrieve an access token for
     */
    @JsonIgnore
    public long pinID() {
        return pinID;
    }

    /**
     * An opaque identifier unique to the client (UUID, serial number, or other unique device ID)
     */
    @JsonIgnore
    public String clientID() {
        return clientID;
    }

    /**
     * The name of the client application. (Plex Web, Plex Media Server, etc.)
     */
    @JsonIgnore
    public Optional<String> clientName() {
        return clientName;
    }

    /**
     * A relatively friendly name for the client device
     */
    @JsonIgnore
    public Optional<String> deviceNickname() {
        return deviceNickname;
    }

    /**
     * The version of the client application.
     */
    @JsonIgnore
    public Optional<String> clientVersion() {
        return clientVersion;
    }

    /**
     * The platform of the client application.
     */
    @JsonIgnore
    public Optional<String> platform() {
        return platform;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The PinID to retrieve an access token for
     */
    public GetTokenByPinIdRequest withPinID(long pinID) {
        Utils.checkNotNull(pinID, "pinID");
        this.pinID = pinID;
        return this;
    }

    /**
     * An opaque identifier unique to the client (UUID, serial number, or other unique device ID)
     */
    public GetTokenByPinIdRequest withClientID(String clientID) {
        Utils.checkNotNull(clientID, "clientID");
        this.clientID = clientID;
        return this;
    }

    /**
     * The name of the client application. (Plex Web, Plex Media Server, etc.)
     */
    public GetTokenByPinIdRequest withClientName(String clientName) {
        Utils.checkNotNull(clientName, "clientName");
        this.clientName = Optional.ofNullable(clientName);
        return this;
    }

    /**
     * The name of the client application. (Plex Web, Plex Media Server, etc.)
     */
    public GetTokenByPinIdRequest withClientName(Optional<String> clientName) {
        Utils.checkNotNull(clientName, "clientName");
        this.clientName = clientName;
        return this;
    }

    /**
     * A relatively friendly name for the client device
     */
    public GetTokenByPinIdRequest withDeviceNickname(String deviceNickname) {
        Utils.checkNotNull(deviceNickname, "deviceNickname");
        this.deviceNickname = Optional.ofNullable(deviceNickname);
        return this;
    }

    /**
     * A relatively friendly name for the client device
     */
    public GetTokenByPinIdRequest withDeviceNickname(Optional<String> deviceNickname) {
        Utils.checkNotNull(deviceNickname, "deviceNickname");
        this.deviceNickname = deviceNickname;
        return this;
    }

    /**
     * The version of the client application.
     */
    public GetTokenByPinIdRequest withClientVersion(String clientVersion) {
        Utils.checkNotNull(clientVersion, "clientVersion");
        this.clientVersion = Optional.ofNullable(clientVersion);
        return this;
    }

    /**
     * The version of the client application.
     */
    public GetTokenByPinIdRequest withClientVersion(Optional<String> clientVersion) {
        Utils.checkNotNull(clientVersion, "clientVersion");
        this.clientVersion = clientVersion;
        return this;
    }

    /**
     * The platform of the client application.
     */
    public GetTokenByPinIdRequest withPlatform(String platform) {
        Utils.checkNotNull(platform, "platform");
        this.platform = Optional.ofNullable(platform);
        return this;
    }

    /**
     * The platform of the client application.
     */
    public GetTokenByPinIdRequest withPlatform(Optional<String> platform) {
        Utils.checkNotNull(platform, "platform");
        this.platform = platform;
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
        GetTokenByPinIdRequest other = (GetTokenByPinIdRequest) o;
        return 
            Objects.deepEquals(this.pinID, other.pinID) &&
            Objects.deepEquals(this.clientID, other.clientID) &&
            Objects.deepEquals(this.clientName, other.clientName) &&
            Objects.deepEquals(this.deviceNickname, other.deviceNickname) &&
            Objects.deepEquals(this.clientVersion, other.clientVersion) &&
            Objects.deepEquals(this.platform, other.platform);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            pinID,
            clientID,
            clientName,
            deviceNickname,
            clientVersion,
            platform);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTokenByPinIdRequest.class,
                "pinID", pinID,
                "clientID", clientID,
                "clientName", clientName,
                "deviceNickname", deviceNickname,
                "clientVersion", clientVersion,
                "platform", platform);
    }
    
    public final static class Builder {
 
        private Long pinID;
 
        private String clientID;
 
        private Optional<String> clientName = Optional.empty();
 
        private Optional<String> deviceNickname = Optional.empty();
 
        private Optional<String> clientVersion = Optional.empty();
 
        private Optional<String> platform = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The PinID to retrieve an access token for
         */
        public Builder pinID(long pinID) {
            Utils.checkNotNull(pinID, "pinID");
            this.pinID = pinID;
            return this;
        }

        /**
         * An opaque identifier unique to the client (UUID, serial number, or other unique device ID)
         */
        public Builder clientID(String clientID) {
            Utils.checkNotNull(clientID, "clientID");
            this.clientID = clientID;
            return this;
        }

        /**
         * The name of the client application. (Plex Web, Plex Media Server, etc.)
         */
        public Builder clientName(String clientName) {
            Utils.checkNotNull(clientName, "clientName");
            this.clientName = Optional.ofNullable(clientName);
            return this;
        }

        /**
         * The name of the client application. (Plex Web, Plex Media Server, etc.)
         */
        public Builder clientName(Optional<String> clientName) {
            Utils.checkNotNull(clientName, "clientName");
            this.clientName = clientName;
            return this;
        }

        /**
         * A relatively friendly name for the client device
         */
        public Builder deviceNickname(String deviceNickname) {
            Utils.checkNotNull(deviceNickname, "deviceNickname");
            this.deviceNickname = Optional.ofNullable(deviceNickname);
            return this;
        }

        /**
         * A relatively friendly name for the client device
         */
        public Builder deviceNickname(Optional<String> deviceNickname) {
            Utils.checkNotNull(deviceNickname, "deviceNickname");
            this.deviceNickname = deviceNickname;
            return this;
        }

        /**
         * The version of the client application.
         */
        public Builder clientVersion(String clientVersion) {
            Utils.checkNotNull(clientVersion, "clientVersion");
            this.clientVersion = Optional.ofNullable(clientVersion);
            return this;
        }

        /**
         * The version of the client application.
         */
        public Builder clientVersion(Optional<String> clientVersion) {
            Utils.checkNotNull(clientVersion, "clientVersion");
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * The platform of the client application.
         */
        public Builder platform(String platform) {
            Utils.checkNotNull(platform, "platform");
            this.platform = Optional.ofNullable(platform);
            return this;
        }

        /**
         * The platform of the client application.
         */
        public Builder platform(Optional<String> platform) {
            Utils.checkNotNull(platform, "platform");
            this.platform = platform;
            return this;
        }
        
        public GetTokenByPinIdRequest build() {
            return new GetTokenByPinIdRequest(
                pinID,
                clientID,
                clientName,
                deviceNickname,
                clientVersion,
                platform);
        }
    }
}

