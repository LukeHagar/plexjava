/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.util.Optional;

public class ApplyUpdatesRequestBuilder {

    private Optional<? extends Tonight> tonight = Optional.empty();
    private Optional<? extends Skip> skip = Optional.empty();
    private final SDKMethodInterfaces.MethodCallApplyUpdates sdk;

    public ApplyUpdatesRequestBuilder(SDKMethodInterfaces.MethodCallApplyUpdates sdk) {
        this.sdk = sdk;
    }
                
    public ApplyUpdatesRequestBuilder tonight(Tonight tonight) {
        Utils.checkNotNull(tonight, "tonight");
        this.tonight = Optional.of(tonight);
        return this;
    }

    public ApplyUpdatesRequestBuilder tonight(Optional<? extends Tonight> tonight) {
        Utils.checkNotNull(tonight, "tonight");
        this.tonight = tonight;
        return this;
    }
                
    public ApplyUpdatesRequestBuilder skip(Skip skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = Optional.of(skip);
        return this;
    }

    public ApplyUpdatesRequestBuilder skip(Optional<? extends Skip> skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = skip;
        return this;
    }

    public ApplyUpdatesResponse call() throws Exception {

        return sdk.applyUpdates(
            tonight,
            skip);
    }
}
