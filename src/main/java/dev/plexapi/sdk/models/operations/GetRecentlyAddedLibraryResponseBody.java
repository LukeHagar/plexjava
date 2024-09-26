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
 * GetRecentlyAddedLibraryResponseBody - The recently added content
 */

public class GetRecentlyAddedLibraryResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MediaContainer")
    private Optional<? extends GetRecentlyAddedLibraryMediaContainer> mediaContainer;

    @JsonCreator
    public GetRecentlyAddedLibraryResponseBody(
            @JsonProperty("MediaContainer") Optional<? extends GetRecentlyAddedLibraryMediaContainer> mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = mediaContainer;
    }
    
    public GetRecentlyAddedLibraryResponseBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetRecentlyAddedLibraryMediaContainer> mediaContainer() {
        return (Optional<GetRecentlyAddedLibraryMediaContainer>) mediaContainer;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetRecentlyAddedLibraryResponseBody withMediaContainer(GetRecentlyAddedLibraryMediaContainer mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = Optional.ofNullable(mediaContainer);
        return this;
    }

    public GetRecentlyAddedLibraryResponseBody withMediaContainer(Optional<? extends GetRecentlyAddedLibraryMediaContainer> mediaContainer) {
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
        GetRecentlyAddedLibraryResponseBody other = (GetRecentlyAddedLibraryResponseBody) o;
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
        return Utils.toString(GetRecentlyAddedLibraryResponseBody.class,
                "mediaContainer", mediaContainer);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetRecentlyAddedLibraryMediaContainer> mediaContainer = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder mediaContainer(GetRecentlyAddedLibraryMediaContainer mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = Optional.ofNullable(mediaContainer);
            return this;
        }

        public Builder mediaContainer(Optional<? extends GetRecentlyAddedLibraryMediaContainer> mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = mediaContainer;
            return this;
        }
        
        public GetRecentlyAddedLibraryResponseBody build() {
            return new GetRecentlyAddedLibraryResponseBody(
                mediaContainer);
        }
    }
}
