/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Integer;

public class DeleteLibraryRequestBuilder {

    private Integer sectionKey;
    private final SDKMethodInterfaces.MethodCallDeleteLibrary sdk;

    public DeleteLibraryRequestBuilder(SDKMethodInterfaces.MethodCallDeleteLibrary sdk) {
        this.sdk = sdk;
    }

    public DeleteLibraryRequestBuilder sectionKey(int sectionKey) {
        Utils.checkNotNull(sectionKey, "sectionKey");
        this.sectionKey = sectionKey;
        return this;
    }

    public DeleteLibraryResponse call() throws Exception {

        return sdk.deleteLibrary(
            sectionKey);
    }
}