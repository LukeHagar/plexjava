/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

/**
 * IncludeGuids
 * 
 * <p>Adds the Guids object to the response
 */
public enum IncludeGuids {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private IncludeGuids(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public static Optional<IncludeGuids> fromValue(int value) {
        for (IncludeGuids o: IncludeGuids.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

