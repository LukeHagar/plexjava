/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;


public class GetUpdateStatusRequestBuilder {

    private final SDKMethodInterfaces.MethodCallGetUpdateStatus sdk;

    public GetUpdateStatusRequestBuilder(SDKMethodInterfaces.MethodCallGetUpdateStatus sdk) {
        this.sdk = sdk;
    }

    public GetUpdateStatusResponse call() throws Exception {

        return sdk.getUpdateStatusDirect();
    }
}
