/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeletePlaylistErrors {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public Double code;

    public DeletePlaylistErrors withCode(Double code) {
        this.code = code;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;

    public DeletePlaylistErrors withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public Double status;

    public DeletePlaylistErrors withStatus(Double status) {
        this.status = status;
        return this;
    }
    
    public DeletePlaylistErrors(){}
}
