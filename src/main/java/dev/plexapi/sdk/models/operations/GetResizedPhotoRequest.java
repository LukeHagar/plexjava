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
import java.lang.Double;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class GetResizedPhotoRequest {

    /**
     * The width for the resized photo
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=width")
    private double width;

    /**
     * The height for the resized photo
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=height")
    private double height;

    /**
     * The opacity for the resized photo
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=opacity")
    private long opacity;

    /**
     * The width for the resized photo
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=blur")
    private double blur;

    /**
     * images are always scaled proportionally. A value of '1' in minSize will make the smaller native dimension the dimension resized against.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=minSize")
    private MinSize minSize;

    /**
     * allow images to be resized beyond native dimensions.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=upscale")
    private Upscale upscale;

    /**
     * path to image within Plex
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=url")
    private String url;

    @JsonCreator
    public GetResizedPhotoRequest(
            double width,
            double height,
            long opacity,
            double blur,
            MinSize minSize,
            Upscale upscale,
            String url) {
        Utils.checkNotNull(width, "width");
        Utils.checkNotNull(height, "height");
        Utils.checkNotNull(opacity, "opacity");
        Utils.checkNotNull(blur, "blur");
        Utils.checkNotNull(minSize, "minSize");
        Utils.checkNotNull(upscale, "upscale");
        Utils.checkNotNull(url, "url");
        this.width = width;
        this.height = height;
        this.opacity = opacity;
        this.blur = blur;
        this.minSize = minSize;
        this.upscale = upscale;
        this.url = url;
    }

    /**
     * The width for the resized photo
     */
    @JsonIgnore
    public double width() {
        return width;
    }

    /**
     * The height for the resized photo
     */
    @JsonIgnore
    public double height() {
        return height;
    }

    /**
     * The opacity for the resized photo
     */
    @JsonIgnore
    public long opacity() {
        return opacity;
    }

    /**
     * The width for the resized photo
     */
    @JsonIgnore
    public double blur() {
        return blur;
    }

    /**
     * images are always scaled proportionally. A value of '1' in minSize will make the smaller native dimension the dimension resized against.
     */
    @JsonIgnore
    public MinSize minSize() {
        return minSize;
    }

    /**
     * allow images to be resized beyond native dimensions.
     */
    @JsonIgnore
    public Upscale upscale() {
        return upscale;
    }

    /**
     * path to image within Plex
     */
    @JsonIgnore
    public String url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The width for the resized photo
     */
    public GetResizedPhotoRequest withWidth(double width) {
        Utils.checkNotNull(width, "width");
        this.width = width;
        return this;
    }

    /**
     * The height for the resized photo
     */
    public GetResizedPhotoRequest withHeight(double height) {
        Utils.checkNotNull(height, "height");
        this.height = height;
        return this;
    }

    /**
     * The opacity for the resized photo
     */
    public GetResizedPhotoRequest withOpacity(long opacity) {
        Utils.checkNotNull(opacity, "opacity");
        this.opacity = opacity;
        return this;
    }

    /**
     * The width for the resized photo
     */
    public GetResizedPhotoRequest withBlur(double blur) {
        Utils.checkNotNull(blur, "blur");
        this.blur = blur;
        return this;
    }

    /**
     * images are always scaled proportionally. A value of '1' in minSize will make the smaller native dimension the dimension resized against.
     */
    public GetResizedPhotoRequest withMinSize(MinSize minSize) {
        Utils.checkNotNull(minSize, "minSize");
        this.minSize = minSize;
        return this;
    }

    /**
     * allow images to be resized beyond native dimensions.
     */
    public GetResizedPhotoRequest withUpscale(Upscale upscale) {
        Utils.checkNotNull(upscale, "upscale");
        this.upscale = upscale;
        return this;
    }

    /**
     * path to image within Plex
     */
    public GetResizedPhotoRequest withUrl(String url) {
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
        GetResizedPhotoRequest other = (GetResizedPhotoRequest) o;
        return 
            Objects.deepEquals(this.width, other.width) &&
            Objects.deepEquals(this.height, other.height) &&
            Objects.deepEquals(this.opacity, other.opacity) &&
            Objects.deepEquals(this.blur, other.blur) &&
            Objects.deepEquals(this.minSize, other.minSize) &&
            Objects.deepEquals(this.upscale, other.upscale) &&
            Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            width,
            height,
            opacity,
            blur,
            minSize,
            upscale,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetResizedPhotoRequest.class,
                "width", width,
                "height", height,
                "opacity", opacity,
                "blur", blur,
                "minSize", minSize,
                "upscale", upscale,
                "url", url);
    }
    
    public final static class Builder {
 
        private Double width;
 
        private Double height;
 
        private Long opacity;
 
        private Double blur;
 
        private MinSize minSize;
 
        private Upscale upscale;
 
        private String url;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The width for the resized photo
         */
        public Builder width(double width) {
            Utils.checkNotNull(width, "width");
            this.width = width;
            return this;
        }

        /**
         * The height for the resized photo
         */
        public Builder height(double height) {
            Utils.checkNotNull(height, "height");
            this.height = height;
            return this;
        }

        /**
         * The opacity for the resized photo
         */
        public Builder opacity(long opacity) {
            Utils.checkNotNull(opacity, "opacity");
            this.opacity = opacity;
            return this;
        }

        /**
         * The width for the resized photo
         */
        public Builder blur(double blur) {
            Utils.checkNotNull(blur, "blur");
            this.blur = blur;
            return this;
        }

        /**
         * images are always scaled proportionally. A value of '1' in minSize will make the smaller native dimension the dimension resized against.
         */
        public Builder minSize(MinSize minSize) {
            Utils.checkNotNull(minSize, "minSize");
            this.minSize = minSize;
            return this;
        }

        /**
         * allow images to be resized beyond native dimensions.
         */
        public Builder upscale(Upscale upscale) {
            Utils.checkNotNull(upscale, "upscale");
            this.upscale = upscale;
            return this;
        }

        /**
         * path to image within Plex
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public GetResizedPhotoRequest build() {
            if (opacity == null) {
                opacity = _SINGLETON_VALUE_Opacity.value();
            }
            return new GetResizedPhotoRequest(
                width,
                height,
                opacity,
                blur,
                minSize,
                upscale,
                url);
        }

        private static final LazySingletonValue<Long> _SINGLETON_VALUE_Opacity =
                new LazySingletonValue<>(
                        "opacity",
                        "100",
                        new TypeReference<Long>() {});
    }
}
