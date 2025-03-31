/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Float;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class MetaDataRating {

    /**
     * A URI or path to the rating image.
     */
    @JsonProperty("image")
    private String image;

    /**
     * The value of the rating.
     */
    @JsonProperty("value")
    private float value;

    /**
     * The type of rating (e.g., audience, critic).
     */
    @JsonProperty("type")
    private String type;

    @JsonCreator
    public MetaDataRating(
            @JsonProperty("image") String image,
            @JsonProperty("value") float value,
            @JsonProperty("type") String type) {
        Utils.checkNotNull(image, "image");
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(type, "type");
        this.image = image;
        this.value = value;
        this.type = type;
    }

    /**
     * A URI or path to the rating image.
     */
    @JsonIgnore
    public String image() {
        return image;
    }

    /**
     * The value of the rating.
     */
    @JsonIgnore
    public float value() {
        return value;
    }

    /**
     * The type of rating (e.g., audience, critic).
     */
    @JsonIgnore
    public String type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * A URI or path to the rating image.
     */
    public MetaDataRating withImage(String image) {
        Utils.checkNotNull(image, "image");
        this.image = image;
        return this;
    }

    /**
     * The value of the rating.
     */
    public MetaDataRating withValue(float value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    /**
     * The type of rating (e.g., audience, critic).
     */
    public MetaDataRating withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        MetaDataRating other = (MetaDataRating) o;
        return 
            Objects.deepEquals(this.image, other.image) &&
            Objects.deepEquals(this.value, other.value) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            image,
            value,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MetaDataRating.class,
                "image", image,
                "value", value,
                "type", type);
    }
    
    public final static class Builder {
 
        private String image;
 
        private Float value;
 
        private String type;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A URI or path to the rating image.
         */
        public Builder image(String image) {
            Utils.checkNotNull(image, "image");
            this.image = image;
            return this;
        }

        /**
         * The value of the rating.
         */
        public Builder value(float value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        /**
         * The type of rating (e.g., audience, critic).
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public MetaDataRating build() {
            return new MetaDataRating(
                image,
                value,
                type);
        }
    }
}
