/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.Long;
import java.util.Optional;

public class GetStatisticsRequestBuilder {

    private Optional<Long> timespan = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetStatistics sdk;

    public GetStatisticsRequestBuilder(SDKMethodInterfaces.MethodCallGetStatistics sdk) {
        this.sdk = sdk;
    }
                
    public GetStatisticsRequestBuilder timespan(long timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = Optional.of(timespan);
        return this;
    }

    public GetStatisticsRequestBuilder timespan(Optional<Long> timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = timespan;
        return this;
    }

    public GetStatisticsResponse call() throws Exception {

        return sdk.getStatistics(
            timespan);
    }
}
