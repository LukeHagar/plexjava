/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;


public class GetLibraryHubsRequest {
    /**
     * the Id of the library to query
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sectionId")
    public Double sectionId;

    public GetLibraryHubsRequest withSectionId(Double sectionId) {
        this.sectionId = sectionId;
        return this;
    }
    
    /**
     * The number of items to return with each hub.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    public Double count;

    public GetLibraryHubsRequest withCount(Double count) {
        this.count = count;
        return this;
    }
    
    /**
     * Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=onlyTransient")
    public QueryParamOnlyTransient onlyTransient;

    public GetLibraryHubsRequest withOnlyTransient(QueryParamOnlyTransient onlyTransient) {
        this.onlyTransient = onlyTransient;
        return this;
    }
    
    public GetLibraryHubsRequest(@JsonProperty("sectionId") Double sectionId) {
        this.sectionId = sectionId;
  }
}
