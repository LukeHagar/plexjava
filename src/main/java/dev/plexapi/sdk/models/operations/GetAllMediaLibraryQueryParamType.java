/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

/**
 * GetAllMediaLibraryQueryParamType
 * 
 * <p>The type of media to retrieve or filter by.
 * 1 = movie
 * 2 = show
 * 3 = season
 * 4 = episode
 * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
 */
public enum GetAllMediaLibraryQueryParamType {
    Movie(1L),
    TvShow(2L),
    Season(3L),
    Episode(4L),
    Audio(8L),
    Album(9L),
    Track(10L);

    @JsonValue
    private final long value;

    private GetAllMediaLibraryQueryParamType(long value) {
        this.value = value;
    }
    
    public long value() {
        return value;
    }
    
    public static Optional<GetAllMediaLibraryQueryParamType> fromValue(long value) {
        for (GetAllMediaLibraryQueryParamType o: GetAllMediaLibraryQueryParamType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

