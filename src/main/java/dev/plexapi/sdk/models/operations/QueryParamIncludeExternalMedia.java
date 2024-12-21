/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

/**
 * QueryParamIncludeExternalMedia - Whether to include external media in the search results.
 */
public enum QueryParamIncludeExternalMedia {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private QueryParamIncludeExternalMedia(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public static Optional<QueryParamIncludeExternalMedia> fromValue(int value) {
        for (QueryParamIncludeExternalMedia o: QueryParamIncludeExternalMedia.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
