/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;
/**
 * MediaReviewsVisibility - Whether or not the account has media reviews visibility enabled
 */
public enum MediaReviewsVisibility {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private MediaReviewsVisibility(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public static Optional<MediaReviewsVisibility> fromValue(int value) {
        for (MediaReviewsVisibility o: MediaReviewsVisibility.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
