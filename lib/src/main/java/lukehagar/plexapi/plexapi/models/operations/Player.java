/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Player {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    public String address;

    public Player withAddress(String address) {
        this.address = address;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("machineIdentifier")
    public String machineIdentifier;

    public Player withMachineIdentifier(String machineIdentifier) {
        this.machineIdentifier = machineIdentifier;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("model")
    public String model;

    public Player withModel(String model) {
        this.model = model;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("platform")
    public String platform;

    public Player withPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("platformVersion")
    public String platformVersion;

    public Player withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("product")
    public String product;

    public Player withProduct(String product) {
        this.product = product;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile")
    public String profile;

    public Player withProfile(String profile) {
        this.profile = profile;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remotePublicAddress")
    public String remotePublicAddress;

    public Player withRemotePublicAddress(String remotePublicAddress) {
        this.remotePublicAddress = remotePublicAddress;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    public String state;

    public Player withState(String state) {
        this.state = state;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public Player withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    public String version;

    public Player withVersion(String version) {
        this.version = version;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("local")
    public Boolean local;

    public Player withLocal(Boolean local) {
        this.local = local;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relayed")
    public Boolean relayed;

    public Player withRelayed(Boolean relayed) {
        this.relayed = relayed;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secure")
    public Boolean secure;

    public Player withSecure(Boolean secure) {
        this.secure = secure;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("userID")
    public Integer userID;

    public Player withUserID(Integer userID) {
        this.userID = userID;
        return this;
    }
    
    public Player(){}
}