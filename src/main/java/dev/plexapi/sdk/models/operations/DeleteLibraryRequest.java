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


public class DeleteLibraryRequest {

    /**
     * The unique key of the Plex library. 
     * Note: This is unique in the context of the Plex server.
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sectionKey")
    private int sectionKey;

    @JsonCreator
    public DeleteLibraryRequest(
            int sectionKey) {
        Utils.checkNotNull(sectionKey, "sectionKey");
        this.sectionKey = sectionKey;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique key of the Plex library. 
     * Note: This is unique in the context of the Plex server.
     * 
     */
    public DeleteLibraryRequest withSectionKey(int sectionKey) {
        Utils.checkNotNull(sectionKey, "sectionKey");
        this.sectionKey = sectionKey;
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
        DeleteLibraryRequest other = (DeleteLibraryRequest) o;
        return 
            Objects.deepEquals(this.sectionKey, other.sectionKey);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            sectionKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteLibraryRequest.class,
                "sectionKey", sectionKey);
    }
    
    public final static class Builder {
 
        private Integer sectionKey;  
        
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
        
        public DeleteLibraryRequest build() {
            return new DeleteLibraryRequest(
                sectionKey);
        }
    }
}

