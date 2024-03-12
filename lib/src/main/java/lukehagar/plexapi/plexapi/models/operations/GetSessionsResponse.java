/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetSessionsResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetSessionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetSessionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetSessionsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * List of Active Plex Sessions
     */
    
    public GetSessionsResponseBody twoHundredApplicationJsonObject;

    public GetSessionsResponse withTwoHundredApplicationJsonObject(GetSessionsResponseBody twoHundredApplicationJsonObject) {
        this.twoHundredApplicationJsonObject = twoHundredApplicationJsonObject;
        return this;
    }
    
    /**
     * Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
     */
    
    public GetSessionsSessionsResponseBody fourHundredAndOneApplicationJsonObject;

    public GetSessionsResponse withFourHundredAndOneApplicationJsonObject(GetSessionsSessionsResponseBody fourHundredAndOneApplicationJsonObject) {
        this.fourHundredAndOneApplicationJsonObject = fourHundredAndOneApplicationJsonObject;
        return this;
    }
    
    public GetSessionsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
