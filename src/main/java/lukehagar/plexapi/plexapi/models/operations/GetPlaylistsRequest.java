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
import java.util.Optional;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;
import lukehagar.plexapi.plexapi.utils.Utils;


public class GetPlaylistsRequest {

    /**
     * limit to a type of playlist.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=playlistType")
    private Optional<? extends PlaylistType> playlistType;

    /**
     * type of playlists to return (default is all).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=smart")
    private Optional<? extends QueryParamSmart> smart;

    public GetPlaylistsRequest(
            Optional<? extends PlaylistType> playlistType,
            Optional<? extends QueryParamSmart> smart) {
        Utils.checkNotNull(playlistType, "playlistType");
        Utils.checkNotNull(smart, "smart");
        this.playlistType = playlistType;
        this.smart = smart;
    }

    /**
     * limit to a type of playlist.
     */
    public Optional<? extends PlaylistType> playlistType() {
        return playlistType;
    }

    /**
     * type of playlists to return (default is all).
     */
    public Optional<? extends QueryParamSmart> smart() {
        return smart;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * limit to a type of playlist.
     */
    public GetPlaylistsRequest withPlaylistType(PlaylistType playlistType) {
        Utils.checkNotNull(playlistType, "playlistType");
        this.playlistType = Optional.ofNullable(playlistType);
        return this;
    }

    /**
     * limit to a type of playlist.
     */
    public GetPlaylistsRequest withPlaylistType(Optional<? extends PlaylistType> playlistType) {
        Utils.checkNotNull(playlistType, "playlistType");
        this.playlistType = playlistType;
        return this;
    }

    /**
     * type of playlists to return (default is all).
     */
    public GetPlaylistsRequest withSmart(QueryParamSmart smart) {
        Utils.checkNotNull(smart, "smart");
        this.smart = Optional.ofNullable(smart);
        return this;
    }

    /**
     * type of playlists to return (default is all).
     */
    public GetPlaylistsRequest withSmart(Optional<? extends QueryParamSmart> smart) {
        Utils.checkNotNull(smart, "smart");
        this.smart = smart;
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
        GetPlaylistsRequest other = (GetPlaylistsRequest) o;
        return 
            java.util.Objects.deepEquals(this.playlistType, other.playlistType) &&
            java.util.Objects.deepEquals(this.smart, other.smart);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            playlistType,
            smart);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPlaylistsRequest.class,
                "playlistType", playlistType,
                "smart", smart);
    }
    
    public final static class Builder {
 
        private Optional<? extends PlaylistType> playlistType = Optional.empty();
 
        private Optional<? extends QueryParamSmart> smart = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * limit to a type of playlist.
         */
        public Builder playlistType(PlaylistType playlistType) {
            Utils.checkNotNull(playlistType, "playlistType");
            this.playlistType = Optional.ofNullable(playlistType);
            return this;
        }

        /**
         * limit to a type of playlist.
         */
        public Builder playlistType(Optional<? extends PlaylistType> playlistType) {
            Utils.checkNotNull(playlistType, "playlistType");
            this.playlistType = playlistType;
            return this;
        }

        /**
         * type of playlists to return (default is all).
         */
        public Builder smart(QueryParamSmart smart) {
            Utils.checkNotNull(smart, "smart");
            this.smart = Optional.ofNullable(smart);
            return this;
        }

        /**
         * type of playlists to return (default is all).
         */
        public Builder smart(Optional<? extends QueryParamSmart> smart) {
            Utils.checkNotNull(smart, "smart");
            this.smart = smart;
            return this;
        }
        
        public GetPlaylistsRequest build() {
            return new GetPlaylistsRequest(
                playlistType,
                smart);
        }
    }
}

