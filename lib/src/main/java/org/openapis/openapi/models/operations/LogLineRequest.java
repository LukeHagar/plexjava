/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class LogLineRequest {
    /**
     * An integer log level to write to the PMS log with.  
     * 0: Error  
     * 1: Warning  
     * 2: Info  
     * 3: Debug  
     * 4: Verbose
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=level")
    public Level level;

    public LogLineRequest withLevel(Level level) {
        this.level = level;
        return this;
    }
    
    /**
     * The text of the message to write to the log.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=message")
    public String message;

    public LogLineRequest withMessage(String message) {
        this.message = message;
        return this;
    }
    
    /**
     * a string indicating the source of the message.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=source")
    public String source;

    public LogLineRequest withSource(String source) {
        this.source = source;
        return this;
    }
    
    public LogLineRequest(@JsonProperty("level") Level level, @JsonProperty("message") String message, @JsonProperty("source") String source) {
        this.level = level;
        this.message = message;
        this.source = source;
  }
}
