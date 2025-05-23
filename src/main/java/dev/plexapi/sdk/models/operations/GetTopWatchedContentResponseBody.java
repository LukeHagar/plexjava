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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * GetTopWatchedContentResponseBody
 * 
 * <p>The metadata of the library item.
 */
public class GetTopWatchedContentResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MediaContainer")
    private Optional<? extends GetTopWatchedContentMediaContainer> mediaContainer;

    @JsonCreator
    public GetTopWatchedContentResponseBody(
            @JsonProperty("MediaContainer") Optional<? extends GetTopWatchedContentMediaContainer> mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = mediaContainer;
    }
    
    public GetTopWatchedContentResponseBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetTopWatchedContentMediaContainer> mediaContainer() {
        return (Optional<GetTopWatchedContentMediaContainer>) mediaContainer;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetTopWatchedContentResponseBody withMediaContainer(GetTopWatchedContentMediaContainer mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = Optional.ofNullable(mediaContainer);
        return this;
    }

    public GetTopWatchedContentResponseBody withMediaContainer(Optional<? extends GetTopWatchedContentMediaContainer> mediaContainer) {
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
        GetTopWatchedContentResponseBody other = (GetTopWatchedContentResponseBody) o;
        return 
            Objects.deepEquals(this.mediaContainer, other.mediaContainer);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            mediaContainer);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTopWatchedContentResponseBody.class,
                "mediaContainer", mediaContainer);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetTopWatchedContentMediaContainer> mediaContainer = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder mediaContainer(GetTopWatchedContentMediaContainer mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = Optional.ofNullable(mediaContainer);
            return this;
        }

        public Builder mediaContainer(Optional<? extends GetTopWatchedContentMediaContainer> mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = mediaContainer;
            return this;
        }
        
        public GetTopWatchedContentResponseBody build() {
            return new GetTopWatchedContentResponseBody(
                mediaContainer);
        }
    }
}
