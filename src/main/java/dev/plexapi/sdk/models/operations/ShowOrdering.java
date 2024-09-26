/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ShowOrdering - Setting that indicates the episode ordering for the show 
 * None = Library default, 
 * tmdbAiring = The Movie Database (Aired), 
 * aired = TheTVDB (Aired), 
 * dvd = TheTVDB (DVD), 
 * absolute = TheTVDB (Absolute)).
 * 
 */
public enum ShowOrdering {
    None("None"),
    TmdbAiring("tmdbAiring"),
    Aired("aired"),
    Dvd("dvd"),
    Absolute("absolute");

    @JsonValue
    private final String value;

    private ShowOrdering(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}