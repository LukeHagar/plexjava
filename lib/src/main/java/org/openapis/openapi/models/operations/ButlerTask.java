/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ButlerTask {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public ButlerTask withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interval")
    public Double interval;

    public ButlerTask withInterval(Double interval) {
        this.interval = interval;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scheduleRandomized")
    public Boolean scheduleRandomized;

    public ButlerTask withScheduleRandomized(Boolean scheduleRandomized) {
        this.scheduleRandomized = scheduleRandomized;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enabled")
    public Boolean enabled;

    public ButlerTask withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public ButlerTask withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public ButlerTask withDescription(String description) {
        this.description = description;
        return this;
    }
    
    public ButlerTask(){}
}
