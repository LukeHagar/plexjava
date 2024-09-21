/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;

public class GetThumbImageRequestBuilder {

    private GetThumbImageRequest request;
    private final SDKMethodInterfaces.MethodCallGetThumbImage sdk;

    public GetThumbImageRequestBuilder(SDKMethodInterfaces.MethodCallGetThumbImage sdk) {
        this.sdk = sdk;
    }

    public GetThumbImageRequestBuilder request(GetThumbImageRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetThumbImageResponse call() throws Exception {

        return sdk.getThumbImage(
            request);
    }
}
