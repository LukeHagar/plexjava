/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.models.errors.GetBandwidthStatisticsBadRequest;
import dev.plexapi.sdk.models.errors.GetBandwidthStatisticsUnauthorized;
import dev.plexapi.sdk.models.errors.GetResourcesStatisticsBadRequest;
import dev.plexapi.sdk.models.errors.GetResourcesStatisticsUnauthorized;
import dev.plexapi.sdk.models.errors.GetStatisticsBadRequest;
import dev.plexapi.sdk.models.errors.GetStatisticsUnauthorized;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetBandwidthStatisticsRequest;
import dev.plexapi.sdk.models.operations.GetBandwidthStatisticsRequestBuilder;
import dev.plexapi.sdk.models.operations.GetBandwidthStatisticsResponse;
import dev.plexapi.sdk.models.operations.GetBandwidthStatisticsResponseBody;
import dev.plexapi.sdk.models.operations.GetResourcesStatisticsRequest;
import dev.plexapi.sdk.models.operations.GetResourcesStatisticsRequestBuilder;
import dev.plexapi.sdk.models.operations.GetResourcesStatisticsResponse;
import dev.plexapi.sdk.models.operations.GetResourcesStatisticsResponseBody;
import dev.plexapi.sdk.models.operations.GetStatisticsRequest;
import dev.plexapi.sdk.models.operations.GetStatisticsRequestBuilder;
import dev.plexapi.sdk.models.operations.GetStatisticsResponse;
import dev.plexapi.sdk.models.operations.GetStatisticsResponseBody;
import dev.plexapi.sdk.models.operations.SDKMethodInterfaces.*;
import dev.plexapi.sdk.utils.HTTPClient;
import dev.plexapi.sdk.utils.HTTPRequest;
import dev.plexapi.sdk.utils.Hook.AfterErrorContextImpl;
import dev.plexapi.sdk.utils.Hook.AfterSuccessContextImpl;
import dev.plexapi.sdk.utils.Hook.BeforeRequestContextImpl;
import dev.plexapi.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Long;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

/**
 * API Calls that perform operations with Plex Media Server Statistics
 * 
 */
public class Statistics implements
            MethodCallGetStatistics,
            MethodCallGetResourcesStatistics,
            MethodCallGetBandwidthStatistics {

    private final SDKConfiguration sdkConfiguration;

    Statistics(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get Media Statistics
     * This will return the media statistics for the server
     * @return The call builder
     */
    public GetStatisticsRequestBuilder getStatistics() {
        return new GetStatisticsRequestBuilder(this);
    }

    /**
     * Get Media Statistics
     * This will return the media statistics for the server
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetStatisticsResponse getStatisticsDirect() throws Exception {
        return getStatistics(Optional.empty());
    }
    
    /**
     * Get Media Statistics
     * This will return the media statistics for the server
     * @param timespan The timespan to retrieve statistics for
    the exact meaning of this parameter is not known

     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetStatisticsResponse getStatistics(
            Optional<Long> timespan) throws Exception {
        GetStatisticsRequest request =
            GetStatisticsRequest
                .builder()
                .timespan(timespan)
                .build();
        
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/statistics/media");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetStatisticsRequest.class,
                request, 
                null));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "getStatistics", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getStatistics",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getStatistics",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getStatistics",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetStatisticsResponse.Builder _resBuilder = 
            GetStatisticsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetStatisticsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetStatisticsResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetStatisticsResponseBody>() {});
                _res.withObject(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetStatisticsBadRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetStatisticsBadRequest>() {});
                    _out.withRawResponse(Optional.ofNullable(_httpRes));
                
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetStatisticsUnauthorized _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetStatisticsUnauthorized>() {});
                    _out.withRawResponse(Optional.ofNullable(_httpRes));
                
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Get Resources Statistics
     * This will return the resources for the server
     * @return The call builder
     */
    public GetResourcesStatisticsRequestBuilder getResourcesStatistics() {
        return new GetResourcesStatisticsRequestBuilder(this);
    }

    /**
     * Get Resources Statistics
     * This will return the resources for the server
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetResourcesStatisticsResponse getResourcesStatisticsDirect() throws Exception {
        return getResourcesStatistics(Optional.empty());
    }
    
    /**
     * Get Resources Statistics
     * This will return the resources for the server
     * @param timespan The timespan to retrieve statistics for
    the exact meaning of this parameter is not known

     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetResourcesStatisticsResponse getResourcesStatistics(
            Optional<Long> timespan) throws Exception {
        GetResourcesStatisticsRequest request =
            GetResourcesStatisticsRequest
                .builder()
                .timespan(timespan)
                .build();
        
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/statistics/resources");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetResourcesStatisticsRequest.class,
                request, 
                null));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "getResourcesStatistics", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getResourcesStatistics",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getResourcesStatistics",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getResourcesStatistics",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetResourcesStatisticsResponse.Builder _resBuilder = 
            GetResourcesStatisticsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetResourcesStatisticsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetResourcesStatisticsResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetResourcesStatisticsResponseBody>() {});
                _res.withObject(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetResourcesStatisticsBadRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetResourcesStatisticsBadRequest>() {});
                    _out.withRawResponse(Optional.ofNullable(_httpRes));
                
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetResourcesStatisticsUnauthorized _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetResourcesStatisticsUnauthorized>() {});
                    _out.withRawResponse(Optional.ofNullable(_httpRes));
                
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Get Bandwidth Statistics
     * This will return the bandwidth statistics for the server
     * @return The call builder
     */
    public GetBandwidthStatisticsRequestBuilder getBandwidthStatistics() {
        return new GetBandwidthStatisticsRequestBuilder(this);
    }

    /**
     * Get Bandwidth Statistics
     * This will return the bandwidth statistics for the server
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetBandwidthStatisticsResponse getBandwidthStatisticsDirect() throws Exception {
        return getBandwidthStatistics(Optional.empty());
    }
    
    /**
     * Get Bandwidth Statistics
     * This will return the bandwidth statistics for the server
     * @param timespan The timespan to retrieve statistics for
    the exact meaning of this parameter is not known

     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetBandwidthStatisticsResponse getBandwidthStatistics(
            Optional<Long> timespan) throws Exception {
        GetBandwidthStatisticsRequest request =
            GetBandwidthStatisticsRequest
                .builder()
                .timespan(timespan)
                .build();
        
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/statistics/bandwidth");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetBandwidthStatisticsRequest.class,
                request, 
                null));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "getBandwidthStatistics", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getBandwidthStatistics",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getBandwidthStatistics",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getBandwidthStatistics",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetBandwidthStatisticsResponse.Builder _resBuilder = 
            GetBandwidthStatisticsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetBandwidthStatisticsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetBandwidthStatisticsResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetBandwidthStatisticsResponseBody>() {});
                _res.withObject(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetBandwidthStatisticsBadRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetBandwidthStatisticsBadRequest>() {});
                    _out.withRawResponse(Optional.ofNullable(_httpRes));
                
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetBandwidthStatisticsUnauthorized _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetBandwidthStatisticsUnauthorized>() {});
                    _out.withRawResponse(Optional.ofNullable(_httpRes));
                
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
