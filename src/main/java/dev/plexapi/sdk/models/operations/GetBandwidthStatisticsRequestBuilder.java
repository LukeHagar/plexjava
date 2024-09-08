/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Long;
import java.util.Optional;

public class GetBandwidthStatisticsRequestBuilder {

    private Optional<Long> timespan = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetBandwidthStatistics sdk;

    public GetBandwidthStatisticsRequestBuilder(SDKMethodInterfaces.MethodCallGetBandwidthStatistics sdk) {
        this.sdk = sdk;
    }
                
    public GetBandwidthStatisticsRequestBuilder timespan(long timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = Optional.of(timespan);
        return this;
    }

    public GetBandwidthStatisticsRequestBuilder timespan(java.util.Optional<java.lang.Long> timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = timespan;
        return this;
    }

    public GetBandwidthStatisticsResponse call() throws Exception {

        return sdk.getBandwidthStatistics(
            timespan);
    }
}