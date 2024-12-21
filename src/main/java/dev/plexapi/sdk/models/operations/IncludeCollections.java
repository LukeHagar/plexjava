/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

/**
 * IncludeCollections - include collections in the results
 * 
 */
public enum IncludeCollections {
    ONE(1L),
    ZERO(0L);

    @JsonValue
    private final long value;

    private IncludeCollections(long value) {
        this.value = value;
    }
    
    public long value() {
        return value;
    }
    
    public static Optional<IncludeCollections> fromValue(long value) {
        for (IncludeCollections o: IncludeCollections.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
