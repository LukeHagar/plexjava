/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Producer {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Integer id;

    public Producer withId(Integer id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    public String filter;

    public Producer withFilter(String filter) {
        this.filter = filter;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    public String tag;

    public Producer withTag(String tag) {
        this.tag = tag;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tagKey")
    public String tagKey;

    public Producer withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    public String thumb;

    public Producer withThumb(String thumb) {
        this.thumb = thumb;
        return this;
    }
    
    public Producer(){}
}
