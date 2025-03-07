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

public class GetMediaMetaDataImage {

    /**
     * Alternate text for the image.
     */
    @JsonProperty("alt")
    private String alt;

    /**
     * The type of image (e.g., coverPoster, background, clearLogo).
     */
    @JsonProperty("type")
    private String type;

    /**
     * The URL of the image.
     */
    @JsonProperty("url")
    private String url;

    @JsonCreator
    public GetMediaMetaDataImage(
            @JsonProperty("alt") String alt,
            @JsonProperty("type") String type,
            @JsonProperty("url") String url) {
        Utils.checkNotNull(alt, "alt");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(url, "url");
        this.alt = alt;
        this.type = type;
        this.url = url;
    }

    /**
     * Alternate text for the image.
     */
    @JsonIgnore
    public String alt() {
        return alt;
    }

    /**
     * The type of image (e.g., coverPoster, background, clearLogo).
     */
    @JsonIgnore
    public String type() {
        return type;
    }

    /**
     * The URL of the image.
     */
    @JsonIgnore
    public String url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Alternate text for the image.
     */
    public GetMediaMetaDataImage withAlt(String alt) {
        Utils.checkNotNull(alt, "alt");
        this.alt = alt;
        return this;
    }

    /**
     * The type of image (e.g., coverPoster, background, clearLogo).
     */
    public GetMediaMetaDataImage withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The URL of the image.
     */
    public GetMediaMetaDataImage withUrl(String url) {
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
        GetMediaMetaDataImage other = (GetMediaMetaDataImage) o;
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
        return Utils.toString(GetMediaMetaDataImage.class,
                "alt", alt,
                "type", type,
                "url", url);
    }
    
    public final static class Builder {
 
        private String alt;
 
        private String type;
 
        private String url;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Alternate text for the image.
         */
        public Builder alt(String alt) {
            Utils.checkNotNull(alt, "alt");
            this.alt = alt;
            return this;
        }

        /**
         * The type of image (e.g., coverPoster, background, clearLogo).
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The URL of the image.
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public GetMediaMetaDataImage build() {
            return new GetMediaMetaDataImage(
                alt,
                type,
                url);
        }
    }
}

