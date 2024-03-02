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
 * API Calls that perform operations with Plex Media Server Statistics
 * 
 */
public class Statistics {
	
	private SDKConfiguration sdkConfiguration;

	public Statistics(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get Media Statistics
     * This will return the media statistics for the server
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.GetStatisticsResponse getStatistics() throws Exception {
        return this.getStatistics(null);
    }

    /**
     * Get Media Statistics
     * This will return the media statistics for the server
     * @param timespan The timespan to retrieve statistics for
    the exact meaning of this parameter is not known

     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.GetStatisticsResponse getStatistics(Long timespan) throws Exception {
        lukehagar.plexapi.plexapi.models.operations.GetStatisticsRequest request = new lukehagar.plexapi.plexapi.models.operations.GetStatisticsRequest();
        request.timespan=timespan;
        
        String baseUrl = lukehagar.plexapi.plexapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = lukehagar.plexapi.plexapi.utils.Utils.generateURL(baseUrl, "/statistics/media");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = lukehagar.plexapi.plexapi.utils.Utils.getQueryParams(lukehagar.plexapi.plexapi.models.operations.GetStatisticsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        lukehagar.plexapi.plexapi.models.operations.GetStatisticsResponse res = new lukehagar.plexapi.plexapi.models.operations.GetStatisticsResponse(contentType, httpRes.statusCode(), httpRes) {{
            twoHundredApplicationJsonObject = null;
            fourHundredAndOneApplicationJsonObject = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.GetStatisticsResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), lukehagar.plexapi.plexapi.models.operations.GetStatisticsResponseBody.class);
                res.twoHundredApplicationJsonObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.GetStatisticsStatisticsResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), lukehagar.plexapi.plexapi.models.operations.GetStatisticsStatisticsResponseBody.class);
                res.fourHundredAndOneApplicationJsonObject = out;
            }
        }

        return res;
    }
}