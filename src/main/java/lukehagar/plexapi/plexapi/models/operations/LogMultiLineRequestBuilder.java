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


public class LogMultiLineRequestBuilder {

    private String request;
    private final SDKMethodInterfaces.MethodCallLogMultiLine sdk;

    public LogMultiLineRequestBuilder(SDKMethodInterfaces.MethodCallLogMultiLine sdk) {
        this.sdk = sdk;
    }

    public LogMultiLineRequestBuilder request(String request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public LogMultiLineResponse call() throws Exception {

        return sdk.logMultiLine(
            request);
    }
}
