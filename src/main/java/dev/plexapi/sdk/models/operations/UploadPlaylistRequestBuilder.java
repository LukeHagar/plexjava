/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.utils.LazySingletonValue;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.Long;
import java.lang.String;

public class UploadPlaylistRequestBuilder {

    private String path;
    private QueryParamForce force;
    private Long sectionID;
    private final SDKMethodInterfaces.MethodCallUploadPlaylist sdk;

    public UploadPlaylistRequestBuilder(SDKMethodInterfaces.MethodCallUploadPlaylist sdk) {
        this.sdk = sdk;
    }

    public UploadPlaylistRequestBuilder path(String path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
        return this;
    }

    public UploadPlaylistRequestBuilder force(QueryParamForce force) {
        Utils.checkNotNull(force, "force");
        this.force = force;
        return this;
    }

    public UploadPlaylistRequestBuilder sectionID(long sectionID) {
        Utils.checkNotNull(sectionID, "sectionID");
        this.sectionID = sectionID;
        return this;
    }

    public UploadPlaylistResponse call() throws Exception {
        if (sectionID == null) {
            sectionID = _SINGLETON_VALUE_SectionID.value();
        }
        return sdk.uploadPlaylist(
            path,
            force,
            sectionID);
    }

    private static final LazySingletonValue<Long> _SINGLETON_VALUE_SectionID =
            new LazySingletonValue<>(
                    "sectionID",
                    "1",
                    new TypeReference<Long>() {});
}
