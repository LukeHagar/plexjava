/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.utils.LazySingletonValue;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Integer;
import java.util.Optional;

public class GetLibraryDetailsRequestBuilder {

    private Integer sectionKey;
    private Optional<? extends IncludeDetails> includeDetails = Utils.readDefaultOrConstValue(
                            "includeDetails",
                            "0",
                            new TypeReference<Optional<? extends IncludeDetails>>() {});
    private final SDKMethodInterfaces.MethodCallGetLibraryDetails sdk;

    public GetLibraryDetailsRequestBuilder(SDKMethodInterfaces.MethodCallGetLibraryDetails sdk) {
        this.sdk = sdk;
    }

    public GetLibraryDetailsRequestBuilder sectionKey(int sectionKey) {
        Utils.checkNotNull(sectionKey, "sectionKey");
        this.sectionKey = sectionKey;
        return this;
    }
                
    public GetLibraryDetailsRequestBuilder includeDetails(dev.plexapi.sdk.models.operations.IncludeDetails includeDetails) {
        Utils.checkNotNull(includeDetails, "includeDetails");
        this.includeDetails = Optional.of(includeDetails);
        return this;
    }

    public GetLibraryDetailsRequestBuilder includeDetails(java.util.Optional<? extends dev.plexapi.sdk.models.operations.IncludeDetails> includeDetails) {
        Utils.checkNotNull(includeDetails, "includeDetails");
        this.includeDetails = includeDetails;
        return this;
    }

    public GetLibraryDetailsResponse call() throws Exception {
        if (includeDetails == null) {
            includeDetails = _SINGLETON_VALUE_IncludeDetails.value();
        }
        return sdk.getLibraryDetails(
            sectionKey,
            includeDetails);
    }

    private static final LazySingletonValue<Optional<? extends IncludeDetails>> _SINGLETON_VALUE_IncludeDetails =
            new LazySingletonValue<>(
                    "includeDetails",
                    "0",
                    new TypeReference<Optional<? extends IncludeDetails>>() {});
}