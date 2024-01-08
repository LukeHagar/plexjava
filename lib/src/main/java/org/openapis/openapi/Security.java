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
 * API Calls against Security for Plex Media Server
 * 
 */
public class Security {
	
	private SDKConfiguration sdkConfiguration;

	public Security(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get a Transient Token.
     * This endpoint provides the caller with a temporary token with the same access level as the caller's token. These tokens are valid for up to 48 hours and are destroyed if the server instance is restarted.
     * 
     * @param type `delegation` - This is the only supported `type` parameter.
     * @param scope `all` - This is the only supported `scope` parameter.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetTransientTokenResponse getTransientToken(org.openapis.openapi.models.operations.QueryParamType type, org.openapis.openapi.models.operations.Scope scope) throws Exception {
        org.openapis.openapi.models.operations.GetTransientTokenRequest request = new org.openapis.openapi.models.operations.GetTransientTokenRequest(type, scope);
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/security/token");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.GetTransientTokenRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.GetTransientTokenResponse res = new org.openapis.openapi.models.operations.GetTransientTokenResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.GetTransientTokenResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.GetTransientTokenResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Get Source Connection Information
     * If a caller requires connection details and a transient token for a source that is known to the server, for example a cloud media provider or shared PMS, then this endpoint can be called. This endpoint is only accessible with either an admin token or a valid transient token generated from an admin token.
     * Note: requires Plex Media Server &gt;= 1.15.4.
     * 
     * @param source The source identifier with an included prefix.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetSourceConnectionInformationResponse getSourceConnectionInformation(String source) throws Exception {
        org.openapis.openapi.models.operations.GetSourceConnectionInformationRequest request = new org.openapis.openapi.models.operations.GetSourceConnectionInformationRequest(source);
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/security/resources");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.GetSourceConnectionInformationRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.GetSourceConnectionInformationResponse res = new org.openapis.openapi.models.operations.GetSourceConnectionInformationResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.GetSourceConnectionInformationResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.GetSourceConnectionInformationResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }
}