/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class GetSourceConnectionInformationRequest {
    /**
     * The source identifier with an included prefix.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=source")
    public String source;

    public GetSourceConnectionInformationRequest withSource(String source) {
        this.source = source;
        return this;
    }
    
    public GetSourceConnectionInformationRequest(@JsonProperty("source") String source) {
        this.source = source;
  }
}