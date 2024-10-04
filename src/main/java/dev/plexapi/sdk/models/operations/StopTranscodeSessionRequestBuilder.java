/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.String;

public class StopTranscodeSessionRequestBuilder {

    private String sessionKey;
    private final SDKMethodInterfaces.MethodCallStopTranscodeSession sdk;

    public StopTranscodeSessionRequestBuilder(SDKMethodInterfaces.MethodCallStopTranscodeSession sdk) {
        this.sdk = sdk;
    }

    public StopTranscodeSessionRequestBuilder sessionKey(String sessionKey) {
        Utils.checkNotNull(sessionKey, "sessionKey");
        this.sessionKey = sessionKey;
        return this;
    }

    public StopTranscodeSessionResponse call() throws Exception {

        return sdk.stopTranscodeSession(
            sessionKey);
    }
}
