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

/**
 * GetMetadataChildrenResponseBody - The children of the library item.
 */

public class GetMetadataChildrenResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MediaContainer")
    private Optional<? extends GetMetadataChildrenMediaContainer> mediaContainer;

    public GetMetadataChildrenResponseBody(
            @JsonProperty("MediaContainer") Optional<? extends GetMetadataChildrenMediaContainer> mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = mediaContainer;
    }

    public Optional<? extends GetMetadataChildrenMediaContainer> mediaContainer() {
        return mediaContainer;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetMetadataChildrenResponseBody withMediaContainer(GetMetadataChildrenMediaContainer mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = Optional.ofNullable(mediaContainer);
        return this;
    }

    public GetMetadataChildrenResponseBody withMediaContainer(Optional<? extends GetMetadataChildrenMediaContainer> mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = mediaContainer;
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
        GetMetadataChildrenResponseBody other = (GetMetadataChildrenResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.mediaContainer, other.mediaContainer);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            mediaContainer);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMetadataChildrenResponseBody.class,
                "mediaContainer", mediaContainer);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetMetadataChildrenMediaContainer> mediaContainer = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder mediaContainer(GetMetadataChildrenMediaContainer mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = Optional.ofNullable(mediaContainer);
            return this;
        }

        public Builder mediaContainer(Optional<? extends GetMetadataChildrenMediaContainer> mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = mediaContainer;
            return this;
        }
        
        public GetMetadataChildrenResponseBody build() {
            return new GetMetadataChildrenResponseBody(
                mediaContainer);
        }
    }
}

