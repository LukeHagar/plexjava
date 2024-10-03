/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Options;
import dev.plexapi.sdk.utils.RetryConfig;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.util.Optional;

public class DeletePlaylistRequestBuilder {

    private Double playlistID;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallDeletePlaylist sdk;

    public DeletePlaylistRequestBuilder(SDKMethodInterfaces.MethodCallDeletePlaylist sdk) {
        this.sdk = sdk;
    }

    public DeletePlaylistRequestBuilder playlistID(double playlistID) {
        Utils.checkNotNull(playlistID, "playlistID");
        this.playlistID = playlistID;
        return this;
    }
                
    public DeletePlaylistRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public DeletePlaylistRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public DeletePlaylistResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.deletePlaylist(
            playlistID,
            options);
    }
}
