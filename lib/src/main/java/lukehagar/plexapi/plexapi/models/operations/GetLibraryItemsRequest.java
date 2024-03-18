/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;


public class GetLibraryItemsRequest {
    /**
     * the Id of the library to query
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sectionId")
    public Long sectionId;

    public GetLibraryItemsRequest withSectionId(Long sectionId) {
        this.sectionId = sectionId;
        return this;
    }
    
    /**
     * A key representing a specific tag within the section.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=tag")
    public Tag tag;

    public GetLibraryItemsRequest withTag(Tag tag) {
        this.tag = tag;
        return this;
    }
    
    public GetLibraryItemsRequest(@JsonProperty("sectionId") Long sectionId, @JsonProperty("tag") Tag tag) {
        this.sectionId = sectionId;
        this.tag = tag;
  }
}
