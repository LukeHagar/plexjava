/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.Long;
import java.util.Optional;

public class GetResourcesStatisticsRequestBuilder {

    private Optional<Long> timespan = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetResourcesStatistics sdk;

    public GetResourcesStatisticsRequestBuilder(SDKMethodInterfaces.MethodCallGetResourcesStatistics sdk) {
        this.sdk = sdk;
    }
                
    public GetResourcesStatisticsRequestBuilder timespan(long timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = Optional.of(timespan);
        return this;
    }

    public GetResourcesStatisticsRequestBuilder timespan(Optional<Long> timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = timespan;
        return this;
    }

    public GetResourcesStatisticsResponse call() throws Exception {

        return sdk.getResourcesStatistics(
            timespan);
    }
}
