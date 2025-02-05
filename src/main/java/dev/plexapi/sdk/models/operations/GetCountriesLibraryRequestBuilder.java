/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Integer;

public class GetCountriesLibraryRequestBuilder {

    private Integer sectionKey;
    private final SDKMethodInterfaces.MethodCallGetCountriesLibrary sdk;

    public GetCountriesLibraryRequestBuilder(SDKMethodInterfaces.MethodCallGetCountriesLibrary sdk) {
        this.sdk = sdk;
    }

    public GetCountriesLibraryRequestBuilder sectionKey(int sectionKey) {
        Utils.checkNotNull(sectionKey, "sectionKey");
        this.sectionKey = sectionKey;
        return this;
    }

    public GetCountriesLibraryResponse call() throws Exception {

        return sdk.getCountriesLibrary(
            sectionKey);
    }
}
