/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.utils.LazySingletonValue;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class GetServerResourcesRequestBuilder {

    private Optional<? extends IncludeHttps> includeHttps = Utils.readDefaultOrConstValue(
                            "includeHttps",
                            "0",
                            new TypeReference<Optional<? extends IncludeHttps>>() {});
    private Optional<? extends IncludeRelay> includeRelay = Utils.readDefaultOrConstValue(
                            "includeRelay",
                            "0",
                            new TypeReference<Optional<? extends IncludeRelay>>() {});
    private Optional<? extends IncludeIPv6> includeIPv6 = Utils.readDefaultOrConstValue(
                            "includeIPv6",
                            "0",
                            new TypeReference<Optional<? extends IncludeIPv6>>() {});
    private String clientID;
    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetServerResources sdk;

    public GetServerResourcesRequestBuilder(SDKMethodInterfaces.MethodCallGetServerResources sdk) {
        this.sdk = sdk;
    }
                
    public GetServerResourcesRequestBuilder includeHttps(IncludeHttps includeHttps) {
        Utils.checkNotNull(includeHttps, "includeHttps");
        this.includeHttps = Optional.of(includeHttps);
        return this;
    }

    public GetServerResourcesRequestBuilder includeHttps(Optional<? extends IncludeHttps> includeHttps) {
        Utils.checkNotNull(includeHttps, "includeHttps");
        this.includeHttps = includeHttps;
        return this;
    }
                
    public GetServerResourcesRequestBuilder includeRelay(IncludeRelay includeRelay) {
        Utils.checkNotNull(includeRelay, "includeRelay");
        this.includeRelay = Optional.of(includeRelay);
        return this;
    }

    public GetServerResourcesRequestBuilder includeRelay(Optional<? extends IncludeRelay> includeRelay) {
        Utils.checkNotNull(includeRelay, "includeRelay");
        this.includeRelay = includeRelay;
        return this;
    }
                
    public GetServerResourcesRequestBuilder includeIPv6(IncludeIPv6 includeIPv6) {
        Utils.checkNotNull(includeIPv6, "includeIPv6");
        this.includeIPv6 = Optional.of(includeIPv6);
        return this;
    }

    public GetServerResourcesRequestBuilder includeIPv6(Optional<? extends IncludeIPv6> includeIPv6) {
        Utils.checkNotNull(includeIPv6, "includeIPv6");
        this.includeIPv6 = includeIPv6;
        return this;
    }

    public GetServerResourcesRequestBuilder clientID(String clientID) {
        Utils.checkNotNull(clientID, "clientID");
        this.clientID = clientID;
        return this;
    }
                
    public GetServerResourcesRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public GetServerResourcesRequestBuilder serverURL(Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public GetServerResourcesResponse call() throws Exception {
        if (includeHttps == null) {
            includeHttps = _SINGLETON_VALUE_IncludeHttps.value();
        }
        if (includeRelay == null) {
            includeRelay = _SINGLETON_VALUE_IncludeRelay.value();
        }
        if (includeIPv6 == null) {
            includeIPv6 = _SINGLETON_VALUE_IncludeIPv6.value();
        }
        return sdk.getServerResources(
            includeHttps,
            includeRelay,
            includeIPv6,
            clientID,
            serverURL);
    }

    private static final LazySingletonValue<Optional<? extends IncludeHttps>> _SINGLETON_VALUE_IncludeHttps =
            new LazySingletonValue<>(
                    "includeHttps",
                    "0",
                    new TypeReference<Optional<? extends IncludeHttps>>() {});

    private static final LazySingletonValue<Optional<? extends IncludeRelay>> _SINGLETON_VALUE_IncludeRelay =
            new LazySingletonValue<>(
                    "includeRelay",
                    "0",
                    new TypeReference<Optional<? extends IncludeRelay>>() {});

    private static final LazySingletonValue<Optional<? extends IncludeIPv6>> _SINGLETON_VALUE_IncludeIPv6 =
            new LazySingletonValue<>(
                    "includeIPv6",
                    "0",
                    new TypeReference<Optional<? extends IncludeIPv6>>() {});
}
