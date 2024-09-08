/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;

public class GetBannerImageRequestBuilder {

    private GetBannerImageRequest request;
    private final SDKMethodInterfaces.MethodCallGetBannerImage sdk;

    public GetBannerImageRequestBuilder(SDKMethodInterfaces.MethodCallGetBannerImage sdk) {
        this.sdk = sdk;
    }

    public GetBannerImageRequestBuilder request(dev.plexapi.sdk.models.operations.GetBannerImageRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetBannerImageResponse call() throws Exception {

        return sdk.getBannerImage(
            request);
    }
}
