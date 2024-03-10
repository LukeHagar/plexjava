/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Ratings {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image")
    public String image;

    public Ratings withImage(String image) {
        this.image = image;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public Double value;

    public Ratings withValue(Double value) {
        this.value = value;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;

    public Ratings withType(String type) {
        this.type = type;
        return this;
    }
    
    public Ratings(){}
}
