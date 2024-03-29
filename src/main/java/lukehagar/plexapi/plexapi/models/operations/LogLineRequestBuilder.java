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


public class LogLineRequestBuilder {

    private Level level;
    private String message;
    private String source;
    private final SDKMethodInterfaces.MethodCallLogLine sdk;

    public LogLineRequestBuilder(SDKMethodInterfaces.MethodCallLogLine sdk) {
        this.sdk = sdk;
    }

    public LogLineRequestBuilder level(Level level) {
        Utils.checkNotNull(level, "level");
        this.level = level;
        return this;
    }

    public LogLineRequestBuilder message(String message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    public LogLineRequestBuilder source(String source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    public LogLineResponse call() throws Exception {

        return sdk.logLine(
            level,
            message,
            source);
    }
}
