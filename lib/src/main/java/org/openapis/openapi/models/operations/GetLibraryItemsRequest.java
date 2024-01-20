/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class GetLibraryItemsRequest {
    /**
     * the Id of the library to query
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sectionId")
    public Double sectionId;

    public GetLibraryItemsRequest withSectionId(Double sectionId) {
        this.sectionId = sectionId;
        return this;
    }
    
    /**
     * item type
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=type")
    public Double type;

    public GetLibraryItemsRequest withType(Double type) {
        this.type = type;
        return this;
    }
    
    /**
     * the filter parameter
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=filter")
    public String filter;

    public GetLibraryItemsRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }
    
    public GetLibraryItemsRequest(@JsonProperty("sectionId") Double sectionId) {
        this.sectionId = sectionId;
  }
}
