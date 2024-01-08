/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class GetLibraryRequest {
    /**
     * the Id of the library to query
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sectionId")
    public Double sectionId;

    public GetLibraryRequest withSectionId(Double sectionId) {
        this.sectionId = sectionId;
        return this;
    }
    
    /**
     * Whether or not to include details for a section (types, filters, and sorts). 
     * Only exists for backwards compatibility, media providers other than the server libraries have it on always.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeDetails")
    public IncludeDetails includeDetails;

    public GetLibraryRequest withIncludeDetails(IncludeDetails includeDetails) {
        this.includeDetails = includeDetails;
        return this;
    }
    
    public GetLibraryRequest(@JsonProperty("sectionId") Double sectionId) {
        this.sectionId = sectionId;
  }
}