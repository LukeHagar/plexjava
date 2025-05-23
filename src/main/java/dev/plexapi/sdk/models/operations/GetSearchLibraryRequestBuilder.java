/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.Integer;

public class GetSearchLibraryRequestBuilder {

    private Integer sectionKey;
    private GetSearchLibraryQueryParamType type;
    private final SDKMethodInterfaces.MethodCallGetSearchLibrary sdk;

    public GetSearchLibraryRequestBuilder(SDKMethodInterfaces.MethodCallGetSearchLibrary sdk) {
        this.sdk = sdk;
    }

    public GetSearchLibraryRequestBuilder sectionKey(int sectionKey) {
        Utils.checkNotNull(sectionKey, "sectionKey");
        this.sectionKey = sectionKey;
        return this;
    }

    public GetSearchLibraryRequestBuilder type(GetSearchLibraryQueryParamType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetSearchLibraryResponse call() throws Exception {

        return sdk.getSearchLibrary(
            sectionKey,
            type);
    }
}
