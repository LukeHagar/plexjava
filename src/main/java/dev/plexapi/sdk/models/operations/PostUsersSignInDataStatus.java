/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PostUsersSignInDataStatus {
    ONLINE("online"),
    OFFLINE("offline");

    @JsonValue
    private final String value;

    private PostUsersSignInDataStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}