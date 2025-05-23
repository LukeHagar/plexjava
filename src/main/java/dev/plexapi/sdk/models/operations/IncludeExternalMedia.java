/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

/**
 * IncludeExternalMedia
 * 
 * <p>include external media in the results
 */
public enum IncludeExternalMedia {
    ONE(1L),
    ZERO(0L);

    @JsonValue
    private final long value;

    private IncludeExternalMedia(long value) {
        this.value = value;
    }
    
    public long value() {
        return value;
    }
    
    public static Optional<IncludeExternalMedia> fromValue(long value) {
        for (IncludeExternalMedia o: IncludeExternalMedia.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

