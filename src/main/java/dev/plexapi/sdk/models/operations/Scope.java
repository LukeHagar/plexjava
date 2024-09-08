/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * Scope - `all` - This is the only supported `scope` parameter.
 */
public enum Scope {
    ALL("all");

    @JsonValue
    private final String value;

    private Scope(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
