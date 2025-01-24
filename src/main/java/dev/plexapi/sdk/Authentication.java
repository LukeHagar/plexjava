/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.models.errors.GetSourceConnectionInformationBadRequest;
import dev.plexapi.sdk.models.errors.GetSourceConnectionInformationUnauthorized;
import dev.plexapi.sdk.models.errors.GetTokenDetailsBadRequest;
import dev.plexapi.sdk.models.errors.GetTokenDetailsUnauthorized;
import dev.plexapi.sdk.models.errors.GetTransientTokenBadRequest;
import dev.plexapi.sdk.models.errors.GetTransientTokenUnauthorized;
import dev.plexapi.sdk.models.errors.PostUsersSignInDataBadRequest;
import dev.plexapi.sdk.models.errors.PostUsersSignInDataUnauthorized;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetSourceConnectionInformationRequest;
import dev.plexapi.sdk.models.operations.GetSourceConnectionInformationRequestBuilder;
import dev.plexapi.sdk.models.operations.GetSourceConnectionInformationResponse;
import dev.plexapi.sdk.models.operations.GetTokenDetailsRequestBuilder;
import dev.plexapi.sdk.models.operations.GetTokenDetailsResponse;
import dev.plexapi.sdk.models.operations.GetTokenDetailsUserPlexAccount;
import dev.plexapi.sdk.models.operations.GetTransientTokenQueryParamType;
import dev.plexapi.sdk.models.operations.GetTransientTokenRequest;
import dev.plexapi.sdk.models.operations.GetTransientTokenRequestBuilder;
import dev.plexapi.sdk.models.operations.GetTransientTokenResponse;
import dev.plexapi.sdk.models.operations.PostUsersSignInDataRequest;
import dev.plexapi.sdk.models.operations.PostUsersSignInDataRequestBuilder;
import dev.plexapi.sdk.models.operations.PostUsersSignInDataResponse;
import dev.plexapi.sdk.models.operations.PostUsersSignInDataUserPlexAccount;
import dev.plexapi.sdk.models.operations.SDKMethodInterfaces.*;
import dev.plexapi.sdk.models.operations.Scope;
import dev.plexapi.sdk.utils.HTTPClient;
import dev.plexapi.sdk.utils.HTTPRequest;
import dev.plexapi.sdk.utils.Hook.AfterErrorContextImpl;
import dev.plexapi.sdk.utils.Hook.AfterSuccessContextImpl;
import dev.plexapi.sdk.utils.Hook.BeforeRequestContextImpl;
import dev.plexapi.sdk.utils.SerializedBody;
import dev.plexapi.sdk.utils.Utils.JsonShape;
import dev.plexapi.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Optional; 

/**
 * API Calls regarding authentication for Plex Media Server
 * 
 */
public class Authentication implements
            MethodCallGetTransientToken,
            MethodCallGetSourceConnectionInformation,
            MethodCallGetTokenDetails,
            MethodCallPostUsersSignInData {
    
    /**
     * GET_TOKEN_DETAILS_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] GET_TOKEN_DETAILS_SERVERS = {
        "https://plex.tv/api/v2",
    };
    
    /**
     * POST_USERS_SIGN_IN_DATA_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] POST_USERS_SIGN_IN_DATA_SERVERS = {
        "https://plex.tv/api/v2",
    };

    private final SDKConfiguration sdkConfiguration;

    Authentication(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get a Transient Token
     * This endpoint provides the caller with a temporary token with the same access level as the caller's token. These tokens are valid for up to 48 hours and are destroyed if the server instance is restarted.
     * 
     * @return The call builder
     */
    public GetTransientTokenRequestBuilder getTransientToken() {
        return new GetTransientTokenRequestBuilder(this);
    }

    /**
     * Get a Transient Token
     * This endpoint provides the caller with a temporary token with the same access level as the caller's token. These tokens are valid for up to 48 hours and are destroyed if the server instance is restarted.
     * 
     * @param type `delegation` - This is the only supported `type` parameter.
     * @param scope `all` - This is the only supported `scope` parameter.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetTransientTokenResponse getTransientToken(
            GetTransientTokenQueryParamType type,
            Scope scope) throws Exception {
        GetTransientTokenRequest request =
            GetTransientTokenRequest
                .builder()
                .type(type)
                .scope(scope)
                .build();
        
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/security/token");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetTransientTokenRequest.class,
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
                      "getTransientToken", 
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
                            "getTransientToken",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getTransientToken",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getTransientToken",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetTransientTokenResponse.Builder _resBuilder = 
            GetTransientTokenResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetTransientTokenResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetTransientTokenBadRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetTransientTokenBadRequest>() {});
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
                GetTransientTokenUnauthorized _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetTransientTokenUnauthorized>() {});
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
     * Get Source Connection Information
     * If a caller requires connection details and a transient token for a source that is known to the server, for example a cloud media provider or shared PMS, then this endpoint can be called. This endpoint is only accessible with either an admin token or a valid transient token generated from an admin token.
     * Note: requires Plex Media Server &gt;= 1.15.4.
     * 
     * @return The call builder
     */
    public GetSourceConnectionInformationRequestBuilder getSourceConnectionInformation() {
        return new GetSourceConnectionInformationRequestBuilder(this);
    }

    /**
     * Get Source Connection Information
     * If a caller requires connection details and a transient token for a source that is known to the server, for example a cloud media provider or shared PMS, then this endpoint can be called. This endpoint is only accessible with either an admin token or a valid transient token generated from an admin token.
     * Note: requires Plex Media Server &gt;= 1.15.4.
     * 
     * @param source The source identifier with an included prefix.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetSourceConnectionInformationResponse getSourceConnectionInformation(
            String source) throws Exception {
        GetSourceConnectionInformationRequest request =
            GetSourceConnectionInformationRequest
                .builder()
                .source(source)
                .build();
        
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/security/resources");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetSourceConnectionInformationRequest.class,
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
                      "getSourceConnectionInformation", 
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
                            "getSourceConnectionInformation",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getSourceConnectionInformation",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getSourceConnectionInformation",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetSourceConnectionInformationResponse.Builder _resBuilder = 
            GetSourceConnectionInformationResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetSourceConnectionInformationResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetSourceConnectionInformationBadRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetSourceConnectionInformationBadRequest>() {});
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
                GetSourceConnectionInformationUnauthorized _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetSourceConnectionInformationUnauthorized>() {});
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
     * Get Token Details
     * Get the User data from the provided X-Plex-Token
     * @return The call builder
     */
    public GetTokenDetailsRequestBuilder getTokenDetails() {
        return new GetTokenDetailsRequestBuilder(this);
    }

    /**
     * Get Token Details
     * Get the User data from the provided X-Plex-Token
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetTokenDetailsResponse getTokenDetailsDirect() throws Exception {
        return getTokenDetails(Optional.empty());
    }
    
    /**
     * Get Token Details
     * Get the User data from the provided X-Plex-Token
     * @param serverURL Overrides the server URL.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetTokenDetailsResponse getTokenDetails(
            Optional<String> serverURL) throws Exception {
        String _baseUrl = Utils.templateUrl(GET_TOKEN_DETAILS_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                _baseUrl,
                "/user");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "getTokenDetails", 
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
                            "getTokenDetails",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getTokenDetails",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getTokenDetails",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetTokenDetailsResponse.Builder _resBuilder = 
            GetTokenDetailsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetTokenDetailsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetTokenDetailsUserPlexAccount _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetTokenDetailsUserPlexAccount>() {});
                _res.withUserPlexAccount(Optional.ofNullable(_out));
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
                GetTokenDetailsBadRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetTokenDetailsBadRequest>() {});
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
                GetTokenDetailsUnauthorized _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetTokenDetailsUnauthorized>() {});
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
     * Get User Sign In Data
     * Sign in user with username and password and return user data with Plex authentication token
     * @return The call builder
     */
    public PostUsersSignInDataRequestBuilder postUsersSignInData() {
        return new PostUsersSignInDataRequestBuilder(this);
    }

    /**
     * Get User Sign In Data
     * Sign in user with username and password and return user data with Plex authentication token
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PostUsersSignInDataResponse postUsersSignInData(
            PostUsersSignInDataRequest request) throws Exception {
        return postUsersSignInData(request, Optional.empty());
    }
    
    /**
     * Get User Sign In Data
     * Sign in user with username and password and return user data with Plex authentication token
     * @param request The request object containing all of the parameters for the API call.
     * @param serverURL Overrides the server URL.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PostUsersSignInDataResponse postUsersSignInData(
            PostUsersSignInDataRequest request,
            Optional<String> serverURL) throws Exception {
        String _baseUrl = Utils.templateUrl(POST_USERS_SIGN_IN_DATA_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                _baseUrl,
                "/users/signin");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<PostUsersSignInDataRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "requestBody",
                "form",
                false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));
        Optional<SecuritySource> _hookSecuritySource = Optional.empty();
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "post-users-sign-in-data", 
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
                            "post-users-sign-in-data",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "post-users-sign-in-data",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "post-users-sign-in-data",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        PostUsersSignInDataResponse.Builder _resBuilder = 
            PostUsersSignInDataResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        PostUsersSignInDataResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                PostUsersSignInDataUserPlexAccount _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<PostUsersSignInDataUserPlexAccount>() {});
                _res.withUserPlexAccount(Optional.ofNullable(_out));
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
                PostUsersSignInDataBadRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<PostUsersSignInDataBadRequest>() {});
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
                PostUsersSignInDataUnauthorized _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<PostUsersSignInDataUnauthorized>() {});
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
