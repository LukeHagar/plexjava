/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.lang.Exception;

public class GetPlaylistRequestBuilder {

    private Double playlistID;
    private final SDKMethodInterfaces.MethodCallGetPlaylist sdk;

    public GetPlaylistRequestBuilder(SDKMethodInterfaces.MethodCallGetPlaylist sdk) {
        this.sdk = sdk;
    }

    public GetPlaylistRequestBuilder playlistID(double playlistID) {
        Utils.checkNotNull(playlistID, "playlistID");
        this.playlistID = playlistID;
        return this;
    }

    public GetPlaylistResponse call() throws Exception {

        return sdk.getPlaylist(
            playlistID);
    }
}
