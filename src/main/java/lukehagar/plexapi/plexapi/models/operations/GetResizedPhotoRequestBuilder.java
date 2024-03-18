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


public class GetResizedPhotoRequestBuilder {

    private GetResizedPhotoRequest request;
    private final SDKMethodInterfaces.MethodCallGetResizedPhoto sdk;

    public GetResizedPhotoRequestBuilder(SDKMethodInterfaces.MethodCallGetResizedPhoto sdk) {
        this.sdk = sdk;
    }

    public GetResizedPhotoRequestBuilder request(GetResizedPhotoRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetResizedPhotoResponse call() throws Exception {

        return sdk.getResizedPhoto(
            request);
    }
}
