/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;

public class GetLibraryItemsRequestBuilder {

    private GetLibraryItemsRequest request;
    private final SDKMethodInterfaces.MethodCallGetLibraryItems sdk;

    public GetLibraryItemsRequestBuilder(SDKMethodInterfaces.MethodCallGetLibraryItems sdk) {
        this.sdk = sdk;
    }

    public GetLibraryItemsRequestBuilder request(dev.plexapi.sdk.models.operations.GetLibraryItemsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetLibraryItemsResponse call() throws Exception {

        return sdk.getLibraryItems(
            request);
    }
}