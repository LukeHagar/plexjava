/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;
/**
 * GetAllMediaLibraryQueryParamIncludeMeta - Adds the Meta object to the response
 * 
 */
public enum GetAllMediaLibraryQueryParamIncludeMeta {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private GetAllMediaLibraryQueryParamIncludeMeta(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public static Optional<GetAllMediaLibraryQueryParamIncludeMeta> fromValue(int value) {
        for (GetAllMediaLibraryQueryParamIncludeMeta o: GetAllMediaLibraryQueryParamIncludeMeta.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
