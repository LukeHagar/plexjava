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
 * GetMediaPostersResponseBody
 * 
 * <p>The available posters for the library item.
 */
public class GetMediaPostersResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MediaContainer")
    private Optional<? extends GetMediaPostersMediaContainer> mediaContainer;

    @JsonCreator
    public GetMediaPostersResponseBody(
            @JsonProperty("MediaContainer") Optional<? extends GetMediaPostersMediaContainer> mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = mediaContainer;
    }
    
    public GetMediaPostersResponseBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetMediaPostersMediaContainer> mediaContainer() {
        return (Optional<GetMediaPostersMediaContainer>) mediaContainer;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetMediaPostersResponseBody withMediaContainer(GetMediaPostersMediaContainer mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = Optional.ofNullable(mediaContainer);
        return this;
    }

    public GetMediaPostersResponseBody withMediaContainer(Optional<? extends GetMediaPostersMediaContainer> mediaContainer) {
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
        GetMediaPostersResponseBody other = (GetMediaPostersResponseBody) o;
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
        return Utils.toString(GetMediaPostersResponseBody.class,
                "mediaContainer", mediaContainer);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetMediaPostersMediaContainer> mediaContainer = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder mediaContainer(GetMediaPostersMediaContainer mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = Optional.ofNullable(mediaContainer);
            return this;
        }

        public Builder mediaContainer(Optional<? extends GetMediaPostersMediaContainer> mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = mediaContainer;
            return this;
        }
        
        public GetMediaPostersResponseBody build() {
            return new GetMediaPostersResponseBody(
                mediaContainer);
        }
    }
}
