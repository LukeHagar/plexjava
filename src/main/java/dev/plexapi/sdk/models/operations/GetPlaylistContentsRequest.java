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


public class GetPlaylistContentsRequest {

    /**
     * the ID of the playlist
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=playlistID")
    private double playlistID;

    /**
     * The type of media to retrieve.
     * 1 = movie
     * 2 = show
     * 3 = season
     * 4 = episode
     * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=type")
    private GetPlaylistContentsQueryParamType type;

    @JsonCreator
    public GetPlaylistContentsRequest(
            double playlistID,
            GetPlaylistContentsQueryParamType type) {
        Utils.checkNotNull(playlistID, "playlistID");
        Utils.checkNotNull(type, "type");
        this.playlistID = playlistID;
        this.type = type;
    }

    /**
     * the ID of the playlist
     */
    @JsonIgnore
    public double playlistID() {
        return playlistID;
    }

    /**
     * The type of media to retrieve.
     * 1 = movie
     * 2 = show
     * 3 = season
     * 4 = episode
     * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
     * 
     */
    @JsonIgnore
    public GetPlaylistContentsQueryParamType type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * the ID of the playlist
     */
    public GetPlaylistContentsRequest withPlaylistID(double playlistID) {
        Utils.checkNotNull(playlistID, "playlistID");
        this.playlistID = playlistID;
        return this;
    }

    /**
     * The type of media to retrieve.
     * 1 = movie
     * 2 = show
     * 3 = season
     * 4 = episode
     * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
     * 
     */
    public GetPlaylistContentsRequest withType(GetPlaylistContentsQueryParamType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        GetPlaylistContentsRequest other = (GetPlaylistContentsRequest) o;
        return 
            Objects.deepEquals(this.playlistID, other.playlistID) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            playlistID,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPlaylistContentsRequest.class,
                "playlistID", playlistID,
                "type", type);
    }
    
    public final static class Builder {
 
        private Double playlistID;
 
        private GetPlaylistContentsQueryParamType type;  
        
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
         * The type of media to retrieve.
         * 1 = movie
         * 2 = show
         * 3 = season
         * 4 = episode
         * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
         * 
         */
        public Builder type(GetPlaylistContentsQueryParamType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public GetPlaylistContentsRequest build() {
            return new GetPlaylistContentsRequest(
                playlistID,
                type);
        }
    }
}
