/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class CancelServerActivitiesRequest {
    /**
     * The UUID of the activity to cancel.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=activityUUID")
    public String activityUUID;

    public CancelServerActivitiesRequest withActivityUUID(String activityUUID) {
        this.activityUUID = activityUUID;
        return this;
    }
    
    public CancelServerActivitiesRequest(@JsonProperty("activityUUID") String activityUUID) {
        this.activityUUID = activityUUID;
  }
}