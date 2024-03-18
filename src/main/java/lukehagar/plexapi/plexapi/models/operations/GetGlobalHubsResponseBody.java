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
 * GetGlobalHubsResponseBody - returns global hubs
 */

public class GetGlobalHubsResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MediaContainer")
    private Optional<? extends GetGlobalHubsMediaContainer> mediaContainer;

    public GetGlobalHubsResponseBody(
            @JsonProperty("MediaContainer") Optional<? extends GetGlobalHubsMediaContainer> mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = mediaContainer;
    }

    public Optional<? extends GetGlobalHubsMediaContainer> mediaContainer() {
        return mediaContainer;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetGlobalHubsResponseBody withMediaContainer(GetGlobalHubsMediaContainer mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = Optional.ofNullable(mediaContainer);
        return this;
    }

    public GetGlobalHubsResponseBody withMediaContainer(Optional<? extends GetGlobalHubsMediaContainer> mediaContainer) {
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
        GetGlobalHubsResponseBody other = (GetGlobalHubsResponseBody) o;
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
        return Utils.toString(GetGlobalHubsResponseBody.class,
                "mediaContainer", mediaContainer);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetGlobalHubsMediaContainer> mediaContainer = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder mediaContainer(GetGlobalHubsMediaContainer mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = Optional.ofNullable(mediaContainer);
            return this;
        }

        public Builder mediaContainer(Optional<? extends GetGlobalHubsMediaContainer> mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = mediaContainer;
            return this;
        }
        
        public GetGlobalHubsResponseBody build() {
            return new GetGlobalHubsResponseBody(
                mediaContainer);
        }
    }
}

