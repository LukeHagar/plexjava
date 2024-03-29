/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import lukehagar.plexapi.plexapi.models.errors.SDKError;
import lukehagar.plexapi.plexapi.models.operations.SDKMethodInterfaces.*;
import lukehagar.plexapi.plexapi.utils.HTTPClient;
import lukehagar.plexapi.plexapi.utils.HTTPRequest;
import lukehagar.plexapi.plexapi.utils.JSON;
import lukehagar.plexapi.plexapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * API Calls that perform search operations with Plex Media Server Sessions
 * 
 */
public class Sessions implements
            MethodCallGetSessions,
            MethodCallGetSessionHistory,
            MethodCallGetTranscodeSessions,
            MethodCallStopTranscodeSession {

    private final SDKConfiguration sdkConfiguration;

    Sessions(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public lukehagar.plexapi.plexapi.models.operations.GetSessionsRequestBuilder getSessions() {
        return new lukehagar.plexapi.plexapi.models.operations.GetSessionsRequestBuilder(this);
    }

    /**
     * Get Active Sessions
     * This will retrieve the "Now Playing" Information of the PMS.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public lukehagar.plexapi.plexapi.models.operations.GetSessionsResponse getSessionsDirect() throws Exception {

        String baseUrl = lukehagar.plexapi.plexapi.utils.Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());

        String url = lukehagar.plexapi.plexapi.utils.Utils.generateURL(
                baseUrl,
                "/status/sessions");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = lukehagar.plexapi.plexapi.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        lukehagar.plexapi.plexapi.models.operations.GetSessionsResponse.Builder resBuilder = 
            lukehagar.plexapi.plexapi.models.operations.GetSessionsResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        lukehagar.plexapi.plexapi.models.operations.GetSessionsResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.GetSessionsResponseBody out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.operations.GetSessionsResponseBody>() {});
                res.withTwoHundredApplicationJsonObject(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400) {
        } else if (httpRes.statusCode() == 401) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.GetSessionsSessionsResponseBody out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.operations.GetSessionsSessionsResponseBody>() {});
                res.withFourHundredAndOneApplicationJsonObject(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public lukehagar.plexapi.plexapi.models.operations.GetSessionHistoryRequestBuilder getSessionHistory() {
        return new lukehagar.plexapi.plexapi.models.operations.GetSessionHistoryRequestBuilder(this);
    }

    /**
     * Get Session History
     * This will Retrieve a listing of all history views.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public lukehagar.plexapi.plexapi.models.operations.GetSessionHistoryResponse getSessionHistoryDirect() throws Exception {

        String baseUrl = lukehagar.plexapi.plexapi.utils.Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());

        String url = lukehagar.plexapi.plexapi.utils.Utils.generateURL(
                baseUrl,
                "/status/sessions/history/all");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = lukehagar.plexapi.plexapi.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        lukehagar.plexapi.plexapi.models.operations.GetSessionHistoryResponse.Builder resBuilder = 
            lukehagar.plexapi.plexapi.models.operations.GetSessionHistoryResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        lukehagar.plexapi.plexapi.models.operations.GetSessionHistoryResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.GetSessionHistoryResponseBody out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.operations.GetSessionHistoryResponseBody>() {});
                res.withTwoHundredApplicationJsonObject(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400) {
        } else if (httpRes.statusCode() == 401) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.GetSessionHistorySessionsResponseBody out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.operations.GetSessionHistorySessionsResponseBody>() {});
                res.withFourHundredAndOneApplicationJsonObject(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public lukehagar.plexapi.plexapi.models.operations.GetTranscodeSessionsRequestBuilder getTranscodeSessions() {
        return new lukehagar.plexapi.plexapi.models.operations.GetTranscodeSessionsRequestBuilder(this);
    }

    /**
     * Get Transcode Sessions
     * Get Transcode Sessions
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public lukehagar.plexapi.plexapi.models.operations.GetTranscodeSessionsResponse getTranscodeSessionsDirect() throws Exception {

        String baseUrl = lukehagar.plexapi.plexapi.utils.Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());

        String url = lukehagar.plexapi.plexapi.utils.Utils.generateURL(
                baseUrl,
                "/transcode/sessions");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = lukehagar.plexapi.plexapi.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        lukehagar.plexapi.plexapi.models.operations.GetTranscodeSessionsResponse.Builder resBuilder = 
            lukehagar.plexapi.plexapi.models.operations.GetTranscodeSessionsResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        lukehagar.plexapi.plexapi.models.operations.GetTranscodeSessionsResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.GetTranscodeSessionsResponseBody out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.operations.GetTranscodeSessionsResponseBody>() {});
                res.withTwoHundredApplicationJsonObject(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400) {
        } else if (httpRes.statusCode() == 401) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.GetTranscodeSessionsSessionsResponseBody out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.operations.GetTranscodeSessionsSessionsResponseBody>() {});
                res.withFourHundredAndOneApplicationJsonObject(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public lukehagar.plexapi.plexapi.models.operations.StopTranscodeSessionRequestBuilder stopTranscodeSession() {
        return new lukehagar.plexapi.plexapi.models.operations.StopTranscodeSessionRequestBuilder(this);
    }

    /**
     * Stop a Transcode Session
     * Stop a Transcode Session
     * @param sessionKey the Key of the transcode session to stop
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public lukehagar.plexapi.plexapi.models.operations.StopTranscodeSessionResponse stopTranscodeSession(
            String sessionKey) throws Exception {
        lukehagar.plexapi.plexapi.models.operations.StopTranscodeSessionRequest request =
            lukehagar.plexapi.plexapi.models.operations.StopTranscodeSessionRequest
                .builder()
                .sessionKey(sessionKey)
                .build();
        

        String baseUrl = lukehagar.plexapi.plexapi.utils.Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());

        String url = lukehagar.plexapi.plexapi.utils.Utils.generateURL(
                lukehagar.plexapi.plexapi.models.operations.StopTranscodeSessionRequest.class,
                baseUrl,
                "/transcode/sessions/{sessionKey}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = lukehagar.plexapi.plexapi.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        lukehagar.plexapi.plexapi.models.operations.StopTranscodeSessionResponse.Builder resBuilder = 
            lukehagar.plexapi.plexapi.models.operations.StopTranscodeSessionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        lukehagar.plexapi.plexapi.models.operations.StopTranscodeSessionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 204 || httpRes.statusCode() == 400) {
        } else if (httpRes.statusCode() == 401) {
            if (lukehagar.plexapi.plexapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                lukehagar.plexapi.plexapi.models.operations.StopTranscodeSessionResponseBody out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.operations.StopTranscodeSessionResponseBody>() {});
                res.withObject(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

}
