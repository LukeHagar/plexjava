/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.Long;

public class GetMediaArtsRequestBuilder {

    private Long ratingKey;
    private final SDKMethodInterfaces.MethodCallGetMediaArts sdk;

    public GetMediaArtsRequestBuilder(SDKMethodInterfaces.MethodCallGetMediaArts sdk) {
        this.sdk = sdk;
    }

    public GetMediaArtsRequestBuilder ratingKey(long ratingKey) {
        Utils.checkNotNull(ratingKey, "ratingKey");
        this.ratingKey = ratingKey;
        return this;
    }

    public GetMediaArtsResponse call() throws Exception {

        return sdk.getMediaArts(
            ratingKey);
    }
}
