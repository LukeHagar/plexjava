/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Scope - `all` - This is the only supported `scope` parameter.
 */
public enum Scope {
    ALL("all");

    @JsonValue
    private final String value;

    private Scope(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Scope> fromValue(String value) {
        for (Scope o: Scope.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
