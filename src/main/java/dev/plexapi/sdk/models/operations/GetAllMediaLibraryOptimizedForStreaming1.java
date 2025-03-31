/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

public enum GetAllMediaLibraryOptimizedForStreaming1 {
    ZERO(0),
    ONE(1);

    @JsonValue
    private final int value;

    private GetAllMediaLibraryOptimizedForStreaming1(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public static Optional<GetAllMediaLibraryOptimizedForStreaming1> fromValue(int value) {
        for (GetAllMediaLibraryOptimizedForStreaming1 o: GetAllMediaLibraryOptimizedForStreaming1.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

