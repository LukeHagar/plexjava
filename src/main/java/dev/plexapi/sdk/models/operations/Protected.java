/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

/**
 * Protected - Indicates whether the account is protected.
 */
public enum Protected {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private Protected(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public static Optional<Protected> fromValue(int value) {
        for (Protected o: Protected.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
