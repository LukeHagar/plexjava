/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Session {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public Session withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bandwidth")
    public Integer bandwidth;

    public Session withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")
    public String location;

    public Session withLocation(String location) {
        this.location = location;
        return this;
    }
    
    public Session(){}
}
