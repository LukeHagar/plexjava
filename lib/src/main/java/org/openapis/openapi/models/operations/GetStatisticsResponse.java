/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetStatisticsResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetStatisticsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetStatisticsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetStatisticsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Media Statistics
     */
    
    public GetStatisticsResponseBody twoHundredApplicationJsonObject;

    public GetStatisticsResponse withTwoHundredApplicationJsonObject(GetStatisticsResponseBody twoHundredApplicationJsonObject) {
        this.twoHundredApplicationJsonObject = twoHundredApplicationJsonObject;
        return this;
    }
    
    /**
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    
    public GetStatisticsStatisticsResponseBody fourHundredAndOneApplicationJsonObject;

    public GetStatisticsResponse withFourHundredAndOneApplicationJsonObject(GetStatisticsStatisticsResponseBody fourHundredAndOneApplicationJsonObject) {
        this.fourHundredAndOneApplicationJsonObject = fourHundredAndOneApplicationJsonObject;
        return this;
    }
    
    public GetStatisticsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
