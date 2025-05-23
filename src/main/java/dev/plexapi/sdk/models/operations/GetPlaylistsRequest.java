/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

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

    @JsonCreator
    public GetPlaylistsRequest(
            Optional<? extends PlaylistType> playlistType,
            Optional<? extends QueryParamSmart> smart) {
        Utils.checkNotNull(playlistType, "playlistType");
        Utils.checkNotNull(smart, "smart");
        this.playlistType = playlistType;
        this.smart = smart;
    }
    
    public GetPlaylistsRequest() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * limit to a type of playlist.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PlaylistType> playlistType() {
        return (Optional<PlaylistType>) playlistType;
    }

    /**
     * type of playlists to return (default is all).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<QueryParamSmart> smart() {
        return (Optional<QueryParamSmart>) smart;
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
            Objects.deepEquals(this.playlistType, other.playlistType) &&
            Objects.deepEquals(this.smart, other.smart);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
