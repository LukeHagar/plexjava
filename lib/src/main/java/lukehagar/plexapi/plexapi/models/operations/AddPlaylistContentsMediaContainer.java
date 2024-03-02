/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AddPlaylistContentsMediaContainer {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Integer size;

    public AddPlaylistContentsMediaContainer withSize(Integer size) {
        this.size = size;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("leafCountAdded")
    public Integer leafCountAdded;

    public AddPlaylistContentsMediaContainer withLeafCountAdded(Integer leafCountAdded) {
        this.leafCountAdded = leafCountAdded;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("leafCountRequested")
    public Integer leafCountRequested;

    public AddPlaylistContentsMediaContainer withLeafCountRequested(Integer leafCountRequested) {
        this.leafCountRequested = leafCountRequested;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Metadata")
    public AddPlaylistContentsMetadata[] metadata;

    public AddPlaylistContentsMediaContainer withMetadata(AddPlaylistContentsMetadata[] metadata) {
        this.metadata = metadata;
        return this;
    }
    
    public AddPlaylistContentsMediaContainer(){}
}