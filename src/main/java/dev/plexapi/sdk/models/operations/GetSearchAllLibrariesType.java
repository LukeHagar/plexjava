/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * GetSearchAllLibrariesType - The type of media content
 * 
 */
public enum GetSearchAllLibrariesType {
    Movie("movie"),
    TvShow("show"),
    Season("season"),
    Episode("episode"),
    Artist("artist"),
    Album("album");

    @JsonValue
    private final String value;

    private GetSearchAllLibrariesType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GetSearchAllLibrariesType> fromValue(String value) {
        for (GetSearchAllLibrariesType o: GetSearchAllLibrariesType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
