/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Long;
import java.util.Optional;

public class GetTopWatchedContentRequestBuilder {

    private GetTopWatchedContentQueryParamType type;
    private Optional<Long> includeGuids = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetTopWatchedContent sdk;

    public GetTopWatchedContentRequestBuilder(SDKMethodInterfaces.MethodCallGetTopWatchedContent sdk) {
        this.sdk = sdk;
    }

    public GetTopWatchedContentRequestBuilder type(GetTopWatchedContentQueryParamType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }
                
    public GetTopWatchedContentRequestBuilder includeGuids(long includeGuids) {
        Utils.checkNotNull(includeGuids, "includeGuids");
        this.includeGuids = Optional.of(includeGuids);
        return this;
    }

    public GetTopWatchedContentRequestBuilder includeGuids(Optional<Long> includeGuids) {
        Utils.checkNotNull(includeGuids, "includeGuids");
        this.includeGuids = includeGuids;
        return this;
    }

    public GetTopWatchedContentResponse call() throws Exception {

        return sdk.getTopWatchedContent(
            type,
            includeGuids);
    }
}
