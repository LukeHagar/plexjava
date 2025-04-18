/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

/**
 * Hidden
 * 
 * <p>UNKNOWN
 */
public enum Hidden {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private Hidden(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public static Optional<Hidden> fromValue(int value) {
        for (Hidden o: Hidden.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

