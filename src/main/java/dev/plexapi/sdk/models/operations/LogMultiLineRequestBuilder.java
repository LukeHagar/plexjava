/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;

public class LogMultiLineRequestBuilder {

    private String request;
    private final SDKMethodInterfaces.MethodCallLogMultiLine sdk;

    public LogMultiLineRequestBuilder(SDKMethodInterfaces.MethodCallLogMultiLine sdk) {
        this.sdk = sdk;
    }

    public LogMultiLineRequestBuilder request(String request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public LogMultiLineResponse call() throws Exception {

        return sdk.logMultiLine(
            request);
    }
}
