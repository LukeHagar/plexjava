/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum HasThumbnail {
    False("0"),
    True("1");

    @JsonValue
    private final String value;

    private HasThumbnail(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
