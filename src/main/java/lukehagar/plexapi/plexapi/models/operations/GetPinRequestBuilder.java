/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import lukehagar.plexapi.plexapi.models.errors.SDKError;
import lukehagar.plexapi.plexapi.utils.LazySingletonValue;
import lukehagar.plexapi.plexapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetPinRequestBuilder {

    private Optional<? extends Boolean> strong = Utils.readDefaultOrConstValue(
                            "strong",
                            "false",
                            new TypeReference<Optional<? extends Boolean>>() {});
    private String xPlexClientIdentifier;
    private java.util.Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetPin sdk;

    public GetPinRequestBuilder(SDKMethodInterfaces.MethodCallGetPin sdk) {
        this.sdk = sdk;
    }
                
    public GetPinRequestBuilder strong(boolean strong) {
        Utils.checkNotNull(strong, "strong");
        this.strong = Optional.of(strong);
        return this;
    }

    public GetPinRequestBuilder strong(Optional<? extends Boolean> strong) {
        Utils.checkNotNull(strong, "strong");
        this.strong = strong;
        return this;
    }

    public GetPinRequestBuilder xPlexClientIdentifier(String xPlexClientIdentifier) {
        Utils.checkNotNull(xPlexClientIdentifier, "xPlexClientIdentifier");
        this.xPlexClientIdentifier = xPlexClientIdentifier;
        return this;
    }
                
    public GetPinRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public GetPinRequestBuilder serverURL(java.util.Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public GetPinResponse call() throws Exception {
        if (strong == null) {
            strong = _SINGLETON_VALUE_Strong.value();
        }

        return sdk.getPin(
            strong,
            xPlexClientIdentifier,
            serverURL);
    }

    private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_Strong =
            new LazySingletonValue<>(
                    "strong",
                    "false",
                    new TypeReference<Optional<? extends Boolean>>() {});
}
