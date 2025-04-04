/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class AddPlaylistContentsRequest {

    /**
     * the ID of the playlist
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=playlistID")
    private double playlistID;

    /**
     * the content URI for the playlist
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=uri")
    private String uri;

    /**
     * the play queue to add to a playlist
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=playQueueID")
    private Optional<Double> playQueueID;

    @JsonCreator
    public AddPlaylistContentsRequest(
            double playlistID,
            String uri,
            Optional<Double> playQueueID) {
        Utils.checkNotNull(playlistID, "playlistID");
        Utils.checkNotNull(uri, "uri");
        Utils.checkNotNull(playQueueID, "playQueueID");
        this.playlistID = playlistID;
        this.uri = uri;
        this.playQueueID = playQueueID;
    }
    
    public AddPlaylistContentsRequest(
            double playlistID,
            String uri) {
        this(playlistID, uri, Optional.empty());
    }

    /**
     * the ID of the playlist
     */
    @JsonIgnore
    public double playlistID() {
        return playlistID;
    }

    /**
     * the content URI for the playlist
     */
    @JsonIgnore
    public String uri() {
        return uri;
    }

    /**
     * the play queue to add to a playlist
     */
    @JsonIgnore
    public Optional<Double> playQueueID() {
        return playQueueID;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * the ID of the playlist
     */
    public AddPlaylistContentsRequest withPlaylistID(double playlistID) {
        Utils.checkNotNull(playlistID, "playlistID");
        this.playlistID = playlistID;
        return this;
    }

    /**
     * the content URI for the playlist
     */
    public AddPlaylistContentsRequest withUri(String uri) {
        Utils.checkNotNull(uri, "uri");
        this.uri = uri;
        return this;
    }

    /**
     * the play queue to add to a playlist
     */
    public AddPlaylistContentsRequest withPlayQueueID(double playQueueID) {
        Utils.checkNotNull(playQueueID, "playQueueID");
        this.playQueueID = Optional.ofNullable(playQueueID);
        return this;
    }

    /**
     * the play queue to add to a playlist
     */
    public AddPlaylistContentsRequest withPlayQueueID(Optional<Double> playQueueID) {
        Utils.checkNotNull(playQueueID, "playQueueID");
        this.playQueueID = playQueueID;
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
        AddPlaylistContentsRequest other = (AddPlaylistContentsRequest) o;
        return 
            Objects.deepEquals(this.playlistID, other.playlistID) &&
            Objects.deepEquals(this.uri, other.uri) &&
            Objects.deepEquals(this.playQueueID, other.playQueueID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            playlistID,
            uri,
            playQueueID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AddPlaylistContentsRequest.class,
                "playlistID", playlistID,
                "uri", uri,
                "playQueueID", playQueueID);
    }
    
    public final static class Builder {
 
        private Double playlistID;
 
        private String uri;
 
        private Optional<Double> playQueueID = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * the ID of the playlist
         */
        public Builder playlistID(double playlistID) {
            Utils.checkNotNull(playlistID, "playlistID");
            this.playlistID = playlistID;
            return this;
        }

        /**
         * the content URI for the playlist
         */
        public Builder uri(String uri) {
            Utils.checkNotNull(uri, "uri");
            this.uri = uri;
            return this;
        }

        /**
         * the play queue to add to a playlist
         */
        public Builder playQueueID(double playQueueID) {
            Utils.checkNotNull(playQueueID, "playQueueID");
            this.playQueueID = Optional.ofNullable(playQueueID);
            return this;
        }

        /**
         * the play queue to add to a playlist
         */
        public Builder playQueueID(Optional<Double> playQueueID) {
            Utils.checkNotNull(playQueueID, "playQueueID");
            this.playQueueID = playQueueID;
            return this;
        }
        
        public AddPlaylistContentsRequest build() {
            return new AddPlaylistContentsRequest(
                playlistID,
                uri,
                playQueueID);
        }
    }
}
