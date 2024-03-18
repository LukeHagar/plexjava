/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;
import lukehagar.plexapi.plexapi.utils.Utils;


public class ClearPlaylistContentsRequest {

    /**
     * the ID of the playlist
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=playlistID")
    private double playlistID;

    public ClearPlaylistContentsRequest(
            double playlistID) {
        Utils.checkNotNull(playlistID, "playlistID");
        this.playlistID = playlistID;
    }

    /**
     * the ID of the playlist
     */
    public double playlistID() {
        return playlistID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * the ID of the playlist
     */
    public ClearPlaylistContentsRequest withPlaylistID(double playlistID) {
        Utils.checkNotNull(playlistID, "playlistID");
        this.playlistID = playlistID;
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
        ClearPlaylistContentsRequest other = (ClearPlaylistContentsRequest) o;
        return 
            java.util.Objects.deepEquals(this.playlistID, other.playlistID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            playlistID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ClearPlaylistContentsRequest.class,
                "playlistID", playlistID);
    }
    
    public final static class Builder {
 
        private Double playlistID;  
        
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
        
        public ClearPlaylistContentsRequest build() {
            return new ClearPlaylistContentsRequest(
                playlistID);
        }
    }
}

