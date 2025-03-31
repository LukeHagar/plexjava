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
 * GetServerActivitiesResponseBody
 * 
 * <p>The Server Activities
 */
public class GetServerActivitiesResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MediaContainer")
    private Optional<? extends GetServerActivitiesMediaContainer> mediaContainer;

    @JsonCreator
    public GetServerActivitiesResponseBody(
            @JsonProperty("MediaContainer") Optional<? extends GetServerActivitiesMediaContainer> mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = mediaContainer;
    }
    
    public GetServerActivitiesResponseBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetServerActivitiesMediaContainer> mediaContainer() {
        return (Optional<GetServerActivitiesMediaContainer>) mediaContainer;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetServerActivitiesResponseBody withMediaContainer(GetServerActivitiesMediaContainer mediaContainer) {
        Utils.checkNotNull(mediaContainer, "mediaContainer");
        this.mediaContainer = Optional.ofNullable(mediaContainer);
        return this;
    }

    public GetServerActivitiesResponseBody withMediaContainer(Optional<? extends GetServerActivitiesMediaContainer> mediaContainer) {
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
        GetServerActivitiesResponseBody other = (GetServerActivitiesResponseBody) o;
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
        return Utils.toString(GetServerActivitiesResponseBody.class,
                "mediaContainer", mediaContainer);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetServerActivitiesMediaContainer> mediaContainer = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder mediaContainer(GetServerActivitiesMediaContainer mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = Optional.ofNullable(mediaContainer);
            return this;
        }

        public Builder mediaContainer(Optional<? extends GetServerActivitiesMediaContainer> mediaContainer) {
            Utils.checkNotNull(mediaContainer, "mediaContainer");
            this.mediaContainer = mediaContainer;
            return this;
        }
        
        public GetServerActivitiesResponseBody build() {
            return new GetServerActivitiesResponseBody(
                mediaContainer);
        }
    }
}
