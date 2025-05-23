/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

/**
 * GetSearchAllLibrariesQueryParamIncludeCollections
 * 
 * <p>Whether to include collections in the search results.
 */
public enum GetSearchAllLibrariesQueryParamIncludeCollections {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private GetSearchAllLibrariesQueryParamIncludeCollections(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public static Optional<GetSearchAllLibrariesQueryParamIncludeCollections> fromValue(int value) {
        for (GetSearchAllLibrariesQueryParamIncludeCollections o: GetSearchAllLibrariesQueryParamIncludeCollections.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

