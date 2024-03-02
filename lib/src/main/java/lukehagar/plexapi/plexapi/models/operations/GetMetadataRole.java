/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetMetadataRole {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Integer id;

    public GetMetadataRole withId(Integer id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    public String filter;

    public GetMetadataRole withFilter(String filter) {
        this.filter = filter;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    public String tag;

    public GetMetadataRole withTag(String tag) {
        this.tag = tag;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tagKey")
    public String tagKey;

    public GetMetadataRole withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    public String role;

    public GetMetadataRole withRole(String role) {
        this.role = role;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    public String thumb;

    public GetMetadataRole withThumb(String thumb) {
        this.thumb = thumb;
        return this;
    }
    
    public GetMetadataRole(){}
}