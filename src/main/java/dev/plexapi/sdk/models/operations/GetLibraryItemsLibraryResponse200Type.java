/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum GetLibraryItemsLibraryResponse200Type {
    COVER_POSTER("coverPoster"),
    BACKGROUND("background"),
    SNAPSHOT("snapshot"),
    CLEAR_LOGO("clearLogo");

    @JsonValue
    private final String value;

    private GetLibraryItemsLibraryResponse200Type(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GetLibraryItemsLibraryResponse200Type> fromValue(String value) {
        for (GetLibraryItemsLibraryResponse200Type o: GetLibraryItemsLibraryResponse200Type.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

