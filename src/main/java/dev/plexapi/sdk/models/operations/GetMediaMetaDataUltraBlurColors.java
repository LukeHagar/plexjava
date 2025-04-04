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

public class GetMediaMetaDataUltraBlurColors {

    /**
     * The top-left color value.
     */
    @JsonProperty("topLeft")
    private String topLeft;

    /**
     * The top-right color value.
     */
    @JsonProperty("topRight")
    private String topRight;

    /**
     * The bottom-right color value.
     */
    @JsonProperty("bottomRight")
    private String bottomRight;

    /**
     * The bottom-left color value.
     */
    @JsonProperty("bottomLeft")
    private String bottomLeft;

    @JsonCreator
    public GetMediaMetaDataUltraBlurColors(
            @JsonProperty("topLeft") String topLeft,
            @JsonProperty("topRight") String topRight,
            @JsonProperty("bottomRight") String bottomRight,
            @JsonProperty("bottomLeft") String bottomLeft) {
        Utils.checkNotNull(topLeft, "topLeft");
        Utils.checkNotNull(topRight, "topRight");
        Utils.checkNotNull(bottomRight, "bottomRight");
        Utils.checkNotNull(bottomLeft, "bottomLeft");
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomRight = bottomRight;
        this.bottomLeft = bottomLeft;
    }

    /**
     * The top-left color value.
     */
    @JsonIgnore
    public String topLeft() {
        return topLeft;
    }

    /**
     * The top-right color value.
     */
    @JsonIgnore
    public String topRight() {
        return topRight;
    }

    /**
     * The bottom-right color value.
     */
    @JsonIgnore
    public String bottomRight() {
        return bottomRight;
    }

    /**
     * The bottom-left color value.
     */
    @JsonIgnore
    public String bottomLeft() {
        return bottomLeft;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The top-left color value.
     */
    public GetMediaMetaDataUltraBlurColors withTopLeft(String topLeft) {
        Utils.checkNotNull(topLeft, "topLeft");
        this.topLeft = topLeft;
        return this;
    }

    /**
     * The top-right color value.
     */
    public GetMediaMetaDataUltraBlurColors withTopRight(String topRight) {
        Utils.checkNotNull(topRight, "topRight");
        this.topRight = topRight;
        return this;
    }

    /**
     * The bottom-right color value.
     */
    public GetMediaMetaDataUltraBlurColors withBottomRight(String bottomRight) {
        Utils.checkNotNull(bottomRight, "bottomRight");
        this.bottomRight = bottomRight;
        return this;
    }

    /**
     * The bottom-left color value.
     */
    public GetMediaMetaDataUltraBlurColors withBottomLeft(String bottomLeft) {
        Utils.checkNotNull(bottomLeft, "bottomLeft");
        this.bottomLeft = bottomLeft;
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
        GetMediaMetaDataUltraBlurColors other = (GetMediaMetaDataUltraBlurColors) o;
        return 
            Objects.deepEquals(this.topLeft, other.topLeft) &&
            Objects.deepEquals(this.topRight, other.topRight) &&
            Objects.deepEquals(this.bottomRight, other.bottomRight) &&
            Objects.deepEquals(this.bottomLeft, other.bottomLeft);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            topLeft,
            topRight,
            bottomRight,
            bottomLeft);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMediaMetaDataUltraBlurColors.class,
                "topLeft", topLeft,
                "topRight", topRight,
                "bottomRight", bottomRight,
                "bottomLeft", bottomLeft);
    }
    
    public final static class Builder {
 
        private String topLeft;
 
        private String topRight;
 
        private String bottomRight;
 
        private String bottomLeft;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The top-left color value.
         */
        public Builder topLeft(String topLeft) {
            Utils.checkNotNull(topLeft, "topLeft");
            this.topLeft = topLeft;
            return this;
        }

        /**
         * The top-right color value.
         */
        public Builder topRight(String topRight) {
            Utils.checkNotNull(topRight, "topRight");
            this.topRight = topRight;
            return this;
        }

        /**
         * The bottom-right color value.
         */
        public Builder bottomRight(String bottomRight) {
            Utils.checkNotNull(bottomRight, "bottomRight");
            this.bottomRight = bottomRight;
            return this;
        }

        /**
         * The bottom-left color value.
         */
        public Builder bottomLeft(String bottomLeft) {
            Utils.checkNotNull(bottomLeft, "bottomLeft");
            this.bottomLeft = bottomLeft;
            return this;
        }
        
        public GetMediaMetaDataUltraBlurColors build() {
            return new GetMediaMetaDataUltraBlurColors(
                topLeft,
                topRight,
                bottomRight,
                bottomLeft);
        }
    }
}
