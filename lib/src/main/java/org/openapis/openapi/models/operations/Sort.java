/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Sort {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default")
    public String default_;

    public Sort withDefault(String default_) {
        this.default_ = default_;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultDirection")
    public String defaultDirection;

    public Sort withDefaultDirection(String defaultDirection) {
        this.defaultDirection = defaultDirection;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("descKey")
    public String descKey;

    public Sort withDescKey(String descKey) {
        this.descKey = descKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("firstCharacterKey")
    public String firstCharacterKey;

    public Sort withFirstCharacterKey(String firstCharacterKey) {
        this.firstCharacterKey = firstCharacterKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;

    public Sort withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public Sort withTitle(String title) {
        this.title = title;
        return this;
    }
    
    public Sort(){}
}
