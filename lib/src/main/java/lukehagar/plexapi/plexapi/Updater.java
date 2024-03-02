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
 * This describes the API for searching and applying updates to the Plex Media Server.
 * Updates to the status can be observed via the Event API.
 * 
 */
public class Updater {
	
	private SDKConfiguration sdkConfiguration;

	public Updater(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Querying status of updates
     * Querying status of updates
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.GetUpdateStatusResponse getUpdateStatus() throws Exception {
        String baseUrl = lukehagar.plexapi.plexapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = lukehagar.plexapi.plexapi.utils.Utils.generateURL(baseUrl, "/updater/status");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        lukehagar.plexapi.plexapi.models.operations.GetUpdateStatusResponse res = new lukehagar.plexapi.plexapi.models.operations.GetUpdateStatusResponse(contentType, httpRes.statusCode(), httpRes) {{
            twoHundredApplicationJsonObject = null;
            fourHundredAndOneApplicationJsonObject = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.GetUpdateStatusResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), lukehagar.plexapi.plexapi.models.operations.GetUpdateStatusResponseBody.class);
                res.twoHundredApplicationJsonObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.GetUpdateStatusUpdaterResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), lukehagar.plexapi.plexapi.models.operations.GetUpdateStatusUpdaterResponseBody.class);
                res.fourHundredAndOneApplicationJsonObject = out;
            }
        }

        return res;
    }

    /**
     * Checking for updates
     * Checking for updates
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.CheckForUpdatesResponse checkForUpdates() throws Exception {
        return this.checkForUpdates(null);
    }

    /**
     * Checking for updates
     * Checking for updates
     * @param download Indicate that you want to start download any updates found.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.CheckForUpdatesResponse checkForUpdates(lukehagar.plexapi.plexapi.models.operations.Download download) throws Exception {
        lukehagar.plexapi.plexapi.models.operations.CheckForUpdatesRequest request = new lukehagar.plexapi.plexapi.models.operations.CheckForUpdatesRequest();
        request.download=download;
        
        String baseUrl = lukehagar.plexapi.plexapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = lukehagar.plexapi.plexapi.utils.Utils.generateURL(baseUrl, "/updater/check");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = lukehagar.plexapi.plexapi.utils.Utils.getQueryParams(lukehagar.plexapi.plexapi.models.operations.CheckForUpdatesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        lukehagar.plexapi.plexapi.models.operations.CheckForUpdatesResponse res = new lukehagar.plexapi.plexapi.models.operations.CheckForUpdatesResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.CheckForUpdatesResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), lukehagar.plexapi.plexapi.models.operations.CheckForUpdatesResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Apply Updates
     * Note that these two parameters are effectively mutually exclusive. The `tonight` parameter takes precedence and `skip` will be ignored if `tonight` is also passed
     * 
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.ApplyUpdatesResponse applyUpdates() throws Exception {
        return this.applyUpdates(null, null);
    }

    /**
     * Apply Updates
     * Note that these two parameters are effectively mutually exclusive. The `tonight` parameter takes precedence and `skip` will be ignored if `tonight` is also passed
     * 
     * @param skip Indicate that the latest version should be marked as skipped. The <Release> entry for this version will have the `state` set to `skipped`.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.ApplyUpdatesResponse applyUpdates(lukehagar.plexapi.plexapi.models.operations.Skip skip) throws Exception {
        return this.applyUpdates(null, skip);
    }

    /**
     * Apply Updates
     * Note that these two parameters are effectively mutually exclusive. The `tonight` parameter takes precedence and `skip` will be ignored if `tonight` is also passed
     * 
     * @param tonight Indicate that you want the update to run during the next Butler execution. Omitting this or setting it to false indicates that the update should install
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.ApplyUpdatesResponse applyUpdates(lukehagar.plexapi.plexapi.models.operations.Tonight tonight) throws Exception {
        return this.applyUpdates(tonight, null);
    }

    /**
     * Apply Updates
     * Note that these two parameters are effectively mutually exclusive. The `tonight` parameter takes precedence and `skip` will be ignored if `tonight` is also passed
     * 
     * @param tonight Indicate that you want the update to run during the next Butler execution. Omitting this or setting it to false indicates that the update should install
     * @param skip Indicate that the latest version should be marked as skipped. The <Release> entry for this version will have the `state` set to `skipped`.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.ApplyUpdatesResponse applyUpdates(lukehagar.plexapi.plexapi.models.operations.Tonight tonight, lukehagar.plexapi.plexapi.models.operations.Skip skip) throws Exception {
        lukehagar.plexapi.plexapi.models.operations.ApplyUpdatesRequest request = new lukehagar.plexapi.plexapi.models.operations.ApplyUpdatesRequest();
        request.tonight=tonight;
        request.skip=skip;
        
        String baseUrl = lukehagar.plexapi.plexapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = lukehagar.plexapi.plexapi.utils.Utils.generateURL(baseUrl, "/updater/apply");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = lukehagar.plexapi.plexapi.utils.Utils.getQueryParams(lukehagar.plexapi.plexapi.models.operations.ApplyUpdatesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        lukehagar.plexapi.plexapi.models.operations.ApplyUpdatesResponse res = new lukehagar.plexapi.plexapi.models.operations.ApplyUpdatesResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400 || httpRes.statusCode() == 500) {
        }
        else if (httpRes.statusCode() == 401) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.ApplyUpdatesResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), lukehagar.plexapi.plexapi.models.operations.ApplyUpdatesResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }
}