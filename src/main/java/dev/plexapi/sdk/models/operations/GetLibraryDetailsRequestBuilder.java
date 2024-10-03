/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.utils.LazySingletonValue;
import dev.plexapi.sdk.utils.Options;
import dev.plexapi.sdk.utils.RetryConfig;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Integer;
import java.util.Optional;

public class GetLibraryDetailsRequestBuilder {

    private Optional<? extends IncludeDetails> includeDetails = Utils.readDefaultOrConstValue(
                            "includeDetails",
                            "0",
                            new TypeReference<Optional<? extends IncludeDetails>>() {});
    private Integer sectionKey;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetLibraryDetails sdk;

    public GetLibraryDetailsRequestBuilder(SDKMethodInterfaces.MethodCallGetLibraryDetails sdk) {
        this.sdk = sdk;
    }
                
    public GetLibraryDetailsRequestBuilder includeDetails(IncludeDetails includeDetails) {
        Utils.checkNotNull(includeDetails, "includeDetails");
        this.includeDetails = Optional.of(includeDetails);
        return this;
    }

    public GetLibraryDetailsRequestBuilder includeDetails(Optional<? extends IncludeDetails> includeDetails) {
        Utils.checkNotNull(includeDetails, "includeDetails");
        this.includeDetails = includeDetails;
        return this;
    }

    public GetLibraryDetailsRequestBuilder sectionKey(int sectionKey) {
        Utils.checkNotNull(sectionKey, "sectionKey");
        this.sectionKey = sectionKey;
        return this;
    }
                
    public GetLibraryDetailsRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetLibraryDetailsRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetLibraryDetailsResponse call() throws Exception {
        if (includeDetails == null) {
            includeDetails = _SINGLETON_VALUE_IncludeDetails.value();
        }        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getLibraryDetails(
            includeDetails,
            sectionKey,
            options);
    }

    private static final LazySingletonValue<Optional<? extends IncludeDetails>> _SINGLETON_VALUE_IncludeDetails =
            new LazySingletonValue<>(
                    "includeDetails",
                    "0",
                    new TypeReference<Optional<? extends IncludeDetails>>() {});
}
