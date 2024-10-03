/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Options;
import dev.plexapi.sdk.utils.RetryConfig;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.util.Optional;

public class MarkPlayedRequestBuilder {

    private Double key;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallMarkPlayed sdk;

    public MarkPlayedRequestBuilder(SDKMethodInterfaces.MethodCallMarkPlayed sdk) {
        this.sdk = sdk;
    }

    public MarkPlayedRequestBuilder key(double key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }
                
    public MarkPlayedRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public MarkPlayedRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public MarkPlayedResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.markPlayed(
            key,
            options);
    }
}
