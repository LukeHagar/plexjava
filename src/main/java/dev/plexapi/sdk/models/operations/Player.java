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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class Player {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<String> address;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("machineIdentifier")
    private Optional<String> machineIdentifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("model")
    private Optional<String> model;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("platform")
    private Optional<String> platform;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("platformVersion")
    private Optional<String> platformVersion;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("product")
    private Optional<String> product;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile")
    private Optional<String> profile;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remotePublicAddress")
    private Optional<String> remotePublicAddress;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private Optional<String> state;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    private Optional<String> version;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("local")
    private Optional<Boolean> local;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relayed")
    private Optional<Boolean> relayed;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secure")
    private Optional<Boolean> secure;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("userID")
    private Optional<Integer> userID;

    @JsonCreator
    public Player(
            @JsonProperty("address") Optional<String> address,
            @JsonProperty("machineIdentifier") Optional<String> machineIdentifier,
            @JsonProperty("model") Optional<String> model,
            @JsonProperty("platform") Optional<String> platform,
            @JsonProperty("platformVersion") Optional<String> platformVersion,
            @JsonProperty("product") Optional<String> product,
            @JsonProperty("profile") Optional<String> profile,
            @JsonProperty("remotePublicAddress") Optional<String> remotePublicAddress,
            @JsonProperty("state") Optional<String> state,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("version") Optional<String> version,
            @JsonProperty("local") Optional<Boolean> local,
            @JsonProperty("relayed") Optional<Boolean> relayed,
            @JsonProperty("secure") Optional<Boolean> secure,
            @JsonProperty("userID") Optional<Integer> userID) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(machineIdentifier, "machineIdentifier");
        Utils.checkNotNull(model, "model");
        Utils.checkNotNull(platform, "platform");
        Utils.checkNotNull(platformVersion, "platformVersion");
        Utils.checkNotNull(product, "product");
        Utils.checkNotNull(profile, "profile");
        Utils.checkNotNull(remotePublicAddress, "remotePublicAddress");
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(local, "local");
        Utils.checkNotNull(relayed, "relayed");
        Utils.checkNotNull(secure, "secure");
        Utils.checkNotNull(userID, "userID");
        this.address = address;
        this.machineIdentifier = machineIdentifier;
        this.model = model;
        this.platform = platform;
        this.platformVersion = platformVersion;
        this.product = product;
        this.profile = profile;
        this.remotePublicAddress = remotePublicAddress;
        this.state = state;
        this.title = title;
        this.version = version;
        this.local = local;
        this.relayed = relayed;
        this.secure = secure;
        this.userID = userID;
    }
    
    public Player() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> address() {
        return address;
    }

    @JsonIgnore
    public Optional<String> machineIdentifier() {
        return machineIdentifier;
    }

    @JsonIgnore
    public Optional<String> model() {
        return model;
    }

    @JsonIgnore
    public Optional<String> platform() {
        return platform;
    }

    @JsonIgnore
    public Optional<String> platformVersion() {
        return platformVersion;
    }

    @JsonIgnore
    public Optional<String> product() {
        return product;
    }

    @JsonIgnore
    public Optional<String> profile() {
        return profile;
    }

    @JsonIgnore
    public Optional<String> remotePublicAddress() {
        return remotePublicAddress;
    }

    @JsonIgnore
    public Optional<String> state() {
        return state;
    }

    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    @JsonIgnore
    public Optional<String> version() {
        return version;
    }

    @JsonIgnore
    public Optional<Boolean> local() {
        return local;
    }

    @JsonIgnore
    public Optional<Boolean> relayed() {
        return relayed;
    }

    @JsonIgnore
    public Optional<Boolean> secure() {
        return secure;
    }

    @JsonIgnore
    public Optional<Integer> userID() {
        return userID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Player withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    public Player withAddress(Optional<String> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public Player withMachineIdentifier(String machineIdentifier) {
        Utils.checkNotNull(machineIdentifier, "machineIdentifier");
        this.machineIdentifier = Optional.ofNullable(machineIdentifier);
        return this;
    }

    public Player withMachineIdentifier(Optional<String> machineIdentifier) {
        Utils.checkNotNull(machineIdentifier, "machineIdentifier");
        this.machineIdentifier = machineIdentifier;
        return this;
    }

    public Player withModel(String model) {
        Utils.checkNotNull(model, "model");
        this.model = Optional.ofNullable(model);
        return this;
    }

    public Player withModel(Optional<String> model) {
        Utils.checkNotNull(model, "model");
        this.model = model;
        return this;
    }

    public Player withPlatform(String platform) {
        Utils.checkNotNull(platform, "platform");
        this.platform = Optional.ofNullable(platform);
        return this;
    }

    public Player withPlatform(Optional<String> platform) {
        Utils.checkNotNull(platform, "platform");
        this.platform = platform;
        return this;
    }

    public Player withPlatformVersion(String platformVersion) {
        Utils.checkNotNull(platformVersion, "platformVersion");
        this.platformVersion = Optional.ofNullable(platformVersion);
        return this;
    }

    public Player withPlatformVersion(Optional<String> platformVersion) {
        Utils.checkNotNull(platformVersion, "platformVersion");
        this.platformVersion = platformVersion;
        return this;
    }

    public Player withProduct(String product) {
        Utils.checkNotNull(product, "product");
        this.product = Optional.ofNullable(product);
        return this;
    }

    public Player withProduct(Optional<String> product) {
        Utils.checkNotNull(product, "product");
        this.product = product;
        return this;
    }

    public Player withProfile(String profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = Optional.ofNullable(profile);
        return this;
    }

    public Player withProfile(Optional<String> profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = profile;
        return this;
    }

    public Player withRemotePublicAddress(String remotePublicAddress) {
        Utils.checkNotNull(remotePublicAddress, "remotePublicAddress");
        this.remotePublicAddress = Optional.ofNullable(remotePublicAddress);
        return this;
    }

    public Player withRemotePublicAddress(Optional<String> remotePublicAddress) {
        Utils.checkNotNull(remotePublicAddress, "remotePublicAddress");
        this.remotePublicAddress = remotePublicAddress;
        return this;
    }

    public Player withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    public Player withState(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    public Player withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public Player withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public Player withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = Optional.ofNullable(version);
        return this;
    }

    public Player withVersion(Optional<String> version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    public Player withLocal(boolean local) {
        Utils.checkNotNull(local, "local");
        this.local = Optional.ofNullable(local);
        return this;
    }

    public Player withLocal(Optional<Boolean> local) {
        Utils.checkNotNull(local, "local");
        this.local = local;
        return this;
    }

    public Player withRelayed(boolean relayed) {
        Utils.checkNotNull(relayed, "relayed");
        this.relayed = Optional.ofNullable(relayed);
        return this;
    }

    public Player withRelayed(Optional<Boolean> relayed) {
        Utils.checkNotNull(relayed, "relayed");
        this.relayed = relayed;
        return this;
    }

    public Player withSecure(boolean secure) {
        Utils.checkNotNull(secure, "secure");
        this.secure = Optional.ofNullable(secure);
        return this;
    }

    public Player withSecure(Optional<Boolean> secure) {
        Utils.checkNotNull(secure, "secure");
        this.secure = secure;
        return this;
    }

    public Player withUserID(int userID) {
        Utils.checkNotNull(userID, "userID");
        this.userID = Optional.ofNullable(userID);
        return this;
    }

    public Player withUserID(Optional<Integer> userID) {
        Utils.checkNotNull(userID, "userID");
        this.userID = userID;
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
        Player other = (Player) o;
        return 
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.machineIdentifier, other.machineIdentifier) &&
            Objects.deepEquals(this.model, other.model) &&
            Objects.deepEquals(this.platform, other.platform) &&
            Objects.deepEquals(this.platformVersion, other.platformVersion) &&
            Objects.deepEquals(this.product, other.product) &&
            Objects.deepEquals(this.profile, other.profile) &&
            Objects.deepEquals(this.remotePublicAddress, other.remotePublicAddress) &&
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.local, other.local) &&
            Objects.deepEquals(this.relayed, other.relayed) &&
            Objects.deepEquals(this.secure, other.secure) &&
            Objects.deepEquals(this.userID, other.userID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            address,
            machineIdentifier,
            model,
            platform,
            platformVersion,
            product,
            profile,
            remotePublicAddress,
            state,
            title,
            version,
            local,
            relayed,
            secure,
            userID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Player.class,
                "address", address,
                "machineIdentifier", machineIdentifier,
                "model", model,
                "platform", platform,
                "platformVersion", platformVersion,
                "product", product,
                "profile", profile,
                "remotePublicAddress", remotePublicAddress,
                "state", state,
                "title", title,
                "version", version,
                "local", local,
                "relayed", relayed,
                "secure", secure,
                "userID", userID);
    }
    
    public final static class Builder {
 
        private Optional<String> address = Optional.empty();
 
        private Optional<String> machineIdentifier = Optional.empty();
 
        private Optional<String> model = Optional.empty();
 
        private Optional<String> platform = Optional.empty();
 
        private Optional<String> platformVersion = Optional.empty();
 
        private Optional<String> product = Optional.empty();
 
        private Optional<String> profile = Optional.empty();
 
        private Optional<String> remotePublicAddress = Optional.empty();
 
        private Optional<String> state = Optional.empty();
 
        private Optional<String> title = Optional.empty();
 
        private Optional<String> version = Optional.empty();
 
        private Optional<Boolean> local = Optional.empty();
 
        private Optional<Boolean> relayed = Optional.empty();
 
        private Optional<Boolean> secure = Optional.empty();
 
        private Optional<Integer> userID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder model(String model) {
            Utils.checkNotNull(model, "model");
            this.model = Optional.ofNullable(model);
            return this;
        }

        public Builder model(Optional<String> model) {
            Utils.checkNotNull(model, "model");
            this.model = model;
            return this;
        }

        public Builder platform(String platform) {
            Utils.checkNotNull(platform, "platform");
            this.platform = Optional.ofNullable(platform);
            return this;
        }

        public Builder platform(Optional<String> platform) {
            Utils.checkNotNull(platform, "platform");
            this.platform = platform;
            return this;
        }

        public Builder platformVersion(String platformVersion) {
            Utils.checkNotNull(platformVersion, "platformVersion");
            this.platformVersion = Optional.ofNullable(platformVersion);
            return this;
        }

        public Builder platformVersion(Optional<String> platformVersion) {
            Utils.checkNotNull(platformVersion, "platformVersion");
            this.platformVersion = platformVersion;
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

        public Builder profile(String profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = Optional.ofNullable(profile);
            return this;
        }

        public Builder profile(Optional<String> profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = profile;
            return this;
        }

        public Builder remotePublicAddress(String remotePublicAddress) {
            Utils.checkNotNull(remotePublicAddress, "remotePublicAddress");
            this.remotePublicAddress = Optional.ofNullable(remotePublicAddress);
            return this;
        }

        public Builder remotePublicAddress(Optional<String> remotePublicAddress) {
            Utils.checkNotNull(remotePublicAddress, "remotePublicAddress");
            this.remotePublicAddress = remotePublicAddress;
            return this;
        }

        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = Optional.ofNullable(state);
            return this;
        }

        public Builder state(Optional<String> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
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

        public Builder local(boolean local) {
            Utils.checkNotNull(local, "local");
            this.local = Optional.ofNullable(local);
            return this;
        }

        public Builder local(Optional<Boolean> local) {
            Utils.checkNotNull(local, "local");
            this.local = local;
            return this;
        }

        public Builder relayed(boolean relayed) {
            Utils.checkNotNull(relayed, "relayed");
            this.relayed = Optional.ofNullable(relayed);
            return this;
        }

        public Builder relayed(Optional<Boolean> relayed) {
            Utils.checkNotNull(relayed, "relayed");
            this.relayed = relayed;
            return this;
        }

        public Builder secure(boolean secure) {
            Utils.checkNotNull(secure, "secure");
            this.secure = Optional.ofNullable(secure);
            return this;
        }

        public Builder secure(Optional<Boolean> secure) {
            Utils.checkNotNull(secure, "secure");
            this.secure = secure;
            return this;
        }

        public Builder userID(int userID) {
            Utils.checkNotNull(userID, "userID");
            this.userID = Optional.ofNullable(userID);
            return this;
        }

        public Builder userID(Optional<Integer> userID) {
            Utils.checkNotNull(userID, "userID");
            this.userID = userID;
            return this;
        }
        
        public Player build() {
            return new Player(
                address,
                machineIdentifier,
                model,
                platform,
                platformVersion,
                product,
                profile,
                remotePublicAddress,
                state,
                title,
                version,
                local,
                relayed,
                secure,
                userID);
        }
    }
}

