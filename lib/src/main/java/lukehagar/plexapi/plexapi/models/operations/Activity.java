/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Activity {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uuid")
    public String uuid;

    public Activity withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;

    public Activity withType(String type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cancellable")
    public Boolean cancellable;

    public Activity withCancellable(Boolean cancellable) {
        this.cancellable = cancellable;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("userID")
    public Double userID;

    public Activity withUserID(Double userID) {
        this.userID = userID;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public Activity withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subtitle")
    public String subtitle;

    public Activity withSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("progress")
    public Double progress;

    public Activity withProgress(Double progress) {
        this.progress = progress;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Context")
    public Context context;

    public Activity withContext(Context context) {
        this.context = context;
        return this;
    }
    
    public Activity(){}
}
