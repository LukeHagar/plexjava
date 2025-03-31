/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

/**
 * QueryParamIncludeCollections
 */
public enum QueryParamIncludeCollections {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private QueryParamIncludeCollections(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public static Optional<QueryParamIncludeCollections> fromValue(int value) {
        for (QueryParamIncludeCollections o: QueryParamIncludeCollections.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

