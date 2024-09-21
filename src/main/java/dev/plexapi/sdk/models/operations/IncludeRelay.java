/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * IncludeRelay - Include Relay addresses in the results 
 * E.g: https://10-0-0-25.bbf8e10c7fa20447cacee74cd9914cde.plex.direct:32400
 * 
 */
public enum IncludeRelay {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private IncludeRelay(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
}
