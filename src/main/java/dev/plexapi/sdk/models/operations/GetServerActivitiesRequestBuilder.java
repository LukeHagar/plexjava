/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Options;
import dev.plexapi.sdk.utils.RetryConfig;
import dev.plexapi.sdk.utils.Utils;
import java.util.Optional;

public class GetServerActivitiesRequestBuilder {

    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetServerActivities sdk;

    public GetServerActivitiesRequestBuilder(SDKMethodInterfaces.MethodCallGetServerActivities sdk) {
        this.sdk = sdk;
    }
                
    public GetServerActivitiesRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetServerActivitiesRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetServerActivitiesResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getServerActivities(
            options);
    }
}
