/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

public enum GetSearchAllLibrariesOptimizedForStreaming {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private GetSearchAllLibrariesOptimizedForStreaming(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
}
