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


public class StopTaskRequestBuilder {

    private PathParamTaskName taskName;
    private final SDKMethodInterfaces.MethodCallStopTask sdk;

    public StopTaskRequestBuilder(SDKMethodInterfaces.MethodCallStopTask sdk) {
        this.sdk = sdk;
    }

    public StopTaskRequestBuilder taskName(PathParamTaskName taskName) {
        Utils.checkNotNull(taskName, "taskName");
        this.taskName = taskName;
        return this;
    }

    public StopTaskResponse call() throws Exception {

        return sdk.stopTask(
            taskName);
    }
}