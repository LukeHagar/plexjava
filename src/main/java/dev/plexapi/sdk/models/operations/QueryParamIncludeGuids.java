/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;
/**
 * QueryParamIncludeGuids - Adds the Guid object to the response
 * 
 */
public enum QueryParamIncludeGuids {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private QueryParamIncludeGuids(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public static Optional<QueryParamIncludeGuids> fromValue(int value) {
        for (QueryParamIncludeGuids o: QueryParamIncludeGuids.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
