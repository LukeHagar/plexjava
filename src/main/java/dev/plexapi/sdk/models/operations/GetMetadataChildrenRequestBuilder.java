/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class GetMetadataChildrenRequestBuilder {

    private Double ratingKey;
    private Optional<String> includeElements = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetMetadataChildren sdk;

    public GetMetadataChildrenRequestBuilder(SDKMethodInterfaces.MethodCallGetMetadataChildren sdk) {
        this.sdk = sdk;
    }

    public GetMetadataChildrenRequestBuilder ratingKey(double ratingKey) {
        Utils.checkNotNull(ratingKey, "ratingKey");
        this.ratingKey = ratingKey;
        return this;
    }
                
    public GetMetadataChildrenRequestBuilder includeElements(String includeElements) {
        Utils.checkNotNull(includeElements, "includeElements");
        this.includeElements = Optional.of(includeElements);
        return this;
    }

    public GetMetadataChildrenRequestBuilder includeElements(Optional<String> includeElements) {
        Utils.checkNotNull(includeElements, "includeElements");
        this.includeElements = includeElements;
        return this;
    }

    public GetMetadataChildrenResponse call() throws Exception {

        return sdk.getMetadataChildren(
            ratingKey,
            includeElements);
    }
}
