/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

/**
 * AutoSelectSubtitle
 * 
 * <p>The auto-select subtitle mode (0 = Manually selected, 1 = Shown with foreign audio, 2 = Always enabled)
 */
public enum AutoSelectSubtitle {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private AutoSelectSubtitle(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public static Optional<AutoSelectSubtitle> fromValue(int value) {
        for (AutoSelectSubtitle o: AutoSelectSubtitle.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

