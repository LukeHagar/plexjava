/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.lang.Exception;

public class MarkUnplayedRequestBuilder {

    private Double key;
    private final SDKMethodInterfaces.MethodCallMarkUnplayed sdk;

    public MarkUnplayedRequestBuilder(SDKMethodInterfaces.MethodCallMarkUnplayed sdk) {
        this.sdk = sdk;
    }

    public MarkUnplayedRequestBuilder key(double key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public MarkUnplayedResponse call() throws Exception {

        return sdk.markUnplayed(
            key);
    }
}
