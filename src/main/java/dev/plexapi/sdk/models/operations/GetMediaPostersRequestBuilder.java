/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.Long;

public class GetMediaPostersRequestBuilder {

    private Long ratingKey;
    private final SDKMethodInterfaces.MethodCallGetMediaPosters sdk;

    public GetMediaPostersRequestBuilder(SDKMethodInterfaces.MethodCallGetMediaPosters sdk) {
        this.sdk = sdk;
    }

    public GetMediaPostersRequestBuilder ratingKey(long ratingKey) {
        Utils.checkNotNull(ratingKey, "ratingKey");
        this.ratingKey = ratingKey;
        return this;
    }

    public GetMediaPostersResponse call() throws Exception {

        return sdk.getMediaPosters(
            ratingKey);
    }
}
