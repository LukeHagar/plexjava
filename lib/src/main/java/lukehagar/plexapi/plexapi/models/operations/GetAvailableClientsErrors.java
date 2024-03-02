/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetAvailableClientsErrors {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public Double code;

    public GetAvailableClientsErrors withCode(Double code) {
        this.code = code;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;

    public GetAvailableClientsErrors withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public Double status;

    public GetAvailableClientsErrors withStatus(Double status) {
        this.status = status;
        return this;
    }
    
    public GetAvailableClientsErrors(){}
}