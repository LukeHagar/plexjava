/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * QueryParamType - type of playlist to create
 */
public enum QueryParamType {
    AUDIO("audio"),
    VIDEO("video"),
    PHOTO("photo");

    @JsonValue
    public final String value;

    private QueryParamType(String value) {
        this.value = value;
    }
}
