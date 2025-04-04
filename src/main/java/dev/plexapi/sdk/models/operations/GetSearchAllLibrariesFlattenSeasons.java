/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * GetSearchAllLibrariesFlattenSeasons
 * 
 * <p>Setting that indicates if seasons are set to hidden for the show. (-1 = Library default, 0 = Hide, 1 = Show).
 */
public enum GetSearchAllLibrariesFlattenSeasons {
    LibraryDefault("-1"),
    Hide("0"),
    Show("1");

    @JsonValue
    private final String value;

    private GetSearchAllLibrariesFlattenSeasons(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GetSearchAllLibrariesFlattenSeasons> fromValue(String value) {
        for (GetSearchAllLibrariesFlattenSeasons o: GetSearchAllLibrariesFlattenSeasons.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

