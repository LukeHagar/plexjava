/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.JSON;

/**
 * Hubs are a structured two-dimensional container for media, generally represented by multiple horizontal rows.
 * 
 */
public class Hubs {
	
	private SDKConfiguration sdkConfiguration;

	public Hubs(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get Global Hubs
     * Get Global Hubs filtered by the parameters provided.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetGlobalHubsResponse getGlobalHubs() throws Exception {
        return this.getGlobalHubs(null, null);
    }

    /**
     * Get Global Hubs
     * Get Global Hubs filtered by the parameters provided.
     * @param onlyTransient Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added).
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetGlobalHubsResponse getGlobalHubs(org.openapis.openapi.models.operations.OnlyTransient onlyTransient) throws Exception {
        return this.getGlobalHubs(null, onlyTransient);
    }

    /**
     * Get Global Hubs
     * Get Global Hubs filtered by the parameters provided.
     * @param count The number of items to return with each hub.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetGlobalHubsResponse getGlobalHubs(Double count) throws Exception {
        return this.getGlobalHubs(count, null);
    }

    /**
     * Get Global Hubs
     * Get Global Hubs filtered by the parameters provided.
     * @param count The number of items to return with each hub.
     * @param onlyTransient Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added).
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetGlobalHubsResponse getGlobalHubs(Double count, org.openapis.openapi.models.operations.OnlyTransient onlyTransient) throws Exception {
        org.openapis.openapi.models.operations.GetGlobalHubsRequest request = new org.openapis.openapi.models.operations.GetGlobalHubsRequest();
        request.count=count;
        request.onlyTransient=onlyTransient;
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/hubs");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.GetGlobalHubsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.GetGlobalHubsResponse res = new org.openapis.openapi.models.operations.GetGlobalHubsResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.GetGlobalHubsResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.GetGlobalHubsResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Get library specific hubs
     * This endpoint will return a list of library specific hubs
     * 
     * @param sectionId the Id of the library to query
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetLibraryHubsResponse getLibraryHubs(Double sectionId) throws Exception {
        return this.getLibraryHubs(sectionId, null, null);
    }

    /**
     * Get library specific hubs
     * This endpoint will return a list of library specific hubs
     * 
     * @param sectionId the Id of the library to query
     * @param onlyTransient Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added).
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetLibraryHubsResponse getLibraryHubs(Double sectionId, org.openapis.openapi.models.operations.QueryParamOnlyTransient onlyTransient) throws Exception {
        return this.getLibraryHubs(sectionId, null, onlyTransient);
    }

    /**
     * Get library specific hubs
     * This endpoint will return a list of library specific hubs
     * 
     * @param sectionId the Id of the library to query
     * @param count The number of items to return with each hub.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetLibraryHubsResponse getLibraryHubs(Double sectionId, Double count) throws Exception {
        return this.getLibraryHubs(sectionId, count, null);
    }

    /**
     * Get library specific hubs
     * This endpoint will return a list of library specific hubs
     * 
     * @param sectionId the Id of the library to query
     * @param count The number of items to return with each hub.
     * @param onlyTransient Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added).
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetLibraryHubsResponse getLibraryHubs(Double sectionId, Double count, org.openapis.openapi.models.operations.QueryParamOnlyTransient onlyTransient) throws Exception {
        org.openapis.openapi.models.operations.GetLibraryHubsRequest request = new org.openapis.openapi.models.operations.GetLibraryHubsRequest(sectionId);
        request.count=count;
        request.onlyTransient=onlyTransient;
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.GetLibraryHubsRequest.class, baseUrl, "/hubs/sections/{sectionId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.GetLibraryHubsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.GetLibraryHubsResponse res = new org.openapis.openapi.models.operations.GetLibraryHubsResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.GetLibraryHubsResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.GetLibraryHubsResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }
}