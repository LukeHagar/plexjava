/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class MarkPlayedRequest {
    /**
     * The media key to mark as played
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=key")
    public Double key;

    public MarkPlayedRequest withKey(Double key) {
        this.key = key;
        return this;
    }
    
    public MarkPlayedRequest(@JsonProperty("key") Double key) {
        this.key = key;
  }
}
