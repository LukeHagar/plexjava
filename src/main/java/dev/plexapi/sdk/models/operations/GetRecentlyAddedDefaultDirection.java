/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * GetRecentlyAddedDefaultDirection - The direction of the sort. Can be either `asc` or `desc`.
 * 
 */
public enum GetRecentlyAddedDefaultDirection {
    Ascending("asc"),
    Descending("desc");

    @JsonValue
    private final String value;

    private GetRecentlyAddedDefaultDirection(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
