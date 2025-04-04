/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum GetTokenDetailsStatus {
    ONLINE("online"),
    OFFLINE("offline");

    @JsonValue
    private final String value;

    private GetTokenDetailsStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GetTokenDetailsStatus> fromValue(String value) {
        for (GetTokenDetailsStatus o: GetTokenDetailsStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

