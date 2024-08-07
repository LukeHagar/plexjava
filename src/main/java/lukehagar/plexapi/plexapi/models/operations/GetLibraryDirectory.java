/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class GetLibraryDirectory {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<? extends String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<? extends String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secondary")
    private Optional<? extends Boolean> secondary;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prompt")
    private Optional<? extends String> prompt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search")
    private Optional<? extends Boolean> search;

    @JsonCreator
    public GetLibraryDirectory(
            @JsonProperty("key") Optional<? extends String> key,
            @JsonProperty("title") Optional<? extends String> title,
            @JsonProperty("secondary") Optional<? extends Boolean> secondary,
            @JsonProperty("prompt") Optional<? extends String> prompt,
            @JsonProperty("search") Optional<? extends Boolean> search) {
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(secondary, "secondary");
        Utils.checkNotNull(prompt, "prompt");
        Utils.checkNotNull(search, "search");
        this.key = key;
        this.title = title;
        this.secondary = secondary;
        this.prompt = prompt;
        this.search = search;
    }
    
    public GetLibraryDirectory() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> key() {
        return (Optional<String>) key;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> title() {
        return (Optional<String>) title;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> secondary() {
        return (Optional<Boolean>) secondary;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> prompt() {
        return (Optional<String>) prompt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> search() {
        return (Optional<Boolean>) search;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLibraryDirectory withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetLibraryDirectory withKey(Optional<? extends String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetLibraryDirectory withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public GetLibraryDirectory withTitle(Optional<? extends String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public GetLibraryDirectory withSecondary(boolean secondary) {
        Utils.checkNotNull(secondary, "secondary");
        this.secondary = Optional.ofNullable(secondary);
        return this;
    }

    public GetLibraryDirectory withSecondary(Optional<? extends Boolean> secondary) {
        Utils.checkNotNull(secondary, "secondary");
        this.secondary = secondary;
        return this;
    }

    public GetLibraryDirectory withPrompt(String prompt) {
        Utils.checkNotNull(prompt, "prompt");
        this.prompt = Optional.ofNullable(prompt);
        return this;
    }

    public GetLibraryDirectory withPrompt(Optional<? extends String> prompt) {
        Utils.checkNotNull(prompt, "prompt");
        this.prompt = prompt;
        return this;
    }

    public GetLibraryDirectory withSearch(boolean search) {
        Utils.checkNotNull(search, "search");
        this.search = Optional.ofNullable(search);
        return this;
    }

    public GetLibraryDirectory withSearch(Optional<? extends Boolean> search) {
        Utils.checkNotNull(search, "search");
        this.search = search;
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
        GetLibraryDirectory other = (GetLibraryDirectory) o;
        return 
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.title, other.title) &&
            java.util.Objects.deepEquals(this.secondary, other.secondary) &&
            java.util.Objects.deepEquals(this.prompt, other.prompt) &&
            java.util.Objects.deepEquals(this.search, other.search);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            key,
            title,
            secondary,
            prompt,
            search);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLibraryDirectory.class,
                "key", key,
                "title", title,
                "secondary", secondary,
                "prompt", prompt,
                "search", search);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> key = Optional.empty();
 
        private Optional<? extends String> title = Optional.empty();
 
        private Optional<? extends Boolean> secondary = Optional.empty();
 
        private Optional<? extends String> prompt = Optional.empty();
 
        private Optional<? extends Boolean> search = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder secondary(boolean secondary) {
            Utils.checkNotNull(secondary, "secondary");
            this.secondary = Optional.ofNullable(secondary);
            return this;
        }

        public Builder secondary(Optional<? extends Boolean> secondary) {
            Utils.checkNotNull(secondary, "secondary");
            this.secondary = secondary;
            return this;
        }

        public Builder prompt(String prompt) {
            Utils.checkNotNull(prompt, "prompt");
            this.prompt = Optional.ofNullable(prompt);
            return this;
        }

        public Builder prompt(Optional<? extends String> prompt) {
            Utils.checkNotNull(prompt, "prompt");
            this.prompt = prompt;
            return this;
        }

        public Builder search(boolean search) {
            Utils.checkNotNull(search, "search");
            this.search = Optional.ofNullable(search);
            return this;
        }

        public Builder search(Optional<? extends Boolean> search) {
            Utils.checkNotNull(search, "search");
            this.search = search;
            return this;
        }
        
        public GetLibraryDirectory build() {
            return new GetLibraryDirectory(
                key,
                title,
                secondary,
                prompt,
                search);
        }
    }
}

