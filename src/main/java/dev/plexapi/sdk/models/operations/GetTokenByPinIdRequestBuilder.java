/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class GetTokenByPinIdRequestBuilder {

    private GetTokenByPinIdRequest request;
    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetTokenByPinId sdk;

    public GetTokenByPinIdRequestBuilder(SDKMethodInterfaces.MethodCallGetTokenByPinId sdk) {
        this.sdk = sdk;
    }

    public GetTokenByPinIdRequestBuilder request(GetTokenByPinIdRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetTokenByPinIdRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public GetTokenByPinIdRequestBuilder serverURL(Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public GetTokenByPinIdResponse call() throws Exception {

        return sdk.getTokenByPinId(
            request,
            serverURL);
    }
}
