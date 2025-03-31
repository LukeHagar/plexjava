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

public class GetLibraryHubsHub {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hubIdentifier")
    private Optional<String> hubIdentifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("context")
    private Optional<String> context;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<Integer> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("more")
    private Optional<Boolean> more;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("style")
    private Optional<String> style;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hubKey")
    private Optional<String> hubKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Metadata")
    private Optional<? extends List<GetLibraryHubsMetadata>> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("promoted")
    private Optional<Boolean> promoted;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("random")
    private Optional<Boolean> random;

    @JsonCreator
    public GetLibraryHubsHub(
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("hubIdentifier") Optional<String> hubIdentifier,
            @JsonProperty("context") Optional<String> context,
            @JsonProperty("size") Optional<Integer> size,
            @JsonProperty("more") Optional<Boolean> more,
            @JsonProperty("style") Optional<String> style,
            @JsonProperty("hubKey") Optional<String> hubKey,
            @JsonProperty("Metadata") Optional<? extends List<GetLibraryHubsMetadata>> metadata,
            @JsonProperty("promoted") Optional<Boolean> promoted,
            @JsonProperty("random") Optional<Boolean> random) {
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(hubIdentifier, "hubIdentifier");
        Utils.checkNotNull(context, "context");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(more, "more");
        Utils.checkNotNull(style, "style");
        Utils.checkNotNull(hubKey, "hubKey");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(promoted, "promoted");
        Utils.checkNotNull(random, "random");
        this.key = key;
        this.title = title;
        this.type = type;
        this.hubIdentifier = hubIdentifier;
        this.context = context;
        this.size = size;
        this.more = more;
        this.style = style;
        this.hubKey = hubKey;
        this.metadata = metadata;
        this.promoted = promoted;
        this.random = random;
    }
    
    public GetLibraryHubsHub() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    @JsonIgnore
    public Optional<String> hubIdentifier() {
        return hubIdentifier;
    }

    @JsonIgnore
    public Optional<String> context() {
        return context;
    }

    @JsonIgnore
    public Optional<Integer> size() {
        return size;
    }

    @JsonIgnore
    public Optional<Boolean> more() {
        return more;
    }

    @JsonIgnore
    public Optional<String> style() {
        return style;
    }

    @JsonIgnore
    public Optional<String> hubKey() {
        return hubKey;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetLibraryHubsMetadata>> metadata() {
        return (Optional<List<GetLibraryHubsMetadata>>) metadata;
    }

    @JsonIgnore
    public Optional<Boolean> promoted() {
        return promoted;
    }

    @JsonIgnore
    public Optional<Boolean> random() {
        return random;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetLibraryHubsHub withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetLibraryHubsHub withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetLibraryHubsHub withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public GetLibraryHubsHub withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public GetLibraryHubsHub withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public GetLibraryHubsHub withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetLibraryHubsHub withHubIdentifier(String hubIdentifier) {
        Utils.checkNotNull(hubIdentifier, "hubIdentifier");
        this.hubIdentifier = Optional.ofNullable(hubIdentifier);
        return this;
    }

    public GetLibraryHubsHub withHubIdentifier(Optional<String> hubIdentifier) {
        Utils.checkNotNull(hubIdentifier, "hubIdentifier");
        this.hubIdentifier = hubIdentifier;
        return this;
    }

    public GetLibraryHubsHub withContext(String context) {
        Utils.checkNotNull(context, "context");
        this.context = Optional.ofNullable(context);
        return this;
    }

    public GetLibraryHubsHub withContext(Optional<String> context) {
        Utils.checkNotNull(context, "context");
        this.context = context;
        return this;
    }

    public GetLibraryHubsHub withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetLibraryHubsHub withSize(Optional<Integer> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetLibraryHubsHub withMore(boolean more) {
        Utils.checkNotNull(more, "more");
        this.more = Optional.ofNullable(more);
        return this;
    }

    public GetLibraryHubsHub withMore(Optional<Boolean> more) {
        Utils.checkNotNull(more, "more");
        this.more = more;
        return this;
    }

    public GetLibraryHubsHub withStyle(String style) {
        Utils.checkNotNull(style, "style");
        this.style = Optional.ofNullable(style);
        return this;
    }

    public GetLibraryHubsHub withStyle(Optional<String> style) {
        Utils.checkNotNull(style, "style");
        this.style = style;
        return this;
    }

    public GetLibraryHubsHub withHubKey(String hubKey) {
        Utils.checkNotNull(hubKey, "hubKey");
        this.hubKey = Optional.ofNullable(hubKey);
        return this;
    }

    public GetLibraryHubsHub withHubKey(Optional<String> hubKey) {
        Utils.checkNotNull(hubKey, "hubKey");
        this.hubKey = hubKey;
        return this;
    }

    public GetLibraryHubsHub withMetadata(List<GetLibraryHubsMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public GetLibraryHubsHub withMetadata(Optional<? extends List<GetLibraryHubsMetadata>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public GetLibraryHubsHub withPromoted(boolean promoted) {
        Utils.checkNotNull(promoted, "promoted");
        this.promoted = Optional.ofNullable(promoted);
        return this;
    }

    public GetLibraryHubsHub withPromoted(Optional<Boolean> promoted) {
        Utils.checkNotNull(promoted, "promoted");
        this.promoted = promoted;
        return this;
    }

    public GetLibraryHubsHub withRandom(boolean random) {
        Utils.checkNotNull(random, "random");
        this.random = Optional.ofNullable(random);
        return this;
    }

    public GetLibraryHubsHub withRandom(Optional<Boolean> random) {
        Utils.checkNotNull(random, "random");
        this.random = random;
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
        GetLibraryHubsHub other = (GetLibraryHubsHub) o;
        return 
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.hubIdentifier, other.hubIdentifier) &&
            Objects.deepEquals(this.context, other.context) &&
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.more, other.more) &&
            Objects.deepEquals(this.style, other.style) &&
            Objects.deepEquals(this.hubKey, other.hubKey) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.promoted, other.promoted) &&
            Objects.deepEquals(this.random, other.random);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            key,
            title,
            type,
            hubIdentifier,
            context,
            size,
            more,
            style,
            hubKey,
            metadata,
            promoted,
            random);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLibraryHubsHub.class,
                "key", key,
                "title", title,
                "type", type,
                "hubIdentifier", hubIdentifier,
                "context", context,
                "size", size,
                "more", more,
                "style", style,
                "hubKey", hubKey,
                "metadata", metadata,
                "promoted", promoted,
                "random", random);
    }
    
    public final static class Builder {
 
        private Optional<String> key = Optional.empty();
 
        private Optional<String> title = Optional.empty();
 
        private Optional<String> type = Optional.empty();
 
        private Optional<String> hubIdentifier = Optional.empty();
 
        private Optional<String> context = Optional.empty();
 
        private Optional<Integer> size = Optional.empty();
 
        private Optional<Boolean> more = Optional.empty();
 
        private Optional<String> style = Optional.empty();
 
        private Optional<String> hubKey = Optional.empty();
 
        private Optional<? extends List<GetLibraryHubsMetadata>> metadata = Optional.empty();
 
        private Optional<Boolean> promoted = Optional.empty();
 
        private Optional<Boolean> random = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder hubIdentifier(String hubIdentifier) {
            Utils.checkNotNull(hubIdentifier, "hubIdentifier");
            this.hubIdentifier = Optional.ofNullable(hubIdentifier);
            return this;
        }

        public Builder hubIdentifier(Optional<String> hubIdentifier) {
            Utils.checkNotNull(hubIdentifier, "hubIdentifier");
            this.hubIdentifier = hubIdentifier;
            return this;
        }

        public Builder context(String context) {
            Utils.checkNotNull(context, "context");
            this.context = Optional.ofNullable(context);
            return this;
        }

        public Builder context(Optional<String> context) {
            Utils.checkNotNull(context, "context");
            this.context = context;
            return this;
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

        public Builder more(boolean more) {
            Utils.checkNotNull(more, "more");
            this.more = Optional.ofNullable(more);
            return this;
        }

        public Builder more(Optional<Boolean> more) {
            Utils.checkNotNull(more, "more");
            this.more = more;
            return this;
        }

        public Builder style(String style) {
            Utils.checkNotNull(style, "style");
            this.style = Optional.ofNullable(style);
            return this;
        }

        public Builder style(Optional<String> style) {
            Utils.checkNotNull(style, "style");
            this.style = style;
            return this;
        }

        public Builder hubKey(String hubKey) {
            Utils.checkNotNull(hubKey, "hubKey");
            this.hubKey = Optional.ofNullable(hubKey);
            return this;
        }

        public Builder hubKey(Optional<String> hubKey) {
            Utils.checkNotNull(hubKey, "hubKey");
            this.hubKey = hubKey;
            return this;
        }

        public Builder metadata(List<GetLibraryHubsMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends List<GetLibraryHubsMetadata>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder promoted(boolean promoted) {
            Utils.checkNotNull(promoted, "promoted");
            this.promoted = Optional.ofNullable(promoted);
            return this;
        }

        public Builder promoted(Optional<Boolean> promoted) {
            Utils.checkNotNull(promoted, "promoted");
            this.promoted = promoted;
            return this;
        }

        public Builder random(boolean random) {
            Utils.checkNotNull(random, "random");
            this.random = Optional.ofNullable(random);
            return this;
        }

        public Builder random(Optional<Boolean> random) {
            Utils.checkNotNull(random, "random");
            this.random = random;
            return this;
        }
        
        public GetLibraryHubsHub build() {
            return new GetLibraryHubsHub(
                key,
                title,
                type,
                hubIdentifier,
                context,
                size,
                more,
                style,
                hubKey,
                metadata,
                promoted,
                random);
        }
    }
}
