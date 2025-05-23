/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;

public class GetSessionHistoryRequestBuilder {

    private Optional<String> sort = Optional.empty();
    private Optional<Long> accountId = Optional.empty();
    private Optional<? extends QueryParamFilter> filter = Optional.empty();
    private Optional<Long> librarySectionID = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetSessionHistory sdk;

    public GetSessionHistoryRequestBuilder(SDKMethodInterfaces.MethodCallGetSessionHistory sdk) {
        this.sdk = sdk;
    }
                
    public GetSessionHistoryRequestBuilder sort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.of(sort);
        return this;
    }

    public GetSessionHistoryRequestBuilder sort(Optional<String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }
                
    public GetSessionHistoryRequestBuilder accountId(long accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = Optional.of(accountId);
        return this;
    }

    public GetSessionHistoryRequestBuilder accountId(Optional<Long> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }
                
    public GetSessionHistoryRequestBuilder filter(QueryParamFilter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.of(filter);
        return this;
    }

    public GetSessionHistoryRequestBuilder filter(Optional<? extends QueryParamFilter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }
                
    public GetSessionHistoryRequestBuilder librarySectionID(long librarySectionID) {
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        this.librarySectionID = Optional.of(librarySectionID);
        return this;
    }

    public GetSessionHistoryRequestBuilder librarySectionID(Optional<Long> librarySectionID) {
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
