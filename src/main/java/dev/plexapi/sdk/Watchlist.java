/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.models.errors.GetWatchListBadRequest;
import dev.plexapi.sdk.models.errors.GetWatchListUnauthorized;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetWatchListRequest;
import dev.plexapi.sdk.models.operations.GetWatchListRequestBuilder;
import dev.plexapi.sdk.models.operations.GetWatchListResponse;
import dev.plexapi.sdk.models.operations.GetWatchListResponseBody;
import dev.plexapi.sdk.models.operations.SDKMethodInterfaces.*;
import dev.plexapi.sdk.utils.HTTPClient;
import dev.plexapi.sdk.utils.HTTPRequest;
import dev.plexapi.sdk.utils.Hook.AfterErrorContextImpl;
import dev.plexapi.sdk.utils.Hook.AfterSuccessContextImpl;
import dev.plexapi.sdk.utils.Hook.BeforeRequestContextImpl;
import dev.plexapi.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 * API Calls that perform operations with Plex Media Server Watchlists
 */
public class Watchlist implements
            MethodCallGetWatchList {
    
    /**
     * GET_WATCH_LIST_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] GET_WATCH_LIST_SERVERS = {
        /**
         * The plex metadata provider server
         */
        "https://metadata.provider.plex.tv",
    };

    private final SDKConfiguration sdkConfiguration;

    Watchlist(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get User Watchlist
     * 
     * <p>Get User Watchlist
     * 
     * @return The call builder
     */
    public GetWatchListRequestBuilder getWatchList() {
        return new GetWatchListRequestBuilder(this);
    }

    /**
     * Get User Watchlist
     * 
     * <p>Get User Watchlist
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetWatchListResponse getWatchList(
            GetWatchListRequest request) throws Exception {
        return getWatchList(request, Optional.empty());
    }
    
    /**
     * Get User Watchlist
     * 
     * <p>Get User Watchlist
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @param serverURL Overrides the server URL.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetWatchListResponse getWatchList(
            GetWatchListRequest request,
            Optional<String> serverURL) throws Exception {
        final String _baseUrl;
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        } else {
            _baseUrl = Utils.templateUrl(GET_WATCH_LIST_SERVERS[0], new HashMap<String, String>());
        }
        String _url = Utils.generateURL(
                GetWatchListRequest.class,
                _baseUrl,
                "/library/sections/watchlist/{filter}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetWatchListRequest.class,
                request, 
                null));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));
        
        Optional<SecuritySource> _hookSecuritySource = Optional.of(this.sdkConfiguration.securitySource());
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource().getSecurity());
        HTTPClient _client = this.sdkConfiguration.client();
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      this.sdkConfiguration,
                      _baseUrl,
                      "get-watch-list", 
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
                            this.sdkConfiguration,
                            _baseUrl,
                            "get-watch-list",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            this.sdkConfiguration,
                            _baseUrl,
                            "get-watch-list",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            this.sdkConfiguration,
                            _baseUrl,
                            "get-watch-list",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetWatchListResponse.Builder _resBuilder = 
            GetWatchListResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetWatchListResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetWatchListResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetWatchListResponseBody>() {});
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
                GetWatchListBadRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetWatchListBadRequest>() {});
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
                GetWatchListUnauthorized _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetWatchListUnauthorized>() {});
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
