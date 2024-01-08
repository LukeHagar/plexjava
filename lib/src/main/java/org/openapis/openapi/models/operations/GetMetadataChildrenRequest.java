/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class GetMetadataChildrenRequest {
    /**
     * the id of the library item to return the children of.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ratingKey")
    public Double ratingKey;

    public GetMetadataChildrenRequest withRatingKey(Double ratingKey) {
        this.ratingKey = ratingKey;
        return this;
    }
    
    public GetMetadataChildrenRequest(@JsonProperty("ratingKey") Double ratingKey) {
        this.ratingKey = ratingKey;
  }
}