/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetPinRequestBuilder {

    private GetPinRequest request;
    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetPin sdk;

    public GetPinRequestBuilder(SDKMethodInterfaces.MethodCallGetPin sdk) {
        this.sdk = sdk;
    }

    public GetPinRequestBuilder request(dev.plexapi.sdk.models.operations.GetPinRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetPinRequestBuilder serverURL(java.lang.String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public GetPinRequestBuilder serverURL(java.util.Optional<java.lang.String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public GetPinResponse call() throws Exception {

        return sdk.getPin(
            request,
            serverURL);
    }
}
