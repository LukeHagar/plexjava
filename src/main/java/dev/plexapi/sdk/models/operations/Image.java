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
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class Image {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("alt")
    private Optional<String> alt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private Optional<String> url;

    @JsonCreator
    public Image(
            @JsonProperty("alt") Optional<String> alt,
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("url") Optional<String> url) {
        Utils.checkNotNull(alt, "alt");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(url, "url");
        this.alt = alt;
        this.type = type;
        this.url = url;
    }
    
    public Image() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> alt() {
        return alt;
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    @JsonIgnore
    public Optional<String> url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public Image withAlt(String alt) {
        Utils.checkNotNull(alt, "alt");
        this.alt = Optional.ofNullable(alt);
        return this;
    }

    public Image withAlt(Optional<String> alt) {
        Utils.checkNotNull(alt, "alt");
        this.alt = alt;
        return this;
    }

    public Image withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public Image withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public Image withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = Optional.ofNullable(url);
        return this;
    }

    public Image withUrl(Optional<String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        Image other = (Image) o;
        return 
            Objects.deepEquals(this.alt, other.alt) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            alt,
            type,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Image.class,
                "alt", alt,
                "type", type,
                "url", url);
    }
    
    public final static class Builder {
 
        private Optional<String> alt = Optional.empty();
 
        private Optional<String> type = Optional.empty();
 
        private Optional<String> url = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder alt(String alt) {
            Utils.checkNotNull(alt, "alt");
            this.alt = Optional.ofNullable(alt);
            return this;
        }

        public Builder alt(Optional<String> alt) {
            Utils.checkNotNull(alt, "alt");
            this.alt = alt;
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

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = Optional.ofNullable(url);
            return this;
        }

        public Builder url(Optional<String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public Image build() {
            return new Image(
                alt,
                type,
                url);
        }
    }
}
