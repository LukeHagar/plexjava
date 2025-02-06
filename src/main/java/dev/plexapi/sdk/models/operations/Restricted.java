/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

/**
 * Restricted - Indicates if the user has restricted access.
 */
public enum Restricted {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private Restricted(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public static Optional<Restricted> fromValue(int value) {
        for (Restricted o: Restricted.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
