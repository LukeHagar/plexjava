/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PlaylistType - limit to a type of playlist.
 */
public enum PlaylistType {
    AUDIO("audio"),
    VIDEO("video"),
    PHOTO("photo");

    @JsonValue
    public final String value;

    private PlaylistType(String value) {
        this.value = value;
    }
}