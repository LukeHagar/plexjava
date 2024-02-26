/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import lukehagar.plexapi.plexapi.utils.HTTPClient;
import lukehagar.plexapi.plexapi.utils.HTTPRequest;
import lukehagar.plexapi.plexapi.utils.JSON;
import org.apache.http.NameValuePair;

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
    public lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsResponse getGlobalHubs() throws Exception {
        return this.getGlobalHubs(null, null);
    }

    /**
     * Get Global Hubs
     * Get Global Hubs filtered by the parameters provided.
     * @param onlyTransient Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added).
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsResponse getGlobalHubs(lukehagar.plexapi.plexapi.models.operations.OnlyTransient onlyTransient) throws Exception {
        return this.getGlobalHubs(null, onlyTransient);
    }

    /**
     * Get Global Hubs
     * Get Global Hubs filtered by the parameters provided.
     * @param count The number of items to return with each hub.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsResponse getGlobalHubs(Double count) throws Exception {
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
    public lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsResponse getGlobalHubs(Double count, lukehagar.plexapi.plexapi.models.operations.OnlyTransient onlyTransient) throws Exception {
        lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsRequest request = new lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsRequest();
        request.count=count;
        request.onlyTransient=onlyTransient;
        
        String baseUrl = lukehagar.plexapi.plexapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = lukehagar.plexapi.plexapi.utils.Utils.generateURL(baseUrl, "/hubs");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = lukehagar.plexapi.plexapi.utils.Utils.getQueryParams(lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsResponse res = new lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsResponse(contentType, httpRes.statusCode(), httpRes) {{
            twoHundredApplicationJsonObject = null;
            fourHundredAndOneApplicationJsonObject = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsResponseBody.class);
                res.twoHundredApplicationJsonObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsHubsResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsHubsResponseBody.class);
                res.fourHundredAndOneApplicationJsonObject = out;
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
    public lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsResponse getLibraryHubs(Double sectionId) throws Exception {
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
    public lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsResponse getLibraryHubs(Double sectionId, lukehagar.plexapi.plexapi.models.operations.QueryParamOnlyTransient onlyTransient) throws Exception {
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
    public lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsResponse getLibraryHubs(Double sectionId, Double count) throws Exception {
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
    public lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsResponse getLibraryHubs(Double sectionId, Double count, lukehagar.plexapi.plexapi.models.operations.QueryParamOnlyTransient onlyTransient) throws Exception {
        lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsRequest request = new lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsRequest(sectionId);
        request.count=count;
        request.onlyTransient=onlyTransient;
        
        String baseUrl = lukehagar.plexapi.plexapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = lukehagar.plexapi.plexapi.utils.Utils.generateURL(lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsRequest.class, baseUrl, "/hubs/sections/{sectionId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = lukehagar.plexapi.plexapi.utils.Utils.getQueryParams(lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsResponse res = new lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsResponse(contentType, httpRes.statusCode(), httpRes) {{
            twoHundredApplicationJsonObject = null;
            fourHundredAndOneApplicationJsonObject = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsResponseBody.class);
                res.twoHundredApplicationJsonObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsHubsResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsHubsResponseBody.class);
                res.fourHundredAndOneApplicationJsonObject = out;
            }
        }

        return res;
    }
}