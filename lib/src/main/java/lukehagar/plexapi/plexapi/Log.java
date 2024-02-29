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
import lukehagar.plexapi.plexapi.utils.SerializedBody;
import org.apache.http.NameValuePair;

/**
 * Submit logs to the Log Handler for Plex Media Server
 * 
 */
public class Log {
	
	private SDKConfiguration sdkConfiguration;

	public Log(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Logging a single line message.
     * This endpoint will write a single-line log message, including a level and source to the main Plex Media Server log.
     * 
     * @param level An integer log level to write to the PMS log with.  
    0: Error  
    1: Warning  
    2: Info  
    3: Debug  
    4: Verbose

     * @param message The text of the message to write to the log.
     * @param source a string indicating the source of the message.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.LogLineResponse logLine(lukehagar.plexapi.plexapi.models.operations.Level level, String message, String source) throws Exception {
        lukehagar.plexapi.plexapi.models.operations.LogLineRequest request = new lukehagar.plexapi.plexapi.models.operations.LogLineRequest(level, message, source);
        
        String baseUrl = lukehagar.plexapi.plexapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = lukehagar.plexapi.plexapi.utils.Utils.generateURL(baseUrl, "/log");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = lukehagar.plexapi.plexapi.utils.Utils.getQueryParams(lukehagar.plexapi.plexapi.models.operations.LogLineRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        lukehagar.plexapi.plexapi.models.operations.LogLineResponse res = new lukehagar.plexapi.plexapi.models.operations.LogLineResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.LogLineResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), lukehagar.plexapi.plexapi.models.operations.LogLineResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Logging a multi-line message
     * This endpoint allows for the batch addition of log entries to the main Plex Media Server log.  
     * It accepts a text/plain request body, where each line represents a distinct log entry.  
     * Each log entry consists of URL-encoded key-value pairs, specifying log attributes such as 'level', 'message', and 'source'.  
     * 
     * Log entries are separated by a newline character (`\n`).  
     * Each entry's parameters should be URL-encoded to ensure accurate parsing and handling of special characters.  
     * This method is efficient for logging multiple entries in a single API call, reducing the overhead of multiple individual requests.  
     * 
     * The 'level' parameter specifies the log entry's severity or importance, with the following integer values:
     * - `0`: Error - Critical issues that require immediate attention.
     * - `1`: Warning - Important events that are not critical but may indicate potential issues.
     * - `2`: Info - General informational messages about system operation.
     * - `3`: Debug - Detailed information useful for debugging purposes.
     * - `4`: Verbose - Highly detailed diagnostic information for in-depth analysis.
     * 
     * The 'message' parameter contains the log text, and 'source' identifies the log message's origin (e.g., an application name or module).
     * 
     * Example of a single log entry format:
     * `level=4&amp;message=Sample%20log%20entry&amp;source=applicationName`
     * 
     * Ensure each parameter is properly URL-encoded to avoid interpretation issues.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.LogMultiLineResponse logMultiLine(String request) throws Exception {
        String baseUrl = lukehagar.plexapi.plexapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = lukehagar.plexapi.plexapi.utils.Utils.generateURL(baseUrl, "/log");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = lukehagar.plexapi.plexapi.utils.Utils.serializeRequestBody(request, "request", "string");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        lukehagar.plexapi.plexapi.models.operations.LogMultiLineResponse res = new lukehagar.plexapi.plexapi.models.operations.LogMultiLineResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.LogMultiLineResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), lukehagar.plexapi.plexapi.models.operations.LogMultiLineResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Enabling Papertrail
     * This endpoint will enable all Plex Media Serverlogs to be sent to the Papertrail networked logging site for a period of time.
     * 
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.EnablePaperTrailResponse enablePaperTrail() throws Exception {
        String baseUrl = lukehagar.plexapi.plexapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = lukehagar.plexapi.plexapi.utils.Utils.generateURL(baseUrl, "/log/networked");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        lukehagar.plexapi.plexapi.models.operations.EnablePaperTrailResponse res = new lukehagar.plexapi.plexapi.models.operations.EnablePaperTrailResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400 || httpRes.statusCode() == 403) {
        }
        else if (httpRes.statusCode() == 401) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.EnablePaperTrailResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), lukehagar.plexapi.plexapi.models.operations.EnablePaperTrailResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }
}