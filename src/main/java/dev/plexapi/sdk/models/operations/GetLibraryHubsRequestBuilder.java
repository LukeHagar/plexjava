/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.util.Optional;

public class GetLibraryHubsRequestBuilder {

    private Double sectionId;
    private Optional<Double> count = Optional.empty();
    private Optional<? extends QueryParamOnlyTransient> onlyTransient = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetLibraryHubs sdk;

    public GetLibraryHubsRequestBuilder(SDKMethodInterfaces.MethodCallGetLibraryHubs sdk) {
        this.sdk = sdk;
    }

    public GetLibraryHubsRequestBuilder sectionId(double sectionId) {
        Utils.checkNotNull(sectionId, "sectionId");
        this.sectionId = sectionId;
        return this;
    }
                
    public GetLibraryHubsRequestBuilder count(double count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.of(count);
        return this;
    }

    public GetLibraryHubsRequestBuilder count(Optional<Double> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }
                
    public GetLibraryHubsRequestBuilder onlyTransient(QueryParamOnlyTransient onlyTransient) {
        Utils.checkNotNull(onlyTransient, "onlyTransient");
        this.onlyTransient = Optional.of(onlyTransient);
        return this;
    }

    public GetLibraryHubsRequestBuilder onlyTransient(Optional<? extends QueryParamOnlyTransient> onlyTransient) {
        Utils.checkNotNull(onlyTransient, "onlyTransient");
        this.onlyTransient = onlyTransient;
        return this;
    }

    public GetLibraryHubsResponse call() throws Exception {

        return sdk.getLibraryHubs(
            sectionId,
            count,
            onlyTransient);
    }
}
