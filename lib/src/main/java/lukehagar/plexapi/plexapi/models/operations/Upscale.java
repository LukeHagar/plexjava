/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Upscale - allow images to be resized beyond native dimensions.
 */
public enum Upscale {
    ZERO(0L),
    ONE(1L);

    @JsonValue
    public final Long value;

    private Upscale(Long value) {
        this.value = value;
    }
}
