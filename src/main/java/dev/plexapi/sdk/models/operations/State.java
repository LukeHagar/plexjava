/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * State - The state of the media item
 */
public enum State {
    PLAYING("playing"),
    PAUSED("paused"),
    STOPPED("stopped");

    @JsonValue
    private final String value;

    private State(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}