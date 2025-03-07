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
 * GetPlaylistResponseBody - The playlist
 */

public class GetPlaylistResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MediaContainer")
    private Optional<? extends GetPlaylistMediaContainer> mediaContainer;

    @JsonCreator
    public GetPlaylistResponseBody(
            @JsonProperty("MediaContainer") Optional<? extends GetPlaylistMediaContainer> mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = mediaContainer;
    }
    
    public GetPlaylistResponseBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetPlaylistMediaContainer> mediaContainer() {
        return (Optional<GetPlaylistMediaContainer>) mediaContainer;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetPlaylistResponseBody withMediaContainer(GetPlaylistMediaContainer mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = Optional.ofNullable(mediaContainer);
        return this;
    }

    public GetPlaylistResponseBody withMediaContainer(Optional<? extends GetPlaylistMediaContainer> mediaContainer) {
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
        GetPlaylistResponseBody other = (GetPlaylistResponseBody) o;
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
        return Utils.toString(GetPlaylistResponseBody.class,
                "mediaContainer", mediaContainer);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetPlaylistMediaContainer> mediaContainer = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder mediaContainer(GetPlaylistMediaContainer mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = Optional.ofNullable(mediaContainer);
            return this;
        }

        public Builder mediaContainer(Optional<? extends GetPlaylistMediaContainer> mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = mediaContainer;
            return this;
        }
        
        public GetPlaylistResponseBody build() {
            return new GetPlaylistResponseBody(
                mediaContainer);
        }
    }
}

