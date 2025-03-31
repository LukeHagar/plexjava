/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

/**
 * Smart
 * 
 * <p>whether the playlist is smart or not
 */
public enum Smart {
    ZERO(0L),
    ONE(1L);

    @JsonValue
    private final long value;

    private Smart(long value) {
        this.value = value;
    }
    
    public long value() {
        return value;
    }
    
    public static Optional<Smart> fromValue(long value) {
        for (Smart o: Smart.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

