/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetServerIdentityResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetServerIdentityResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetServerIdentityResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetServerIdentityResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * The Transcode Sessions
     */
    
    public GetServerIdentityResponseBody twoHundredApplicationJsonObject;

    public GetServerIdentityResponse withTwoHundredApplicationJsonObject(GetServerIdentityResponseBody twoHundredApplicationJsonObject) {
        this.twoHundredApplicationJsonObject = twoHundredApplicationJsonObject;
        return this;
    }
    
    /**
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    
    public GetServerIdentityServerResponseBody fourHundredAndOneApplicationJsonObject;

    public GetServerIdentityResponse withFourHundredAndOneApplicationJsonObject(GetServerIdentityServerResponseBody fourHundredAndOneApplicationJsonObject) {
        this.fourHundredAndOneApplicationJsonObject = fourHundredAndOneApplicationJsonObject;
        return this;
    }
    
    public GetServerIdentityResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
