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
 * GetUpdateStatusResponseBody
 * 
 * <p>The Server Updates
 */
public class GetUpdateStatusResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MediaContainer")
    private Optional<? extends GetUpdateStatusMediaContainer> mediaContainer;

    @JsonCreator
    public GetUpdateStatusResponseBody(
            @JsonProperty("MediaContainer") Optional<? extends GetUpdateStatusMediaContainer> mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = mediaContainer;
    }
    
    public GetUpdateStatusResponseBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetUpdateStatusMediaContainer> mediaContainer() {
        return (Optional<GetUpdateStatusMediaContainer>) mediaContainer;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetUpdateStatusResponseBody withMediaContainer(GetUpdateStatusMediaContainer mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = Optional.ofNullable(mediaContainer);
        return this;
    }

    public GetUpdateStatusResponseBody withMediaContainer(Optional<? extends GetUpdateStatusMediaContainer> mediaContainer) {
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
        GetUpdateStatusResponseBody other = (GetUpdateStatusResponseBody) o;
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
        return Utils.toString(GetUpdateStatusResponseBody.class,
                "mediaContainer", mediaContainer);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetUpdateStatusMediaContainer> mediaContainer = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder mediaContainer(GetUpdateStatusMediaContainer mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = Optional.ofNullable(mediaContainer);
            return this;
        }

        public Builder mediaContainer(Optional<? extends GetUpdateStatusMediaContainer> mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = mediaContainer;
            return this;
        }
        
        public GetUpdateStatusResponseBody build() {
            return new GetUpdateStatusResponseBody(
                mediaContainer);
        }
    }
}
