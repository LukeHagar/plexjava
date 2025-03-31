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
 * GetServerPreferencesResponseBody
 * 
 * <p>Server Preferences
 */
public class GetServerPreferencesResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MediaContainer")
    private Optional<? extends GetServerPreferencesMediaContainer> mediaContainer;

    @JsonCreator
    public GetServerPreferencesResponseBody(
            @JsonProperty("MediaContainer") Optional<? extends GetServerPreferencesMediaContainer> mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = mediaContainer;
    }
    
    public GetServerPreferencesResponseBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetServerPreferencesMediaContainer> mediaContainer() {
        return (Optional<GetServerPreferencesMediaContainer>) mediaContainer;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetServerPreferencesResponseBody withMediaContainer(GetServerPreferencesMediaContainer mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = Optional.ofNullable(mediaContainer);
        return this;
    }

    public GetServerPreferencesResponseBody withMediaContainer(Optional<? extends GetServerPreferencesMediaContainer> mediaContainer) {
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
        GetServerPreferencesResponseBody other = (GetServerPreferencesResponseBody) o;
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
        return Utils.toString(GetServerPreferencesResponseBody.class,
                "mediaContainer", mediaContainer);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetServerPreferencesMediaContainer> mediaContainer = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder mediaContainer(GetServerPreferencesMediaContainer mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = Optional.ofNullable(mediaContainer);
            return this;
        }

        public Builder mediaContainer(Optional<? extends GetServerPreferencesMediaContainer> mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = mediaContainer;
            return this;
        }
        
        public GetServerPreferencesResponseBody build() {
            return new GetServerPreferencesResponseBody(
                mediaContainer);
        }
    }
}
