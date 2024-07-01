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


public class GetLibraryHubsRequestBuilder {

    private Double sectionId;
    private Optional<? extends Double> count = Optional.empty();
    private Optional<? extends QueryParamOnlyTransient> onlyTransient = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetLibraryHubs sdk;

    public GetLibraryHubsRequestBuilder(SDKMethodInterfaces.MethodCallGetLibraryHubs sdk) {
        this.sdk = sdk;
    }

    public GetLibraryHubsRequestBuilder sectionId(double sectionId) {
        Utils.checkNotNull(sectionId, "sectionId");
        this.sectionId = sectionId;
        return this;
    }
                
    public GetLibraryHubsRequestBuilder count(double count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.of(count);
        return this;
    }

    public GetLibraryHubsRequestBuilder count(Optional<? extends Double> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }
                
    public GetLibraryHubsRequestBuilder onlyTransient(QueryParamOnlyTransient onlyTransient) {
        Utils.checkNotNull(onlyTransient, "onlyTransient");
        this.onlyTransient = Optional.of(onlyTransient);
        return this;
    }

    public GetLibraryHubsRequestBuilder onlyTransient(Optional<? extends QueryParamOnlyTransient> onlyTransient) {
        Utils.checkNotNull(onlyTransient, "onlyTransient");
        this.onlyTransient = onlyTransient;
        return this;
    }

    public GetLibraryHubsResponse call() throws Exception {

        return sdk.getLibraryHubs(
            sectionId,
            count,
            onlyTransient);
    }
}