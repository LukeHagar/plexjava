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

public class GetLibraryItemsUltraBlurColors {

    @JsonProperty("topLeft")
    private String topLeft;

    @JsonProperty("topRight")
    private String topRight;

    @JsonProperty("bottomRight")
    private String bottomRight;

    @JsonProperty("bottomLeft")
    private String bottomLeft;

    @JsonCreator
    public GetLibraryItemsUltraBlurColors(
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

    @JsonIgnore
    public String topLeft() {
        return topLeft;
    }

    @JsonIgnore
    public String topRight() {
        return topRight;
    }

    @JsonIgnore
    public String bottomRight() {
        return bottomRight;
    }

    @JsonIgnore
    public String bottomLeft() {
        return bottomLeft;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLibraryItemsUltraBlurColors withTopLeft(String topLeft) {
        Utils.checkNotNull(topLeft, "topLeft");
        this.topLeft = topLeft;
        return this;
    }

    public GetLibraryItemsUltraBlurColors withTopRight(String topRight) {
        Utils.checkNotNull(topRight, "topRight");
        this.topRight = topRight;
        return this;
    }

    public GetLibraryItemsUltraBlurColors withBottomRight(String bottomRight) {
        Utils.checkNotNull(bottomRight, "bottomRight");
        this.bottomRight = bottomRight;
        return this;
    }

    public GetLibraryItemsUltraBlurColors withBottomLeft(String bottomLeft) {
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
        GetLibraryItemsUltraBlurColors other = (GetLibraryItemsUltraBlurColors) o;
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
        return Utils.toString(GetLibraryItemsUltraBlurColors.class,
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

        public Builder topLeft(String topLeft) {
            Utils.checkNotNull(topLeft, "topLeft");
            this.topLeft = topLeft;
            return this;
        }

        public Builder topRight(String topRight) {
            Utils.checkNotNull(topRight, "topRight");
            this.topRight = topRight;
            return this;
        }

        public Builder bottomRight(String bottomRight) {
            Utils.checkNotNull(bottomRight, "bottomRight");
            this.bottomRight = bottomRight;
            return this;
        }

        public Builder bottomLeft(String bottomLeft) {
            Utils.checkNotNull(bottomLeft, "bottomLeft");
            this.bottomLeft = bottomLeft;
            return this;
        }
        
        public GetLibraryItemsUltraBlurColors build() {
            return new GetLibraryItemsUltraBlurColors(
                topLeft,
                topRight,
                bottomRight,
                bottomLeft);
        }
    }
}

