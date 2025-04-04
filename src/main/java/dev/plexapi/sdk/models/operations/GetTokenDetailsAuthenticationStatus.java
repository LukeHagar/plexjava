/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * GetTokenDetailsAuthenticationStatus
 * 
 * <p>String representation of subscriptionActive
 */
public enum GetTokenDetailsAuthenticationStatus {
    INACTIVE("Inactive"),
    ACTIVE("Active");

    @JsonValue
    private final String value;

    private GetTokenDetailsAuthenticationStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GetTokenDetailsAuthenticationStatus> fromValue(String value) {
        for (GetTokenDetailsAuthenticationStatus o: GetTokenDetailsAuthenticationStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

