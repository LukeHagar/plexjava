/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class GetAllMediaLibraryImage {

    @JsonProperty("alt")
    private String alt;

    @JsonProperty("type")
    private GetAllMediaLibraryLibraryResponseType type;

    @JsonProperty("url")
    private String url;

    @JsonCreator
    public GetAllMediaLibraryImage(
            @JsonProperty("alt") String alt,
            @JsonProperty("type") GetAllMediaLibraryLibraryResponseType type,
            @JsonProperty("url") String url) {
        Utils.checkNotNull(alt, "alt");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(url, "url");
        this.alt = alt;
        this.type = type;
        this.url = url;
    }

    @JsonIgnore
    public String alt() {
        return alt;
    }

    @JsonIgnore
    public GetAllMediaLibraryLibraryResponseType type() {
        return type;
    }

    @JsonIgnore
    public String url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetAllMediaLibraryImage withAlt(String alt) {
        Utils.checkNotNull(alt, "alt");
        this.alt = alt;
        return this;
    }

    public GetAllMediaLibraryImage withType(GetAllMediaLibraryLibraryResponseType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetAllMediaLibraryImage withUrl(String url) {
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
        GetAllMediaLibraryImage other = (GetAllMediaLibraryImage) o;
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
        return Utils.toString(GetAllMediaLibraryImage.class,
                "alt", alt,
                "type", type,
                "url", url);
    }
    
    public final static class Builder {
 
        private String alt;
 
        private GetAllMediaLibraryLibraryResponseType type;
 
        private String url;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder alt(String alt) {
            Utils.checkNotNull(alt, "alt");
            this.alt = alt;
            return this;
        }

        public Builder type(GetAllMediaLibraryLibraryResponseType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public GetAllMediaLibraryImage build() {
            return new GetAllMediaLibraryImage(
                alt,
                type,
                url);
        }
    }
}
