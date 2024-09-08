/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * DefaultSubtitleForced - The forced subtitles searches mode (0 = Prefer non-forced subtitles, 1 = Prefer forced subtitles, 2 = Only show forced subtitles, 3 = Only show non-forced subtitles)
 */
public enum DefaultSubtitleForced {
    ZERO("0"),
    ONE("1");

    @JsonValue
    private final String value;

    private DefaultSubtitleForced(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}