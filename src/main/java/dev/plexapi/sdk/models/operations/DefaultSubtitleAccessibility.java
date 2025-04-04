/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

/**
 * DefaultSubtitleAccessibility
 * 
 * <p>The subtitles for the deaf or hard-of-hearing (SDH) searches mode (0 = Prefer non-SDH subtitles, 1 = Prefer SDH subtitles, 2 = Only show SDH subtitles, 3 = Only show non-SDH subtitles)
 */
public enum DefaultSubtitleAccessibility {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private DefaultSubtitleAccessibility(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public static Optional<DefaultSubtitleAccessibility> fromValue(int value) {
        for (DefaultSubtitleAccessibility o: DefaultSubtitleAccessibility.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

