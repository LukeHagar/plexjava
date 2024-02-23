/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.JSON;

/**
 * API Calls that perform operations directly against https://Plex.tv
 * 
 */
public class Plex {
	
    /**
	 * GET_PIN_SERVERS contains the list of server urls available to the SDK.
	 */
    public static final String[] GET_PIN_SERVERS = {
        "https://plex.tv/api/v2",
    };
	
    /**
	 * GET_TOKEN_SERVERS contains the list of server urls available to the SDK.
	 */
    public static final String[] GET_TOKEN_SERVERS = {
        "https://plex.tv/api/v2",
    };
	
	private SDKConfiguration sdkConfiguration;

	public Plex(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get a Pin
     * Retrieve a Pin from Plex.tv for authentication flows
     * @param xPlexClientIdentifier The unique identifier for the client application
    This is used to track the client application and its usage
    (UUID, serial number, or other number unique per device)

     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetPinResponse getPin(String xPlexClientIdentifier) throws Exception {
        return this.getPin(xPlexClientIdentifier, null, null);
    }

    /**
     * Get a Pin
     * Retrieve a Pin from Plex.tv for authentication flows
     * @param xPlexClientIdentifier The unique identifier for the client application
    This is used to track the client application and its usage
    (UUID, serial number, or other number unique per device)

     * @param serverURL an optional server URL to use
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetPinResponse getPin(String xPlexClientIdentifier, String serverURL) throws Exception {
        return this.getPin(xPlexClientIdentifier, null, serverURL);
    }

    /**
     * Get a Pin
     * Retrieve a Pin from Plex.tv for authentication flows
     * @param xPlexClientIdentifier The unique identifier for the client application
    This is used to track the client application and its usage
    (UUID, serial number, or other number unique per device)

     * @param strong Determines the kind of code returned by the API call
    Strong codes are used for Pin authentication flows
    Non-Strong codes are used for `Plex.tv/link`

     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetPinResponse getPin(String xPlexClientIdentifier, Boolean strong) throws Exception {
        return this.getPin(xPlexClientIdentifier, strong, null);
    }

    /**
     * Get a Pin
     * Retrieve a Pin from Plex.tv for authentication flows
     * @param xPlexClientIdentifier The unique identifier for the client application
    This is used to track the client application and its usage
    (UUID, serial number, or other number unique per device)

     * @param strong Determines the kind of code returned by the API call
    Strong codes are used for Pin authentication flows
    Non-Strong codes are used for `Plex.tv/link`

     * @param serverURL an optional server URL to use
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetPinResponse getPin(String xPlexClientIdentifier, Boolean strong, String serverURL) throws Exception {
        org.openapis.openapi.models.operations.GetPinRequest request = new org.openapis.openapi.models.operations.GetPinRequest(xPlexClientIdentifier);
        request.strong=strong;
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(GET_PIN_SERVERS[0], new java.util.HashMap<String, String>());
        if (serverURL != null && !serverURL.isBlank()) {
            baseUrl = serverURL;
        }
        
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/pins");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.GetPinRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        java.util.Map<String, java.util.List<String>> headers = org.openapis.openapi.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.GetPinResponse res = new org.openapis.openapi.models.operations.GetPinResponse(contentType, httpRes.statusCode(), httpRes) {{
            twoHundredApplicationJsonObject = null;
            fourHundredApplicationJsonObject = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.GetPinResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.GetPinResponseBody.class);
                res.twoHundredApplicationJsonObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.GetPinPlexResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.GetPinPlexResponseBody.class);
                res.fourHundredApplicationJsonObject = out;
            }
        }

        return res;
    }

    /**
     * Get Access Token
     * Retrieve an Access Token from Plex.tv after the Pin has already been authenticated
     * @param pinID The PinID to retrieve an access token for
     * @param xPlexClientIdentifier The unique identifier for the client application
    This is used to track the client application and its usage
    (UUID, serial number, or other number unique per device)

     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetTokenResponse getToken(String pinID, String xPlexClientIdentifier) throws Exception {
        return this.getToken(pinID, xPlexClientIdentifier, null);
    }

    /**
     * Get Access Token
     * Retrieve an Access Token from Plex.tv after the Pin has already been authenticated
     * @param pinID The PinID to retrieve an access token for
     * @param xPlexClientIdentifier The unique identifier for the client application
    This is used to track the client application and its usage
    (UUID, serial number, or other number unique per device)

     * @param serverURL an optional server URL to use
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetTokenResponse getToken(String pinID, String xPlexClientIdentifier, String serverURL) throws Exception {
        org.openapis.openapi.models.operations.GetTokenRequest request = new org.openapis.openapi.models.operations.GetTokenRequest(pinID, xPlexClientIdentifier);
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(GET_TOKEN_SERVERS[0], new java.util.HashMap<String, String>());
        if (serverURL != null && !serverURL.isBlank()) {
            baseUrl = serverURL;
        }
        
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.GetTokenRequest.class, baseUrl, "/pins/{pinID}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.Map<String, java.util.List<String>> headers = org.openapis.openapi.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.GetTokenResponse res = new org.openapis.openapi.models.operations.GetTokenResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200) {
        }
        else if (httpRes.statusCode() == 400) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.GetTokenResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.GetTokenResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }
}