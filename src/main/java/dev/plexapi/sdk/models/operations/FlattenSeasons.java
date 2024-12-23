/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum FlattenSeasons {
    False("0"),
    True("1");

    @JsonValue
    private final String value;

    private FlattenSeasons(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<FlattenSeasons> fromValue(String value) {
        for (FlattenSeasons o: FlattenSeasons.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
