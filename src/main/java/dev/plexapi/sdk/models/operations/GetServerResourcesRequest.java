/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.utils.LazySingletonValue;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class GetServerResourcesRequest {

    /**
     * The unique identifier for the client application
     * This is used to track the client application and its usage
     * (UUID, serial number, or other number unique per device)
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=X-Plex-Client-Identifier")
    private Optional<String> xPlexClientIdentifier;

    /**
     * Plex Authentication Token
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=X-Plex-Token")
    private String xPlexToken;

    /**
     * Include Https entries in the results
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeHttps")
    private Optional<? extends IncludeHttps> includeHttps;

    /**
     * Include Relay addresses in the results 
     * E.g: https://10-0-0-25.bbf8e10c7fa20447cacee74cd9914cde.plex.direct:32400
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeRelay")
    private Optional<? extends IncludeRelay> includeRelay;

    /**
     * Include IPv6 entries in the results
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeIPv6")
    private Optional<? extends IncludeIPv6> includeIPv6;

    @JsonCreator
    public GetServerResourcesRequest(
            Optional<String> xPlexClientIdentifier,
            String xPlexToken,
            Optional<? extends IncludeHttps> includeHttps,
            Optional<? extends IncludeRelay> includeRelay,
            Optional<? extends IncludeIPv6> includeIPv6) {
        Utils.checkNotNull(xPlexClientIdentifier, "xPlexClientIdentifier");
        Utils.checkNotNull(xPlexToken, "xPlexToken");
        Utils.checkNotNull(includeHttps, "includeHttps");
        Utils.checkNotNull(includeRelay, "includeRelay");
        Utils.checkNotNull(includeIPv6, "includeIPv6");
        this.xPlexClientIdentifier = xPlexClientIdentifier;
        this.xPlexToken = xPlexToken;
        this.includeHttps = includeHttps;
        this.includeRelay = includeRelay;
        this.includeIPv6 = includeIPv6;
    }
    
    public GetServerResourcesRequest(
            String xPlexToken) {
        this(Optional.empty(), xPlexToken, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The unique identifier for the client application
     * This is used to track the client application and its usage
     * (UUID, serial number, or other number unique per device)
     * 
     */
    @JsonIgnore
    public Optional<String> xPlexClientIdentifier() {
        return xPlexClientIdentifier;
    }

    /**
     * Plex Authentication Token
     */
    @JsonIgnore
    public String xPlexToken() {
        return xPlexToken;
    }

    /**
     * Include Https entries in the results
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IncludeHttps> includeHttps() {
        return (Optional<IncludeHttps>) includeHttps;
    }

    /**
     * Include Relay addresses in the results 
     * E.g: https://10-0-0-25.bbf8e10c7fa20447cacee74cd9914cde.plex.direct:32400
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IncludeRelay> includeRelay() {
        return (Optional<IncludeRelay>) includeRelay;
    }

    /**
     * Include IPv6 entries in the results
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IncludeIPv6> includeIPv6() {
        return (Optional<IncludeIPv6>) includeIPv6;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identifier for the client application
     * This is used to track the client application and its usage
     * (UUID, serial number, or other number unique per device)
     * 
     */
    public GetServerResourcesRequest withXPlexClientIdentifier(String xPlexClientIdentifier) {
        Utils.checkNotNull(xPlexClientIdentifier, "xPlexClientIdentifier");
        this.xPlexClientIdentifier = Optional.ofNullable(xPlexClientIdentifier);
        return this;
    }

    /**
     * The unique identifier for the client application
     * This is used to track the client application and its usage
     * (UUID, serial number, or other number unique per device)
     * 
     */
    public GetServerResourcesRequest withXPlexClientIdentifier(Optional<String> xPlexClientIdentifier) {
        Utils.checkNotNull(xPlexClientIdentifier, "xPlexClientIdentifier");
        this.xPlexClientIdentifier = xPlexClientIdentifier;
        return this;
    }

    /**
     * Plex Authentication Token
     */
    public GetServerResourcesRequest withXPlexToken(String xPlexToken) {
        Utils.checkNotNull(xPlexToken, "xPlexToken");
        this.xPlexToken = xPlexToken;
        return this;
    }

    /**
     * Include Https entries in the results
     */
    public GetServerResourcesRequest withIncludeHttps(IncludeHttps includeHttps) {
        Utils.checkNotNull(includeHttps, "includeHttps");
        this.includeHttps = Optional.ofNullable(includeHttps);
        return this;
    }

    /**
     * Include Https entries in the results
     */
    public GetServerResourcesRequest withIncludeHttps(Optional<? extends IncludeHttps> includeHttps) {
        Utils.checkNotNull(includeHttps, "includeHttps");
        this.includeHttps = includeHttps;
        return this;
    }

    /**
     * Include Relay addresses in the results 
     * E.g: https://10-0-0-25.bbf8e10c7fa20447cacee74cd9914cde.plex.direct:32400
     * 
     */
    public GetServerResourcesRequest withIncludeRelay(IncludeRelay includeRelay) {
        Utils.checkNotNull(includeRelay, "includeRelay");
        this.includeRelay = Optional.ofNullable(includeRelay);
        return this;
    }

    /**
     * Include Relay addresses in the results 
     * E.g: https://10-0-0-25.bbf8e10c7fa20447cacee74cd9914cde.plex.direct:32400
     * 
     */
    public GetServerResourcesRequest withIncludeRelay(Optional<? extends IncludeRelay> includeRelay) {
        Utils.checkNotNull(includeRelay, "includeRelay");
        this.includeRelay = includeRelay;
        return this;
    }

    /**
     * Include IPv6 entries in the results
     */
    public GetServerResourcesRequest withIncludeIPv6(IncludeIPv6 includeIPv6) {
        Utils.checkNotNull(includeIPv6, "includeIPv6");
        this.includeIPv6 = Optional.ofNullable(includeIPv6);
        return this;
    }

    /**
     * Include IPv6 entries in the results
     */
    public GetServerResourcesRequest withIncludeIPv6(Optional<? extends IncludeIPv6> includeIPv6) {
        Utils.checkNotNull(includeIPv6, "includeIPv6");
        this.includeIPv6 = includeIPv6;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetServerResourcesRequest other = (GetServerResourcesRequest) o;
        return 
            Objects.deepEquals(this.xPlexClientIdentifier, other.xPlexClientIdentifier) &&
            Objects.deepEquals(this.xPlexToken, other.xPlexToken) &&
            Objects.deepEquals(this.includeHttps, other.includeHttps) &&
            Objects.deepEquals(this.includeRelay, other.includeRelay) &&
            Objects.deepEquals(this.includeIPv6, other.includeIPv6);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xPlexClientIdentifier,
            xPlexToken,
            includeHttps,
            includeRelay,
            includeIPv6);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetServerResourcesRequest.class,
                "xPlexClientIdentifier", xPlexClientIdentifier,
                "xPlexToken", xPlexToken,
                "includeHttps", includeHttps,
                "includeRelay", includeRelay,
                "includeIPv6", includeIPv6);
    }
    
    public final static class Builder {
 
        private Optional<String> xPlexClientIdentifier = Optional.empty();
 
        private String xPlexToken;
 
        private Optional<? extends IncludeHttps> includeHttps;
 
        private Optional<? extends IncludeRelay> includeRelay;
 
        private Optional<? extends IncludeIPv6> includeIPv6;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identifier for the client application
         * This is used to track the client application and its usage
         * (UUID, serial number, or other number unique per device)
         * 
         */
        public Builder xPlexClientIdentifier(String xPlexClientIdentifier) {
            Utils.checkNotNull(xPlexClientIdentifier, "xPlexClientIdentifier");
            this.xPlexClientIdentifier = Optional.ofNullable(xPlexClientIdentifier);
            return this;
        }

        /**
         * The unique identifier for the client application
         * This is used to track the client application and its usage
         * (UUID, serial number, or other number unique per device)
         * 
         */
        public Builder xPlexClientIdentifier(Optional<String> xPlexClientIdentifier) {
            Utils.checkNotNull(xPlexClientIdentifier, "xPlexClientIdentifier");
            this.xPlexClientIdentifier = xPlexClientIdentifier;
            return this;
        }

        /**
         * Plex Authentication Token
         */
        public Builder xPlexToken(String xPlexToken) {
            Utils.checkNotNull(xPlexToken, "xPlexToken");
            this.xPlexToken = xPlexToken;
            return this;
        }

        /**
         * Include Https entries in the results
         */
        public Builder includeHttps(IncludeHttps includeHttps) {
            Utils.checkNotNull(includeHttps, "includeHttps");
            this.includeHttps = Optional.ofNullable(includeHttps);
            return this;
        }

        /**
         * Include Https entries in the results
         */
        public Builder includeHttps(Optional<? extends IncludeHttps> includeHttps) {
            Utils.checkNotNull(includeHttps, "includeHttps");
            this.includeHttps = includeHttps;
            return this;
        }

        /**
         * Include Relay addresses in the results 
         * E.g: https://10-0-0-25.bbf8e10c7fa20447cacee74cd9914cde.plex.direct:32400
         * 
         */
        public Builder includeRelay(IncludeRelay includeRelay) {
            Utils.checkNotNull(includeRelay, "includeRelay");
            this.includeRelay = Optional.ofNullable(includeRelay);
            return this;
        }

        /**
         * Include Relay addresses in the results 
         * E.g: https://10-0-0-25.bbf8e10c7fa20447cacee74cd9914cde.plex.direct:32400
         * 
         */
        public Builder includeRelay(Optional<? extends IncludeRelay> includeRelay) {
            Utils.checkNotNull(includeRelay, "includeRelay");
            this.includeRelay = includeRelay;
            return this;
        }

        /**
         * Include IPv6 entries in the results
         */
        public Builder includeIPv6(IncludeIPv6 includeIPv6) {
            Utils.checkNotNull(includeIPv6, "includeIPv6");
            this.includeIPv6 = Optional.ofNullable(includeIPv6);
            return this;
        }

        /**
         * Include IPv6 entries in the results
         */
        public Builder includeIPv6(Optional<? extends IncludeIPv6> includeIPv6) {
            Utils.checkNotNull(includeIPv6, "includeIPv6");
            this.includeIPv6 = includeIPv6;
            return this;
        }
        
        public GetServerResourcesRequest build() {
            if (includeHttps == null) {
                includeHttps = _SINGLETON_VALUE_IncludeHttps.value();
            }
            if (includeRelay == null) {
                includeRelay = _SINGLETON_VALUE_IncludeRelay.value();
            }
            if (includeIPv6 == null) {
                includeIPv6 = _SINGLETON_VALUE_IncludeIPv6.value();
            }            return new GetServerResourcesRequest(
                xPlexClientIdentifier,
                xPlexToken,
                includeHttps,
                includeRelay,
                includeIPv6);
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
}

