/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import java.lang.Exception;

public class GetServerListRequestBuilder {

    private final SDKMethodInterfaces.MethodCallGetServerList sdk;

    public GetServerListRequestBuilder(SDKMethodInterfaces.MethodCallGetServerList sdk) {
        this.sdk = sdk;
    }

    public GetServerListResponse call() throws Exception {

        return sdk.getServerListDirect();
    }
}
