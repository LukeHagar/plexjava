/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * State - The state of the media item
 */
public enum State {
    PLAYING("playing"),
    PAUSED("paused"),
    STOPPED("stopped");

    @JsonValue
    public final String value;

    private State(String value) {
        this.value = value;
    }
}