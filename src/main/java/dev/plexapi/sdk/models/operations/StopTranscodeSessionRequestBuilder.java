/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Options;
import dev.plexapi.sdk.utils.RetryConfig;
import dev.plexapi.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class StopTranscodeSessionRequestBuilder {

    private String sessionKey;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallStopTranscodeSession sdk;

    public StopTranscodeSessionRequestBuilder(SDKMethodInterfaces.MethodCallStopTranscodeSession sdk) {
        this.sdk = sdk;
    }

    public StopTranscodeSessionRequestBuilder sessionKey(String sessionKey) {
        Utils.checkNotNull(sessionKey, "sessionKey");
        this.sessionKey = sessionKey;
        return this;
    }
                
    public StopTranscodeSessionRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public StopTranscodeSessionRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public StopTranscodeSessionResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.stopTranscodeSession(
            sessionKey,
            options);
    }
}
