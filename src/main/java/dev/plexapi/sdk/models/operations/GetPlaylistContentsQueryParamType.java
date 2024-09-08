/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GetPlaylistContentsQueryParamType - The type of media to retrieve.
 * 1 = movie
 * 2 = show
 * 3 = season
 * 4 = episode
 * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
 * 
 */
public enum GetPlaylistContentsQueryParamType {
    ONE(1L),
    TWO(2L),
    THREE(3L),
    FOUR(4L);

    @JsonValue
    private final long value;

    private GetPlaylistContentsQueryParamType(long value) {
        this.value = value;
    }
    
    public long value() {
        return value;
    }
}
