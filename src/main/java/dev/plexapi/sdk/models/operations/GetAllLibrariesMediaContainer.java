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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GetAllLibrariesMediaContainer {

    /**
     * Number of media items returned in this response.
     */
    @JsonProperty("size")
    private int size;

    /**
     * Indicates whether syncing is allowed.
     */
    @JsonProperty("allowSync")
    private boolean allowSync;

    /**
     * The primary title of the media container.
     */
    @JsonProperty("title1")
    private String title1;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Directory")
    private Optional<? extends List<GetAllLibrariesDirectory>> directory;

    @JsonCreator
    public GetAllLibrariesMediaContainer(
            @JsonProperty("size") int size,
            @JsonProperty("allowSync") boolean allowSync,
            @JsonProperty("title1") String title1,
            @JsonProperty("Directory") Optional<? extends List<GetAllLibrariesDirectory>> directory) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(allowSync, "allowSync");
        Utils.checkNotNull(title1, "title1");
        Utils.checkNotNull(directory, "directory");
        this.size = size;
        this.allowSync = allowSync;
        this.title1 = title1;
        this.directory = directory;
    }
    
    public GetAllLibrariesMediaContainer(
            int size,
            boolean allowSync,
            String title1) {
        this(size, allowSync, title1, Optional.empty());
    }

    /**
     * Number of media items returned in this response.
     */
    @JsonIgnore
    public int size() {
        return size;
    }

    /**
     * Indicates whether syncing is allowed.
     */
    @JsonIgnore
    public boolean allowSync() {
        return allowSync;
    }

    /**
     * The primary title of the media container.
     */
    @JsonIgnore
    public String title1() {
        return title1;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetAllLibrariesDirectory>> directory() {
        return (Optional<List<GetAllLibrariesDirectory>>) directory;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Number of media items returned in this response.
     */
    public GetAllLibrariesMediaContainer withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    /**
     * Indicates whether syncing is allowed.
     */
    public GetAllLibrariesMediaContainer withAllowSync(boolean allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = allowSync;
        return this;
    }

    /**
     * The primary title of the media container.
     */
    public GetAllLibrariesMediaContainer withTitle1(String title1) {
        Utils.checkNotNull(title1, "title1");
        this.title1 = title1;
        return this;
    }

    public GetAllLibrariesMediaContainer withDirectory(List<GetAllLibrariesDirectory> directory) {
        Utils.checkNotNull(directory, "directory");
        this.directory = Optional.ofNullable(directory);
        return this;
    }

    public GetAllLibrariesMediaContainer withDirectory(Optional<? extends List<GetAllLibrariesDirectory>> directory) {
        Utils.checkNotNull(directory, "directory");
        this.directory = directory;
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
        GetAllLibrariesMediaContainer other = (GetAllLibrariesMediaContainer) o;
        return 
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.allowSync, other.allowSync) &&
            Objects.deepEquals(this.title1, other.title1) &&
            Objects.deepEquals(this.directory, other.directory);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            size,
            allowSync,
            title1,
            directory);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAllLibrariesMediaContainer.class,
                "size", size,
                "allowSync", allowSync,
                "title1", title1,
                "directory", directory);
    }
    
    public final static class Builder {
 
        private Integer size;
 
        private Boolean allowSync;
 
        private String title1;
 
        private Optional<? extends List<GetAllLibrariesDirectory>> directory = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Number of media items returned in this response.
         */
        public Builder size(int size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        /**
         * Indicates whether syncing is allowed.
         */
        public Builder allowSync(boolean allowSync) {
            Utils.checkNotNull(allowSync, "allowSync");
            this.allowSync = allowSync;
            return this;
        }

        /**
         * The primary title of the media container.
         */
        public Builder title1(String title1) {
            Utils.checkNotNull(title1, "title1");
            this.title1 = title1;
            return this;
        }

        public Builder directory(List<GetAllLibrariesDirectory> directory) {
            Utils.checkNotNull(directory, "directory");
            this.directory = Optional.ofNullable(directory);
            return this;
        }

        public Builder directory(Optional<? extends List<GetAllLibrariesDirectory>> directory) {
            Utils.checkNotNull(directory, "directory");
            this.directory = directory;
            return this;
        }
        
        public GetAllLibrariesMediaContainer build() {
            return new GetAllLibrariesMediaContainer(
                size,
                allowSync,
                title1,
                directory);
        }
    }
}
