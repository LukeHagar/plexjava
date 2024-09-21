/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WatchedIndicator - Whether or not media watched indicators are enabled (little orange dot on media)
 */
public enum WatchedIndicator {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private WatchedIndicator(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
}
