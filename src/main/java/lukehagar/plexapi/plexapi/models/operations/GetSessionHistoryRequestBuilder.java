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


public class GetSessionHistoryRequestBuilder {

    private Optional<? extends String> sort = Optional.empty();
    private Optional<? extends Long> accountId = Optional.empty();
    private Optional<? extends Filter> filter = Optional.empty();
    private Optional<? extends Long> librarySectionID = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetSessionHistory sdk;

    public GetSessionHistoryRequestBuilder(SDKMethodInterfaces.MethodCallGetSessionHistory sdk) {
        this.sdk = sdk;
    }
                
    public GetSessionHistoryRequestBuilder sort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.of(sort);
        return this;
    }

    public GetSessionHistoryRequestBuilder sort(Optional<? extends String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }
                
    public GetSessionHistoryRequestBuilder accountId(long accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = Optional.of(accountId);
        return this;
    }

    public GetSessionHistoryRequestBuilder accountId(Optional<? extends Long> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }
                
    public GetSessionHistoryRequestBuilder filter(Filter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.of(filter);
        return this;
    }

    public GetSessionHistoryRequestBuilder filter(Optional<? extends Filter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }
                
    public GetSessionHistoryRequestBuilder librarySectionID(long librarySectionID) {
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        this.librarySectionID = Optional.of(librarySectionID);
        return this;
    }

    public GetSessionHistoryRequestBuilder librarySectionID(Optional<? extends Long> librarySectionID) {
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        this.librarySectionID = librarySectionID;
        return this;
    }

    public GetSessionHistoryResponse call() throws Exception {

        return sdk.getSessionHistory(
            sort,
            accountId,
            filter,
            librarySectionID);
    }
}