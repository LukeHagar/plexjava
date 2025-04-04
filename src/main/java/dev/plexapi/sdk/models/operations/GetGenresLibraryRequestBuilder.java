/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.Integer;

public class GetGenresLibraryRequestBuilder {

    private Integer sectionKey;
    private GetGenresLibraryQueryParamType type;
    private final SDKMethodInterfaces.MethodCallGetGenresLibrary sdk;

    public GetGenresLibraryRequestBuilder(SDKMethodInterfaces.MethodCallGetGenresLibrary sdk) {
        this.sdk = sdk;
    }

    public GetGenresLibraryRequestBuilder sectionKey(int sectionKey) {
        Utils.checkNotNull(sectionKey, "sectionKey");
        this.sectionKey = sectionKey;
        return this;
    }

    public GetGenresLibraryRequestBuilder type(GetGenresLibraryQueryParamType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetGenresLibraryResponse call() throws Exception {

        return sdk.getGenresLibrary(
            sectionKey,
            type);
    }
}
