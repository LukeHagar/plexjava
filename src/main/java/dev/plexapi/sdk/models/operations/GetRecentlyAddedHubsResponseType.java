/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum GetRecentlyAddedHubsResponseType {
    COVER_POSTER("coverPoster"),
    BACKGROUND("background"),
    SNAPSHOT("snapshot"),
    CLEAR_LOGO("clearLogo");

    @JsonValue
    private final String value;

    private GetRecentlyAddedHubsResponseType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
