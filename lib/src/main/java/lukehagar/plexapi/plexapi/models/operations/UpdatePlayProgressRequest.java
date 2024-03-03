/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;


public class UpdatePlayProgressRequest {
    /**
     * the media key
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=key")
    public String key;

    public UpdatePlayProgressRequest withKey(String key) {
        this.key = key;
        return this;
    }
    
    /**
     * The time, in milliseconds, used to set the media playback progress.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=time")
    public Double time;

    public UpdatePlayProgressRequest withTime(Double time) {
        this.time = time;
        return this;
    }
    
    /**
     * The playback state of the media item.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=state")
    public String state;

    public UpdatePlayProgressRequest withState(String state) {
        this.state = state;
        return this;
    }
    
    public UpdatePlayProgressRequest(@JsonProperty("key") String key, @JsonProperty("time") Double time, @JsonProperty("state") String state) {
        this.key = key;
        this.time = time;
        this.state = state;
  }
}
