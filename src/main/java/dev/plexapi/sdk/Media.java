/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.models.errors.GetBannerImageBadRequest;
import dev.plexapi.sdk.models.errors.GetBannerImageUnauthorized;
import dev.plexapi.sdk.models.errors.GetThumbImageBadRequest;
import dev.plexapi.sdk.models.errors.GetThumbImageUnauthorized;
import dev.plexapi.sdk.models.errors.MarkPlayedBadRequest;
import dev.plexapi.sdk.models.errors.MarkPlayedUnauthorized;
import dev.plexapi.sdk.models.errors.MarkUnplayedBadRequest;
import dev.plexapi.sdk.models.errors.MarkUnplayedUnauthorized;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.errors.UpdatePlayProgressBadRequest;
import dev.plexapi.sdk.models.errors.UpdatePlayProgressUnauthorized;
import dev.plexapi.sdk.models.operations.GetBannerImageRequest;
import dev.plexapi.sdk.models.operations.GetBannerImageRequestBuilder;
import dev.plexapi.sdk.models.operations.GetBannerImageResponse;
import dev.plexapi.sdk.models.operations.GetThumbImageRequest;
import dev.plexapi.sdk.models.operations.GetThumbImageRequestBuilder;
import dev.plexapi.sdk.models.operations.GetThumbImageResponse;
import dev.plexapi.sdk.models.operations.MarkPlayedRequest;
import dev.plexapi.sdk.models.operations.MarkPlayedRequestBuilder;
import dev.plexapi.sdk.models.operations.MarkPlayedResponse;
import dev.plexapi.sdk.models.operations.MarkUnplayedRequest;
import dev.plexapi.sdk.models.operations.MarkUnplayedRequestBuilder;
import dev.plexapi.sdk.models.operations.MarkUnplayedResponse;
import dev.plexapi.sdk.models.operations.SDKMethodInterfaces.*;
import dev.plexapi.sdk.models.operations.UpdatePlayProgressRequest;
import dev.plexapi.sdk.models.operations.UpdatePlayProgressRequestBuilder;
import dev.plexapi.sdk.models.operations.UpdatePlayProgressResponse;
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
import java.util.List;
import java.util.Optional;

/**
 * API Calls interacting with Plex Media Server Media
 */
public class Media implements
            MethodCallMarkPlayed,
            MethodCallMarkUnplayed,
            MethodCallUpdatePlayProgress,
            MethodCallGetBannerImage,
            MethodCallGetThumbImage {

    private final SDKConfiguration sdkConfiguration;

    Media(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Mark Media Played
     * 
     * <p>This will mark the provided media key as Played.
     * 
     * @return The call builder
     */
    public MarkPlayedRequestBuilder markPlayed() {
        return new MarkPlayedRequestBuilder(this);
    }

    /**
     * Mark Media Played
     * 
     * <p>This will mark the provided media key as Played.
     * 
     * @param key The media key to mark as played
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public MarkPlayedResponse markPlayed(
            double key) throws Exception {
        MarkPlayedRequest request =
            MarkPlayedRequest
                .builder()
                .key(key)
                .build();
        
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl(), this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/:/scrobble");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                MarkPlayedRequest.class,
                request, 
                null));
        
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
                      "markPlayed", 
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
                            "markPlayed",
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
                            "markPlayed",
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
                            "markPlayed",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        MarkPlayedResponse.Builder _resBuilder = 
            MarkPlayedResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        MarkPlayedResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                MarkPlayedBadRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<MarkPlayedBadRequest>() {});
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
                MarkPlayedUnauthorized _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<MarkPlayedUnauthorized>() {});
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
     * Mark Media Unplayed
     * 
     * <p>This will mark the provided media key as Unplayed.
     * 
     * @return The call builder
     */
    public MarkUnplayedRequestBuilder markUnplayed() {
        return new MarkUnplayedRequestBuilder(this);
    }

    /**
     * Mark Media Unplayed
     * 
     * <p>This will mark the provided media key as Unplayed.
     * 
     * @param key The media key to mark as Unplayed
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public MarkUnplayedResponse markUnplayed(
            double key) throws Exception {
        MarkUnplayedRequest request =
            MarkUnplayedRequest
                .builder()
                .key(key)
                .build();
        
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl(), this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/:/unscrobble");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                MarkUnplayedRequest.class,
                request, 
                null));
        
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
                      "markUnplayed", 
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
                            "markUnplayed",
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
                            "markUnplayed",
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
                            "markUnplayed",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        MarkUnplayedResponse.Builder _resBuilder = 
            MarkUnplayedResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        MarkUnplayedResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                MarkUnplayedBadRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<MarkUnplayedBadRequest>() {});
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
                MarkUnplayedUnauthorized _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<MarkUnplayedUnauthorized>() {});
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
     * Update Media Play Progress
     * 
     * <p>This API command can be used to update the play progress of a media item.
     * 
     * @return The call builder
     */
    public UpdatePlayProgressRequestBuilder updatePlayProgress() {
        return new UpdatePlayProgressRequestBuilder(this);
    }

    /**
     * Update Media Play Progress
     * 
     * <p>This API command can be used to update the play progress of a media item.
     * 
     * @param key the media key
     * @param time The time, in milliseconds, used to set the media playback progress.
     * @param state The playback state of the media item.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdatePlayProgressResponse updatePlayProgress(
            String key,
            double time,
            String state) throws Exception {
        UpdatePlayProgressRequest request =
            UpdatePlayProgressRequest
                .builder()
                .key(key)
                .time(time)
                .state(state)
                .build();
        
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl(), this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/:/progress");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                UpdatePlayProgressRequest.class,
                request, 
                null));
        
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
                      "updatePlayProgress", 
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
                            "updatePlayProgress",
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
                            "updatePlayProgress",
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
                            "updatePlayProgress",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdatePlayProgressResponse.Builder _resBuilder = 
            UpdatePlayProgressResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdatePlayProgressResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                UpdatePlayProgressBadRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<UpdatePlayProgressBadRequest>() {});
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
                UpdatePlayProgressUnauthorized _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<UpdatePlayProgressUnauthorized>() {});
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
     * Get Banner Image
     * 
     * <p>Gets the banner image of the media item
     * 
     * @return The call builder
     */
    public GetBannerImageRequestBuilder getBannerImage() {
        return new GetBannerImageRequestBuilder(this);
    }

    /**
     * Get Banner Image
     * 
     * <p>Gets the banner image of the media item
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetBannerImageResponse getBannerImage(
            GetBannerImageRequest request) throws Exception {
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl(), this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                GetBannerImageRequest.class,
                _baseUrl,
                "/library/metadata/{ratingKey}/banner",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "image/jpeg")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetBannerImageRequest.class,
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
                      "get-banner-image", 
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
                            "get-banner-image",
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
                            "get-banner-image",
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
                            "get-banner-image",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetBannerImageResponse.Builder _resBuilder = 
            GetBannerImageResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200") && Utils.contentTypeMatches(_contentType, "image/jpeg")) {
            _resBuilder.responseStream(_httpRes.body());
        }

        GetBannerImageResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "image/jpeg")) {
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
                GetBannerImageBadRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetBannerImageBadRequest>() {});
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
                GetBannerImageUnauthorized _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetBannerImageUnauthorized>() {});
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
     * Get Thumb Image
     * 
     * <p>Gets the thumbnail image of the media item
     * 
     * @return The call builder
     */
    public GetThumbImageRequestBuilder getThumbImage() {
        return new GetThumbImageRequestBuilder(this);
    }

    /**
     * Get Thumb Image
     * 
     * <p>Gets the thumbnail image of the media item
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetThumbImageResponse getThumbImage(
            GetThumbImageRequest request) throws Exception {
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl(), this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                GetThumbImageRequest.class,
                _baseUrl,
                "/library/metadata/{ratingKey}/thumb",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "image/jpeg")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetThumbImageRequest.class,
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
                      "get-thumb-image", 
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
                            "get-thumb-image",
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
                            "get-thumb-image",
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
                            "get-thumb-image",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetThumbImageResponse.Builder _resBuilder = 
            GetThumbImageResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200") && Utils.contentTypeMatches(_contentType, "image/jpeg")) {
            _resBuilder.responseStream(_httpRes.body());
        }

        GetThumbImageResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "image/jpeg")) {
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
                GetThumbImageBadRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetThumbImageBadRequest>() {});
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
                GetThumbImageUnauthorized _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetThumbImageUnauthorized>() {});
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
