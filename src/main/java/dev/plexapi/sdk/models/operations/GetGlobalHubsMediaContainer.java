/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GetGlobalHubsMediaContainer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<Integer> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowSync")
    private Optional<Boolean> allowSync;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifier")
    private Optional<String> identifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Hub")
    private Optional<? extends List<Hub>> hub;

    @JsonCreator
    public GetGlobalHubsMediaContainer(
            @JsonProperty("size") Optional<Integer> size,
            @JsonProperty("allowSync") Optional<Boolean> allowSync,
            @JsonProperty("identifier") Optional<String> identifier,
            @JsonProperty("Hub") Optional<? extends List<Hub>> hub) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(allowSync, "allowSync");
        Utils.checkNotNull(identifier, "identifier");
        Utils.checkNotNull(hub, "hub");
        this.size = size;
        this.allowSync = allowSync;
        this.identifier = identifier;
        this.hub = hub;
    }
    
    public GetGlobalHubsMediaContainer() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Integer> size() {
        return size;
    }

    @JsonIgnore
    public Optional<Boolean> allowSync() {
        return allowSync;
    }

    @JsonIgnore
    public Optional<String> identifier() {
        return identifier;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Hub>> hub() {
        return (Optional<List<Hub>>) hub;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetGlobalHubsMediaContainer withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetGlobalHubsMediaContainer withSize(Optional<Integer> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetGlobalHubsMediaContainer withAllowSync(boolean allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = Optional.ofNullable(allowSync);
        return this;
    }

    public GetGlobalHubsMediaContainer withAllowSync(Optional<Boolean> allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = allowSync;
        return this;
    }

    public GetGlobalHubsMediaContainer withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = Optional.ofNullable(identifier);
        return this;
    }

    public GetGlobalHubsMediaContainer withIdentifier(Optional<String> identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    public GetGlobalHubsMediaContainer withHub(List<Hub> hub) {
        Utils.checkNotNull(hub, "hub");
        this.hub = Optional.ofNullable(hub);
        return this;
    }

    public GetGlobalHubsMediaContainer withHub(Optional<? extends List<Hub>> hub) {
        Utils.checkNotNull(hub, "hub");
        this.hub = hub;
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
        GetGlobalHubsMediaContainer other = (GetGlobalHubsMediaContainer) o;
        return 
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.allowSync, other.allowSync) &&
            Objects.deepEquals(this.identifier, other.identifier) &&
            Objects.deepEquals(this.hub, other.hub);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            size,
            allowSync,
            identifier,
            hub);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetGlobalHubsMediaContainer.class,
                "size", size,
                "allowSync", allowSync,
                "identifier", identifier,
                "hub", hub);
    }
    
    public final static class Builder {
 
        private Optional<Integer> size = Optional.empty();
 
        private Optional<Boolean> allowSync = Optional.empty();
 
        private Optional<String> identifier = Optional.empty();
 
        private Optional<? extends List<Hub>> hub = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder size(int size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        public Builder size(Optional<Integer> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        public Builder allowSync(boolean allowSync) {
            Utils.checkNotNull(allowSync, "allowSync");
            this.allowSync = Optional.ofNullable(allowSync);
            return this;
        }

        public Builder allowSync(Optional<Boolean> allowSync) {
            Utils.checkNotNull(allowSync, "allowSync");
            this.allowSync = allowSync;
            return this;
        }

        public Builder identifier(String identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = Optional.ofNullable(identifier);
            return this;
        }

        public Builder identifier(Optional<String> identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }

        public Builder hub(List<Hub> hub) {
            Utils.checkNotNull(hub, "hub");
            this.hub = Optional.ofNullable(hub);
            return this;
        }

        public Builder hub(Optional<? extends List<Hub>> hub) {
            Utils.checkNotNull(hub, "hub");
            this.hub = hub;
            return this;
        }
        
        public GetGlobalHubsMediaContainer build() {
            return new GetGlobalHubsMediaContainer(
                size,
                allowSync,
                identifier,
                hub);
        }
    }
}

