/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import lukehagar.plexapi.plexapi.utils.Utils;


public class GetLibrariesDirectory {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowSync")
    private Optional<? extends Boolean> allowSync;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("art")
    private Optional<? extends String> art;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("composite")
    private Optional<? extends String> composite;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filters")
    private Optional<? extends Boolean> filters;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refreshing")
    private Optional<? extends Boolean> refreshing;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    private Optional<? extends String> thumb;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<? extends String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<? extends String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("agent")
    private Optional<? extends String> agent;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scanner")
    private Optional<? extends String> scanner;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language")
    private Optional<? extends String> language;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uuid")
    private Optional<? extends String> uuid;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updatedAt")
    private Optional<? extends Integer> updatedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("createdAt")
    private Optional<? extends Integer> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scannedAt")
    private Optional<? extends Integer> scannedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content")
    private Optional<? extends Boolean> content;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("directory")
    private Optional<? extends Boolean> directory;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contentChangedAt")
    private Optional<? extends Integer> contentChangedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    private Optional<? extends Integer> hidden;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Location")
    private Optional<? extends java.util.List<GetLibrariesLocation>> location;

    public GetLibrariesDirectory(
            @JsonProperty("allowSync") Optional<? extends Boolean> allowSync,
            @JsonProperty("art") Optional<? extends String> art,
            @JsonProperty("composite") Optional<? extends String> composite,
            @JsonProperty("filters") Optional<? extends Boolean> filters,
            @JsonProperty("refreshing") Optional<? extends Boolean> refreshing,
            @JsonProperty("thumb") Optional<? extends String> thumb,
            @JsonProperty("key") Optional<? extends String> key,
            @JsonProperty("type") Optional<? extends String> type,
            @JsonProperty("title") Optional<? extends String> title,
            @JsonProperty("agent") Optional<? extends String> agent,
            @JsonProperty("scanner") Optional<? extends String> scanner,
            @JsonProperty("language") Optional<? extends String> language,
            @JsonProperty("uuid") Optional<? extends String> uuid,
            @JsonProperty("updatedAt") Optional<? extends Integer> updatedAt,
            @JsonProperty("createdAt") Optional<? extends Integer> createdAt,
            @JsonProperty("scannedAt") Optional<? extends Integer> scannedAt,
            @JsonProperty("content") Optional<? extends Boolean> content,
            @JsonProperty("directory") Optional<? extends Boolean> directory,
            @JsonProperty("contentChangedAt") Optional<? extends Integer> contentChangedAt,
            @JsonProperty("hidden") Optional<? extends Integer> hidden,
            @JsonProperty("Location") Optional<? extends java.util.List<GetLibrariesLocation>> location) {
        Utils.checkNotNull(allowSync, "allowSync");
        Utils.checkNotNull(art, "art");
        Utils.checkNotNull(composite, "composite");
        Utils.checkNotNull(filters, "filters");
        Utils.checkNotNull(refreshing, "refreshing");
        Utils.checkNotNull(thumb, "thumb");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(agent, "agent");
        Utils.checkNotNull(scanner, "scanner");
        Utils.checkNotNull(language, "language");
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(scannedAt, "scannedAt");
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(directory, "directory");
        Utils.checkNotNull(contentChangedAt, "contentChangedAt");
        Utils.checkNotNull(hidden, "hidden");
        Utils.checkNotNull(location, "location");
        this.allowSync = allowSync;
        this.art = art;
        this.composite = composite;
        this.filters = filters;
        this.refreshing = refreshing;
        this.thumb = thumb;
        this.key = key;
        this.type = type;
        this.title = title;
        this.agent = agent;
        this.scanner = scanner;
        this.language = language;
        this.uuid = uuid;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.scannedAt = scannedAt;
        this.content = content;
        this.directory = directory;
        this.contentChangedAt = contentChangedAt;
        this.hidden = hidden;
        this.location = location;
    }

    public Optional<? extends Boolean> allowSync() {
        return allowSync;
    }

    public Optional<? extends String> art() {
        return art;
    }

    public Optional<? extends String> composite() {
        return composite;
    }

    public Optional<? extends Boolean> filters() {
        return filters;
    }

    public Optional<? extends Boolean> refreshing() {
        return refreshing;
    }

    public Optional<? extends String> thumb() {
        return thumb;
    }

    public Optional<? extends String> key() {
        return key;
    }

    public Optional<? extends String> type() {
        return type;
    }

    public Optional<? extends String> title() {
        return title;
    }

    public Optional<? extends String> agent() {
        return agent;
    }

    public Optional<? extends String> scanner() {
        return scanner;
    }

    public Optional<? extends String> language() {
        return language;
    }

    public Optional<? extends String> uuid() {
        return uuid;
    }

    public Optional<? extends Integer> updatedAt() {
        return updatedAt;
    }

    public Optional<? extends Integer> createdAt() {
        return createdAt;
    }

    public Optional<? extends Integer> scannedAt() {
        return scannedAt;
    }

    public Optional<? extends Boolean> content() {
        return content;
    }

    public Optional<? extends Boolean> directory() {
        return directory;
    }

    public Optional<? extends Integer> contentChangedAt() {
        return contentChangedAt;
    }

    public Optional<? extends Integer> hidden() {
        return hidden;
    }

    public Optional<? extends java.util.List<GetLibrariesLocation>> location() {
        return location;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLibrariesDirectory withAllowSync(boolean allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = Optional.ofNullable(allowSync);
        return this;
    }

    public GetLibrariesDirectory withAllowSync(Optional<? extends Boolean> allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = allowSync;
        return this;
    }

    public GetLibrariesDirectory withArt(String art) {
        Utils.checkNotNull(art, "art");
        this.art = Optional.ofNullable(art);
        return this;
    }

    public GetLibrariesDirectory withArt(Optional<? extends String> art) {
        Utils.checkNotNull(art, "art");
        this.art = art;
        return this;
    }

    public GetLibrariesDirectory withComposite(String composite) {
        Utils.checkNotNull(composite, "composite");
        this.composite = Optional.ofNullable(composite);
        return this;
    }

    public GetLibrariesDirectory withComposite(Optional<? extends String> composite) {
        Utils.checkNotNull(composite, "composite");
        this.composite = composite;
        return this;
    }

    public GetLibrariesDirectory withFilters(boolean filters) {
        Utils.checkNotNull(filters, "filters");
        this.filters = Optional.ofNullable(filters);
        return this;
    }

    public GetLibrariesDirectory withFilters(Optional<? extends Boolean> filters) {
        Utils.checkNotNull(filters, "filters");
        this.filters = filters;
        return this;
    }

    public GetLibrariesDirectory withRefreshing(boolean refreshing) {
        Utils.checkNotNull(refreshing, "refreshing");
        this.refreshing = Optional.ofNullable(refreshing);
        return this;
    }

    public GetLibrariesDirectory withRefreshing(Optional<? extends Boolean> refreshing) {
        Utils.checkNotNull(refreshing, "refreshing");
        this.refreshing = refreshing;
        return this;
    }

    public GetLibrariesDirectory withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = Optional.ofNullable(thumb);
        return this;
    }

    public GetLibrariesDirectory withThumb(Optional<? extends String> thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = thumb;
        return this;
    }

    public GetLibrariesDirectory withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetLibrariesDirectory withKey(Optional<? extends String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetLibrariesDirectory withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public GetLibrariesDirectory withType(Optional<? extends String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetLibrariesDirectory withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public GetLibrariesDirectory withTitle(Optional<? extends String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public GetLibrariesDirectory withAgent(String agent) {
        Utils.checkNotNull(agent, "agent");
        this.agent = Optional.ofNullable(agent);
        return this;
    }

    public GetLibrariesDirectory withAgent(Optional<? extends String> agent) {
        Utils.checkNotNull(agent, "agent");
        this.agent = agent;
        return this;
    }

    public GetLibrariesDirectory withScanner(String scanner) {
        Utils.checkNotNull(scanner, "scanner");
        this.scanner = Optional.ofNullable(scanner);
        return this;
    }

    public GetLibrariesDirectory withScanner(Optional<? extends String> scanner) {
        Utils.checkNotNull(scanner, "scanner");
        this.scanner = scanner;
        return this;
    }

    public GetLibrariesDirectory withLanguage(String language) {
        Utils.checkNotNull(language, "language");
        this.language = Optional.ofNullable(language);
        return this;
    }

    public GetLibrariesDirectory withLanguage(Optional<? extends String> language) {
        Utils.checkNotNull(language, "language");
        this.language = language;
        return this;
    }

    public GetLibrariesDirectory withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = Optional.ofNullable(uuid);
        return this;
    }

    public GetLibrariesDirectory withUuid(Optional<? extends String> uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    public GetLibrariesDirectory withUpdatedAt(int updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public GetLibrariesDirectory withUpdatedAt(Optional<? extends Integer> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public GetLibrariesDirectory withCreatedAt(int createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public GetLibrariesDirectory withCreatedAt(Optional<? extends Integer> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public GetLibrariesDirectory withScannedAt(int scannedAt) {
        Utils.checkNotNull(scannedAt, "scannedAt");
        this.scannedAt = Optional.ofNullable(scannedAt);
        return this;
    }

    public GetLibrariesDirectory withScannedAt(Optional<? extends Integer> scannedAt) {
        Utils.checkNotNull(scannedAt, "scannedAt");
        this.scannedAt = scannedAt;
        return this;
    }

    public GetLibrariesDirectory withContent(boolean content) {
        Utils.checkNotNull(content, "content");
        this.content = Optional.ofNullable(content);
        return this;
    }

    public GetLibrariesDirectory withContent(Optional<? extends Boolean> content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    public GetLibrariesDirectory withDirectory(boolean directory) {
        Utils.checkNotNull(directory, "directory");
        this.directory = Optional.ofNullable(directory);
        return this;
    }

    public GetLibrariesDirectory withDirectory(Optional<? extends Boolean> directory) {
        Utils.checkNotNull(directory, "directory");
        this.directory = directory;
        return this;
    }

    public GetLibrariesDirectory withContentChangedAt(int contentChangedAt) {
        Utils.checkNotNull(contentChangedAt, "contentChangedAt");
        this.contentChangedAt = Optional.ofNullable(contentChangedAt);
        return this;
    }

    public GetLibrariesDirectory withContentChangedAt(Optional<? extends Integer> contentChangedAt) {
        Utils.checkNotNull(contentChangedAt, "contentChangedAt");
        this.contentChangedAt = contentChangedAt;
        return this;
    }

    public GetLibrariesDirectory withHidden(int hidden) {
        Utils.checkNotNull(hidden, "hidden");
        this.hidden = Optional.ofNullable(hidden);
        return this;
    }

    public GetLibrariesDirectory withHidden(Optional<? extends Integer> hidden) {
        Utils.checkNotNull(hidden, "hidden");
        this.hidden = hidden;
        return this;
    }

    public GetLibrariesDirectory withLocation(java.util.List<GetLibrariesLocation> location) {
        Utils.checkNotNull(location, "location");
        this.location = Optional.ofNullable(location);
        return this;
    }

    public GetLibrariesDirectory withLocation(Optional<? extends java.util.List<GetLibrariesLocation>> location) {
        Utils.checkNotNull(location, "location");
        this.location = location;
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
        GetLibrariesDirectory other = (GetLibrariesDirectory) o;
        return 
            java.util.Objects.deepEquals(this.allowSync, other.allowSync) &&
            java.util.Objects.deepEquals(this.art, other.art) &&
            java.util.Objects.deepEquals(this.composite, other.composite) &&
            java.util.Objects.deepEquals(this.filters, other.filters) &&
            java.util.Objects.deepEquals(this.refreshing, other.refreshing) &&
            java.util.Objects.deepEquals(this.thumb, other.thumb) &&
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.title, other.title) &&
            java.util.Objects.deepEquals(this.agent, other.agent) &&
            java.util.Objects.deepEquals(this.scanner, other.scanner) &&
            java.util.Objects.deepEquals(this.language, other.language) &&
            java.util.Objects.deepEquals(this.uuid, other.uuid) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.scannedAt, other.scannedAt) &&
            java.util.Objects.deepEquals(this.content, other.content) &&
            java.util.Objects.deepEquals(this.directory, other.directory) &&
            java.util.Objects.deepEquals(this.contentChangedAt, other.contentChangedAt) &&
            java.util.Objects.deepEquals(this.hidden, other.hidden) &&
            java.util.Objects.deepEquals(this.location, other.location);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            allowSync,
            art,
            composite,
            filters,
            refreshing,
            thumb,
            key,
            type,
            title,
            agent,
            scanner,
            language,
            uuid,
            updatedAt,
            createdAt,
            scannedAt,
            content,
            directory,
            contentChangedAt,
            hidden,
            location);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLibrariesDirectory.class,
                "allowSync", allowSync,
                "art", art,
                "composite", composite,
                "filters", filters,
                "refreshing", refreshing,
                "thumb", thumb,
                "key", key,
                "type", type,
                "title", title,
                "agent", agent,
                "scanner", scanner,
                "language", language,
                "uuid", uuid,
                "updatedAt", updatedAt,
                "createdAt", createdAt,
                "scannedAt", scannedAt,
                "content", content,
                "directory", directory,
                "contentChangedAt", contentChangedAt,
                "hidden", hidden,
                "location", location);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> allowSync = Optional.empty();
 
        private Optional<? extends String> art = Optional.empty();
 
        private Optional<? extends String> composite = Optional.empty();
 
        private Optional<? extends Boolean> filters = Optional.empty();
 
        private Optional<? extends Boolean> refreshing = Optional.empty();
 
        private Optional<? extends String> thumb = Optional.empty();
 
        private Optional<? extends String> key = Optional.empty();
 
        private Optional<? extends String> type = Optional.empty();
 
        private Optional<? extends String> title = Optional.empty();
 
        private Optional<? extends String> agent = Optional.empty();
 
        private Optional<? extends String> scanner = Optional.empty();
 
        private Optional<? extends String> language = Optional.empty();
 
        private Optional<? extends String> uuid = Optional.empty();
 
        private Optional<? extends Integer> updatedAt = Optional.empty();
 
        private Optional<? extends Integer> createdAt = Optional.empty();
 
        private Optional<? extends Integer> scannedAt = Optional.empty();
 
        private Optional<? extends Boolean> content = Optional.empty();
 
        private Optional<? extends Boolean> directory = Optional.empty();
 
        private Optional<? extends Integer> contentChangedAt = Optional.empty();
 
        private Optional<? extends Integer> hidden = Optional.empty();
 
        private Optional<? extends java.util.List<GetLibrariesLocation>> location = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder allowSync(boolean allowSync) {
            Utils.checkNotNull(allowSync, "allowSync");
            this.allowSync = Optional.ofNullable(allowSync);
            return this;
        }

        public Builder allowSync(Optional<? extends Boolean> allowSync) {
            Utils.checkNotNull(allowSync, "allowSync");
            this.allowSync = allowSync;
            return this;
        }

        public Builder art(String art) {
            Utils.checkNotNull(art, "art");
            this.art = Optional.ofNullable(art);
            return this;
        }

        public Builder art(Optional<? extends String> art) {
            Utils.checkNotNull(art, "art");
            this.art = art;
            return this;
        }

        public Builder composite(String composite) {
            Utils.checkNotNull(composite, "composite");
            this.composite = Optional.ofNullable(composite);
            return this;
        }

        public Builder composite(Optional<? extends String> composite) {
            Utils.checkNotNull(composite, "composite");
            this.composite = composite;
            return this;
        }

        public Builder filters(boolean filters) {
            Utils.checkNotNull(filters, "filters");
            this.filters = Optional.ofNullable(filters);
            return this;
        }

        public Builder filters(Optional<? extends Boolean> filters) {
            Utils.checkNotNull(filters, "filters");
            this.filters = filters;
            return this;
        }

        public Builder refreshing(boolean refreshing) {
            Utils.checkNotNull(refreshing, "refreshing");
            this.refreshing = Optional.ofNullable(refreshing);
            return this;
        }

        public Builder refreshing(Optional<? extends Boolean> refreshing) {
            Utils.checkNotNull(refreshing, "refreshing");
            this.refreshing = refreshing;
            return this;
        }

        public Builder thumb(String thumb) {
            Utils.checkNotNull(thumb, "thumb");
            this.thumb = Optional.ofNullable(thumb);
            return this;
        }

        public Builder thumb(Optional<? extends String> thumb) {
            Utils.checkNotNull(thumb, "thumb");
            this.thumb = thumb;
            return this;
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<? extends String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<? extends String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder agent(String agent) {
            Utils.checkNotNull(agent, "agent");
            this.agent = Optional.ofNullable(agent);
            return this;
        }

        public Builder agent(Optional<? extends String> agent) {
            Utils.checkNotNull(agent, "agent");
            this.agent = agent;
            return this;
        }

        public Builder scanner(String scanner) {
            Utils.checkNotNull(scanner, "scanner");
            this.scanner = Optional.ofNullable(scanner);
            return this;
        }

        public Builder scanner(Optional<? extends String> scanner) {
            Utils.checkNotNull(scanner, "scanner");
            this.scanner = scanner;
            return this;
        }

        public Builder language(String language) {
            Utils.checkNotNull(language, "language");
            this.language = Optional.ofNullable(language);
            return this;
        }

        public Builder language(Optional<? extends String> language) {
            Utils.checkNotNull(language, "language");
            this.language = language;
            return this;
        }

        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = Optional.ofNullable(uuid);
            return this;
        }

        public Builder uuid(Optional<? extends String> uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        public Builder updatedAt(int updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        public Builder updatedAt(Optional<? extends Integer> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder createdAt(int createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<? extends Integer> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder scannedAt(int scannedAt) {
            Utils.checkNotNull(scannedAt, "scannedAt");
            this.scannedAt = Optional.ofNullable(scannedAt);
            return this;
        }

        public Builder scannedAt(Optional<? extends Integer> scannedAt) {
            Utils.checkNotNull(scannedAt, "scannedAt");
            this.scannedAt = scannedAt;
            return this;
        }

        public Builder content(boolean content) {
            Utils.checkNotNull(content, "content");
            this.content = Optional.ofNullable(content);
            return this;
        }

        public Builder content(Optional<? extends Boolean> content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        public Builder directory(boolean directory) {
            Utils.checkNotNull(directory, "directory");
            this.directory = Optional.ofNullable(directory);
            return this;
        }

        public Builder directory(Optional<? extends Boolean> directory) {
            Utils.checkNotNull(directory, "directory");
            this.directory = directory;
            return this;
        }

        public Builder contentChangedAt(int contentChangedAt) {
            Utils.checkNotNull(contentChangedAt, "contentChangedAt");
            this.contentChangedAt = Optional.ofNullable(contentChangedAt);
            return this;
        }

        public Builder contentChangedAt(Optional<? extends Integer> contentChangedAt) {
            Utils.checkNotNull(contentChangedAt, "contentChangedAt");
            this.contentChangedAt = contentChangedAt;
            return this;
        }

        public Builder hidden(int hidden) {
            Utils.checkNotNull(hidden, "hidden");
            this.hidden = Optional.ofNullable(hidden);
            return this;
        }

        public Builder hidden(Optional<? extends Integer> hidden) {
            Utils.checkNotNull(hidden, "hidden");
            this.hidden = hidden;
            return this;
        }

        public Builder location(java.util.List<GetLibrariesLocation> location) {
            Utils.checkNotNull(location, "location");
            this.location = Optional.ofNullable(location);
            return this;
        }

        public Builder location(Optional<? extends java.util.List<GetLibrariesLocation>> location) {
            Utils.checkNotNull(location, "location");
            this.location = location;
            return this;
        }
        
        public GetLibrariesDirectory build() {
            return new GetLibrariesDirectory(
                allowSync,
                art,
                composite,
                filters,
                refreshing,
                thumb,
                key,
                type,
                title,
                agent,
                scanner,
                language,
                uuid,
                updatedAt,
                createdAt,
                scannedAt,
                content,
                directory,
                contentChangedAt,
                hidden,
                location);
        }
    }
}

