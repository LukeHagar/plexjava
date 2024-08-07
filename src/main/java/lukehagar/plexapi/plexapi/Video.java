/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import lukehagar.plexapi.plexapi.models.errors.SDKError;
import lukehagar.plexapi.plexapi.models.operations.SDKMethodInterfaces.*;
import lukehagar.plexapi.plexapi.utils.HTTPClient;
import lukehagar.plexapi.plexapi.utils.HTTPRequest;
import lukehagar.plexapi.plexapi.utils.Hook.AfterErrorContextImpl;
import lukehagar.plexapi.plexapi.utils.Hook.AfterSuccessContextImpl;
import lukehagar.plexapi.plexapi.utils.Hook.BeforeRequestContextImpl;
import lukehagar.plexapi.plexapi.utils.JSON;
import lukehagar.plexapi.plexapi.utils.Retries.NonRetryableException;
import lukehagar.plexapi.plexapi.utils.Utils;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * API Calls that perform operations with Plex Media Server Videos
 * 
 */
public class Video implements
            MethodCallGetTimeline,
            MethodCallStartUniversalTranscode {

    private final SDKConfiguration sdkConfiguration;

    Video(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get the timeline for a media item
     * Get the timeline for a media item
     * @return The call builder
     */
    public lukehagar.plexapi.plexapi.models.operations.GetTimelineRequestBuilder getTimeline() {
        return new lukehagar.plexapi.plexapi.models.operations.GetTimelineRequestBuilder(this);
    }

    /**
     * Get the timeline for a media item
     * Get the timeline for a media item
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.GetTimelineResponse getTimeline(
            lukehagar.plexapi.plexapi.models.operations.GetTimelineRequest request) throws Exception {
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/:/timeline");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                lukehagar.plexapi.plexapi.models.operations.GetTimelineRequest.class,
                request, 
                this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("getTimeline", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("getTimeline", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("getTimeline", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("getTimeline", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        lukehagar.plexapi.plexapi.models.operations.GetTimelineResponse.Builder _resBuilder = 
            lukehagar.plexapi.plexapi.models.operations.GetTimelineResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        lukehagar.plexapi.plexapi.models.operations.GetTimelineResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                lukehagar.plexapi.plexapi.models.errors.GetTimelineResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.errors.GetTimelineResponseBody>() {});
                    _out.withRawResponse(java.util.Optional.ofNullable(_httpRes));
                
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }



    /**
     * Start Universal Transcode
     * Begin a Universal Transcode Session
     * @return The call builder
     */
    public lukehagar.plexapi.plexapi.models.operations.StartUniversalTranscodeRequestBuilder startUniversalTranscode() {
        return new lukehagar.plexapi.plexapi.models.operations.StartUniversalTranscodeRequestBuilder(this);
    }

    /**
     * Start Universal Transcode
     * Begin a Universal Transcode Session
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.StartUniversalTranscodeResponse startUniversalTranscode(
            lukehagar.plexapi.plexapi.models.operations.StartUniversalTranscodeRequest request) throws Exception {
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/video/:/transcode/universal/start.mpd");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                lukehagar.plexapi.plexapi.models.operations.StartUniversalTranscodeRequest.class,
                request, 
                this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("startUniversalTranscode", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("startUniversalTranscode", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("startUniversalTranscode", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("startUniversalTranscode", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        lukehagar.plexapi.plexapi.models.operations.StartUniversalTranscodeResponse.Builder _resBuilder = 
            lukehagar.plexapi.plexapi.models.operations.StartUniversalTranscodeResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        lukehagar.plexapi.plexapi.models.operations.StartUniversalTranscodeResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                lukehagar.plexapi.plexapi.models.errors.StartUniversalTranscodeResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.errors.StartUniversalTranscodeResponseBody>() {});
                    _out.withRawResponse(java.util.Optional.ofNullable(_httpRes));
                
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }

}
