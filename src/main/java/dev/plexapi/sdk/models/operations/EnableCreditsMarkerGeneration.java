/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * EnableCreditsMarkerGeneration - Setting that indicates if credits markers detection is enabled. (-1 = Library default, 0 = Disabled).
 */
public enum EnableCreditsMarkerGeneration {
    LibraryDefault("-1"),
    Disabled("0");

    @JsonValue
    private final String value;

    private EnableCreditsMarkerGeneration(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<EnableCreditsMarkerGeneration> fromValue(String value) {
        for (EnableCreditsMarkerGeneration o: EnableCreditsMarkerGeneration.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
