/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.Integer;

public class GetActorsLibraryRequestBuilder {

    private Integer sectionKey;
    private GetActorsLibraryQueryParamType type;
    private final SDKMethodInterfaces.MethodCallGetActorsLibrary sdk;

    public GetActorsLibraryRequestBuilder(SDKMethodInterfaces.MethodCallGetActorsLibrary sdk) {
        this.sdk = sdk;
    }

    public GetActorsLibraryRequestBuilder sectionKey(int sectionKey) {
        Utils.checkNotNull(sectionKey, "sectionKey");
        this.sectionKey = sectionKey;
        return this;
    }

    public GetActorsLibraryRequestBuilder type(GetActorsLibraryQueryParamType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetActorsLibraryResponse call() throws Exception {

        return sdk.getActorsLibrary(
            sectionKey,
            type);
    }
}
