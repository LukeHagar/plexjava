/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.lang.Exception;

public class MarkPlayedRequestBuilder {

    private Double key;
    private final SDKMethodInterfaces.MethodCallMarkPlayed sdk;

    public MarkPlayedRequestBuilder(SDKMethodInterfaces.MethodCallMarkPlayed sdk) {
        this.sdk = sdk;
    }

    public MarkPlayedRequestBuilder key(double key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public MarkPlayedResponse call() throws Exception {

        return sdk.markPlayed(
            key);
    }
}
