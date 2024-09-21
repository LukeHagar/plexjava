/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.lang.String;

public class UpdatePlayProgressRequestBuilder {

    private String key;
    private Double time;
    private String state;
    private final SDKMethodInterfaces.MethodCallUpdatePlayProgress sdk;

    public UpdatePlayProgressRequestBuilder(SDKMethodInterfaces.MethodCallUpdatePlayProgress sdk) {
        this.sdk = sdk;
    }

    public UpdatePlayProgressRequestBuilder key(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public UpdatePlayProgressRequestBuilder time(double time) {
        Utils.checkNotNull(time, "time");
        this.time = time;
        return this;
    }

    public UpdatePlayProgressRequestBuilder state(String state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    public UpdatePlayProgressResponse call() throws Exception {

        return sdk.updatePlayProgress(
            key,
            time,
            state);
    }
}
