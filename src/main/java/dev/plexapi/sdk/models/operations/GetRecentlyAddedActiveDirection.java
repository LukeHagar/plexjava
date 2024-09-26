/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * GetRecentlyAddedActiveDirection - The direction of the sort. Can be either `asc` or `desc`.
 * 
 */
public enum GetRecentlyAddedActiveDirection {
    Ascending("asc"),
    Descending("desc");

    @JsonValue
    private final String value;

    private GetRecentlyAddedActiveDirection(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
