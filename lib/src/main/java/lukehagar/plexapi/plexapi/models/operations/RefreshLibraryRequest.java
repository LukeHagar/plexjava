/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;


public class RefreshLibraryRequest {
    /**
     * the Id of the library to refresh
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sectionId")
    public Double sectionId;

    public RefreshLibraryRequest withSectionId(Double sectionId) {
        this.sectionId = sectionId;
        return this;
    }
    
    public RefreshLibraryRequest(@JsonProperty("sectionId") Double sectionId) {
        this.sectionId = sectionId;
  }
}