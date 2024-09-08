/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.util.Optional;

public class GetGlobalHubsRequestBuilder {

    private Optional<Double> count = Optional.empty();
    private Optional<? extends OnlyTransient> onlyTransient = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetGlobalHubs sdk;

    public GetGlobalHubsRequestBuilder(SDKMethodInterfaces.MethodCallGetGlobalHubs sdk) {
        this.sdk = sdk;
    }
                
    public GetGlobalHubsRequestBuilder count(double count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.of(count);
        return this;
    }

    public GetGlobalHubsRequestBuilder count(java.util.Optional<java.lang.Double> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }
                
    public GetGlobalHubsRequestBuilder onlyTransient(dev.plexapi.sdk.models.operations.OnlyTransient onlyTransient) {
        Utils.checkNotNull(onlyTransient, "onlyTransient");
        this.onlyTransient = Optional.of(onlyTransient);
        return this;
    }

    public GetGlobalHubsRequestBuilder onlyTransient(java.util.Optional<? extends dev.plexapi.sdk.models.operations.OnlyTransient> onlyTransient) {
        Utils.checkNotNull(onlyTransient, "onlyTransient");
        this.onlyTransient = onlyTransient;
        return this;
    }

    public GetGlobalHubsResponse call() throws Exception {

        return sdk.getGlobalHubs(
            count,
            onlyTransient);
    }
}