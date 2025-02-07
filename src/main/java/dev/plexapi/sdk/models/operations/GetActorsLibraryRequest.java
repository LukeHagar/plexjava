/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetActorsLibraryRequest {

    /**
     * The unique key of the Plex library. 
     * Note: This is unique in the context of the Plex server.
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sectionKey")
    private int sectionKey;

    /**
     * The type of media to retrieve or filter by.
     * 1 = movie
     * 2 = show
     * 3 = season
     * 4 = episode
     * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=type")
    private GetActorsLibraryQueryParamType type;

    @JsonCreator
    public GetActorsLibraryRequest(
            int sectionKey,
            GetActorsLibraryQueryParamType type) {
        Utils.checkNotNull(sectionKey, "sectionKey");
        Utils.checkNotNull(type, "type");
        this.sectionKey = sectionKey;
        this.type = type;
    }

    /**
     * The unique key of the Plex library. 
     * Note: This is unique in the context of the Plex server.
     * 
     */
    @JsonIgnore
    public int sectionKey() {
        return sectionKey;
    }

    /**
     * The type of media to retrieve or filter by.
     * 1 = movie
     * 2 = show
     * 3 = season
     * 4 = episode
     * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
     * 
     */
    @JsonIgnore
    public GetActorsLibraryQueryParamType type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique key of the Plex library. 
     * Note: This is unique in the context of the Plex server.
     * 
     */
    public GetActorsLibraryRequest withSectionKey(int sectionKey) {
        Utils.checkNotNull(sectionKey, "sectionKey");
        this.sectionKey = sectionKey;
        return this;
    }

    /**
     * The type of media to retrieve or filter by.
     * 1 = movie
     * 2 = show
     * 3 = season
     * 4 = episode
     * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
     * 
     */
    public GetActorsLibraryRequest withType(GetActorsLibraryQueryParamType type) {
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
        GetActorsLibraryRequest other = (GetActorsLibraryRequest) o;
        return 
            Objects.deepEquals(this.sectionKey, other.sectionKey) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            sectionKey,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetActorsLibraryRequest.class,
                "sectionKey", sectionKey,
                "type", type);
    }
    
    public final static class Builder {
 
        private Integer sectionKey;
 
        private GetActorsLibraryQueryParamType type;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique key of the Plex library. 
         * Note: This is unique in the context of the Plex server.
         * 
         */
        public Builder sectionKey(int sectionKey) {
            Utils.checkNotNull(sectionKey, "sectionKey");
            this.sectionKey = sectionKey;
            return this;
        }

        /**
         * The type of media to retrieve or filter by.
         * 1 = movie
         * 2 = show
         * 3 = season
         * 4 = episode
         * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
         * 
         */
        public Builder type(GetActorsLibraryQueryParamType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public GetActorsLibraryRequest build() {
            return new GetActorsLibraryRequest(
                sectionKey,
                type);
        }
    }
}

