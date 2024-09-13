/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetTokenDetailsRequestBuilder {

    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetTokenDetails sdk;

    public GetTokenDetailsRequestBuilder(SDKMethodInterfaces.MethodCallGetTokenDetails sdk) {
        this.sdk = sdk;
    }
                
    public GetTokenDetailsRequestBuilder serverURL(java.lang.String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public GetTokenDetailsRequestBuilder serverURL(java.util.Optional<java.lang.String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public GetTokenDetailsResponse call() throws Exception {

        return sdk.getTokenDetails(
            serverURL);
    }
}
