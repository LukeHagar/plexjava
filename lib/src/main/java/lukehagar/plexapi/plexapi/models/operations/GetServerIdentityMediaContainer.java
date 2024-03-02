/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetServerIdentityMediaContainer {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Double size;

    public GetServerIdentityMediaContainer withSize(Double size) {
        this.size = size;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("claimed")
    public Boolean claimed;

    public GetServerIdentityMediaContainer withClaimed(Boolean claimed) {
        this.claimed = claimed;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("machineIdentifier")
    public String machineIdentifier;

    public GetServerIdentityMediaContainer withMachineIdentifier(String machineIdentifier) {
        this.machineIdentifier = machineIdentifier;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    public String version;

    public GetServerIdentityMediaContainer withVersion(String version) {
        this.version = version;
        return this;
    }
    
    public GetServerIdentityMediaContainer(){}
}