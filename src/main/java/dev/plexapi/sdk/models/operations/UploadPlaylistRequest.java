/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.utils.LazySingletonValue;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class UploadPlaylistRequest {

    /**
     * absolute path to a directory on the server where m3u files are stored, or the absolute path to a playlist file on the server.
     * If the `path` argument is a directory, that path will be scanned for playlist files to be processed.
     * Each file in that directory creates a separate playlist, with a name based on the filename of the file that created it.
     * The GUID of each playlist is based on the filename.
     * If the `path` argument is a file, that file will be used to create a new playlist, with the name based on the filename of the file that created it.
     * The GUID of each playlist is based on the filename.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=path")
    private String path;

    /**
     * Force overwriting of duplicate playlists.
     * By default, a playlist file uploaded with the same path will overwrite the existing playlist.
     * The `force` argument is used to disable overwriting.
     * If the `force` argument is set to 0, a new playlist will be created suffixed with the date and time that the duplicate was uploaded.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=force")
    private QueryParamForce force;

    /**
     * Possibly the section ID to upload the playlist to, we are not certain.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sectionID")
    private long sectionID;

    @JsonCreator
    public UploadPlaylistRequest(
            String path,
            QueryParamForce force,
            long sectionID) {
        Utils.checkNotNull(path, "path");
        Utils.checkNotNull(force, "force");
        Utils.checkNotNull(sectionID, "sectionID");
        this.path = path;
        this.force = force;
        this.sectionID = sectionID;
    }

    /**
     * absolute path to a directory on the server where m3u files are stored, or the absolute path to a playlist file on the server.
     * If the `path` argument is a directory, that path will be scanned for playlist files to be processed.
     * Each file in that directory creates a separate playlist, with a name based on the filename of the file that created it.
     * The GUID of each playlist is based on the filename.
     * If the `path` argument is a file, that file will be used to create a new playlist, with the name based on the filename of the file that created it.
     * The GUID of each playlist is based on the filename.
     */
    @JsonIgnore
    public String path() {
        return path;
    }

    /**
     * Force overwriting of duplicate playlists.
     * By default, a playlist file uploaded with the same path will overwrite the existing playlist.
     * The `force` argument is used to disable overwriting.
     * If the `force` argument is set to 0, a new playlist will be created suffixed with the date and time that the duplicate was uploaded.
     */
    @JsonIgnore
    public QueryParamForce force() {
        return force;
    }

    /**
     * Possibly the section ID to upload the playlist to, we are not certain.
     */
    @JsonIgnore
    public long sectionID() {
        return sectionID;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * absolute path to a directory on the server where m3u files are stored, or the absolute path to a playlist file on the server.
     * If the `path` argument is a directory, that path will be scanned for playlist files to be processed.
     * Each file in that directory creates a separate playlist, with a name based on the filename of the file that created it.
     * The GUID of each playlist is based on the filename.
     * If the `path` argument is a file, that file will be used to create a new playlist, with the name based on the filename of the file that created it.
     * The GUID of each playlist is based on the filename.
     */
    public UploadPlaylistRequest withPath(String path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
        return this;
    }

    /**
     * Force overwriting of duplicate playlists.
     * By default, a playlist file uploaded with the same path will overwrite the existing playlist.
     * The `force` argument is used to disable overwriting.
     * If the `force` argument is set to 0, a new playlist will be created suffixed with the date and time that the duplicate was uploaded.
     */
    public UploadPlaylistRequest withForce(QueryParamForce force) {
        Utils.checkNotNull(force, "force");
        this.force = force;
        return this;
    }

    /**
     * Possibly the section ID to upload the playlist to, we are not certain.
     */
    public UploadPlaylistRequest withSectionID(long sectionID) {
        Utils.checkNotNull(sectionID, "sectionID");
        this.sectionID = sectionID;
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
        UploadPlaylistRequest other = (UploadPlaylistRequest) o;
        return 
            Objects.deepEquals(this.path, other.path) &&
            Objects.deepEquals(this.force, other.force) &&
            Objects.deepEquals(this.sectionID, other.sectionID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            path,
            force,
            sectionID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadPlaylistRequest.class,
                "path", path,
                "force", force,
                "sectionID", sectionID);
    }
    
    public final static class Builder {
 
        private String path;
 
        private QueryParamForce force;
 
        private Long sectionID;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * absolute path to a directory on the server where m3u files are stored, or the absolute path to a playlist file on the server.
         * If the `path` argument is a directory, that path will be scanned for playlist files to be processed.
         * Each file in that directory creates a separate playlist, with a name based on the filename of the file that created it.
         * The GUID of each playlist is based on the filename.
         * If the `path` argument is a file, that file will be used to create a new playlist, with the name based on the filename of the file that created it.
         * The GUID of each playlist is based on the filename.
         */
        public Builder path(String path) {
            Utils.checkNotNull(path, "path");
            this.path = path;
            return this;
        }

        /**
         * Force overwriting of duplicate playlists.
         * By default, a playlist file uploaded with the same path will overwrite the existing playlist.
         * The `force` argument is used to disable overwriting.
         * If the `force` argument is set to 0, a new playlist will be created suffixed with the date and time that the duplicate was uploaded.
         */
        public Builder force(QueryParamForce force) {
            Utils.checkNotNull(force, "force");
            this.force = force;
            return this;
        }

        /**
         * Possibly the section ID to upload the playlist to, we are not certain.
         */
        public Builder sectionID(long sectionID) {
            Utils.checkNotNull(sectionID, "sectionID");
            this.sectionID = sectionID;
            return this;
        }
        
        public UploadPlaylistRequest build() {
            if (sectionID == null) {
                sectionID = _SINGLETON_VALUE_SectionID.value();
            }
            return new UploadPlaylistRequest(
                path,
                force,
                sectionID);
        }

        private static final LazySingletonValue<Long> _SINGLETON_VALUE_SectionID =
                new LazySingletonValue<>(
                        "sectionID",
                        "1",
                        new TypeReference<Long>() {});
    }
}
