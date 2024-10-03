/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Options;
import dev.plexapi.sdk.utils.RetryConfig;
import dev.plexapi.sdk.utils.Utils;
import java.util.Optional;

public class CheckForUpdatesRequestBuilder {

    private Optional<? extends Download> download = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCheckForUpdates sdk;

    public CheckForUpdatesRequestBuilder(SDKMethodInterfaces.MethodCallCheckForUpdates sdk) {
        this.sdk = sdk;
    }
                
    public CheckForUpdatesRequestBuilder download(Download download) {
        Utils.checkNotNull(download, "download");
        this.download = Optional.of(download);
        return this;
    }

    public CheckForUpdatesRequestBuilder download(Optional<? extends Download> download) {
        Utils.checkNotNull(download, "download");
        this.download = download;
        return this;
    }
                
    public CheckForUpdatesRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CheckForUpdatesRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CheckForUpdatesResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.checkForUpdates(
            download,
            options);
    }
}
