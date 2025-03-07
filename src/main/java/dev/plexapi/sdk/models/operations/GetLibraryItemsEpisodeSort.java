/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * GetLibraryItemsEpisodeSort - Setting that indicates how episodes are sorted for the show. (-1 = Library default, 0 = Oldest first, 1 = Newest first).
 */
public enum GetLibraryItemsEpisodeSort {
    LibraryDefault("-1"),
    OldestFirst("0"),
    NewestFirst("1");

    @JsonValue
    private final String value;

    private GetLibraryItemsEpisodeSort(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GetLibraryItemsEpisodeSort> fromValue(String value) {
        for (GetLibraryItemsEpisodeSort o: GetLibraryItemsEpisodeSort.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
