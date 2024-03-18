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


public class PerformSearchRequestBuilder {

    private String query;
    private Optional<? extends Double> sectionId = Optional.empty();
    private Optional<? extends Double> limit = Utils.readDefaultOrConstValue(
                            "limit",
                            "3",
                            new TypeReference<Optional<? extends Double>>() {});
    private final SDKMethodInterfaces.MethodCallPerformSearch sdk;

    public PerformSearchRequestBuilder(SDKMethodInterfaces.MethodCallPerformSearch sdk) {
        this.sdk = sdk;
    }

    public PerformSearchRequestBuilder query(String query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }
                
    public PerformSearchRequestBuilder sectionId(double sectionId) {
        Utils.checkNotNull(sectionId, "sectionId");
        this.sectionId = Optional.of(sectionId);
        return this;
    }

    public PerformSearchRequestBuilder sectionId(Optional<? extends Double> sectionId) {
        Utils.checkNotNull(sectionId, "sectionId");
        this.sectionId = sectionId;
        return this;
    }
                
    public PerformSearchRequestBuilder limit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.of(limit);
        return this;
    }

    public PerformSearchRequestBuilder limit(Optional<? extends Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public PerformSearchResponse call() throws Exception {
        if (limit == null) {
            limit = _SINGLETON_VALUE_Limit.value();
        }

        return sdk.performSearch(
            query,
            sectionId,
            limit);
    }

    private static final LazySingletonValue<Optional<? extends Double>> _SINGLETON_VALUE_Limit =
            new LazySingletonValue<>(
                    "limit",
                    "3",
                    new TypeReference<Optional<? extends Double>>() {});
}
