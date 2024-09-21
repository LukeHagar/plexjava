/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DefaultSubtitleForced - The forced subtitles searches mode (0 = Prefer non-forced subtitles, 1 = Prefer forced subtitles, 2 = Only show forced subtitles, 3 = Only show non-forced subtitles)
 */
public enum DefaultSubtitleForced {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private DefaultSubtitleForced(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
}
