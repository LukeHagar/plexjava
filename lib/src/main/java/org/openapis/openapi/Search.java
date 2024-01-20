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
 * API Calls that perform search operations with Plex Media Server
 * 
 */
public class Search {
	
	private SDKConfiguration sdkConfiguration;

	public Search(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Perform a search
     * This endpoint performs a search across all library sections, or a single section, and returns matches as hubs, split up by type. It performs spell checking, looks for partial matches, and orders the hubs based on quality of results. In addition, based on matches, it will return other related matches (e.g. for a genre match, it may return movies in that genre, or for an actor match, movies with that actor).
     * 
     * In the response's items, the following extra attributes are returned to further describe or disambiguate the result:
     * 
     * - `reason`: The reason for the result, if not because of a direct search term match; can be either:
     *   - `section`: There are multiple identical results from different sections.
     *   - `originalTitle`: There was a search term match from the original title field (sometimes those can be very different or in a foreign language).
     *   - `&lt;hub identifier&gt;`: If the reason for the result is due to a result in another hub, the source hub identifier is returned. For example, if the search is for "dylan" then Bob Dylan may be returned as an artist result, an a few of his albums returned as album results with a reason code of `artist` (the identifier of that particular hub). Or if the search is for "arnold", there might be movie results returned with a reason of `actor`
     * - `reasonTitle`: The string associated with the reason code. For a section reason, it'll be the section name; For a hub identifier, it'll be a string associated with the match (e.g. `Arnold Schwarzenegger` for movies which were returned because the search was for "arnold").
     * - `reasonID`: The ID of the item associated with the reason for the result. This might be a section ID, a tag ID, an artist ID, or a show ID.
     * 
     * This request is intended to be very fast, and called as the user types.
     * 
     * @param query The query term
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.PerformSearchResponse performSearch(String query) throws Exception {
        return this.performSearch(query, null, null);
    }

    /**
     * Perform a search
     * This endpoint performs a search across all library sections, or a single section, and returns matches as hubs, split up by type. It performs spell checking, looks for partial matches, and orders the hubs based on quality of results. In addition, based on matches, it will return other related matches (e.g. for a genre match, it may return movies in that genre, or for an actor match, movies with that actor).
     * 
     * In the response's items, the following extra attributes are returned to further describe or disambiguate the result:
     * 
     * - `reason`: The reason for the result, if not because of a direct search term match; can be either:
     *   - `section`: There are multiple identical results from different sections.
     *   - `originalTitle`: There was a search term match from the original title field (sometimes those can be very different or in a foreign language).
     *   - `&lt;hub identifier&gt;`: If the reason for the result is due to a result in another hub, the source hub identifier is returned. For example, if the search is for "dylan" then Bob Dylan may be returned as an artist result, an a few of his albums returned as album results with a reason code of `artist` (the identifier of that particular hub). Or if the search is for "arnold", there might be movie results returned with a reason of `actor`
     * - `reasonTitle`: The string associated with the reason code. For a section reason, it'll be the section name; For a hub identifier, it'll be a string associated with the match (e.g. `Arnold Schwarzenegger` for movies which were returned because the search was for "arnold").
     * - `reasonID`: The ID of the item associated with the reason for the result. This might be a section ID, a tag ID, an artist ID, or a show ID.
     * 
     * This request is intended to be very fast, and called as the user types.
     * 
     * @param query The query term
     * @param sectionId This gives context to the search, and can result in re-ordering of search result hubs
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.PerformSearchResponse performSearch(String query, Double sectionId) throws Exception {
        return this.performSearch(query, sectionId, null);
    }

    /**
     * Perform a search
     * This endpoint performs a search across all library sections, or a single section, and returns matches as hubs, split up by type. It performs spell checking, looks for partial matches, and orders the hubs based on quality of results. In addition, based on matches, it will return other related matches (e.g. for a genre match, it may return movies in that genre, or for an actor match, movies with that actor).
     * 
     * In the response's items, the following extra attributes are returned to further describe or disambiguate the result:
     * 
     * - `reason`: The reason for the result, if not because of a direct search term match; can be either:
     *   - `section`: There are multiple identical results from different sections.
     *   - `originalTitle`: There was a search term match from the original title field (sometimes those can be very different or in a foreign language).
     *   - `&lt;hub identifier&gt;`: If the reason for the result is due to a result in another hub, the source hub identifier is returned. For example, if the search is for "dylan" then Bob Dylan may be returned as an artist result, an a few of his albums returned as album results with a reason code of `artist` (the identifier of that particular hub). Or if the search is for "arnold", there might be movie results returned with a reason of `actor`
     * - `reasonTitle`: The string associated with the reason code. For a section reason, it'll be the section name; For a hub identifier, it'll be a string associated with the match (e.g. `Arnold Schwarzenegger` for movies which were returned because the search was for "arnold").
     * - `reasonID`: The ID of the item associated with the reason for the result. This might be a section ID, a tag ID, an artist ID, or a show ID.
     * 
     * This request is intended to be very fast, and called as the user types.
     * 
     * @param query The query term
     * @param sectionId This gives context to the search, and can result in re-ordering of search result hubs
     * @param limit The number of items to return per hub
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.PerformSearchResponse performSearch(String query, Double sectionId, Double limit) throws Exception {
        org.openapis.openapi.models.operations.PerformSearchRequest request = new org.openapis.openapi.models.operations.PerformSearchRequest(query);
        request.sectionId=sectionId;
        request.limit=limit;
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/hubs/search");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.PerformSearchRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.PerformSearchResponse res = new org.openapis.openapi.models.operations.PerformSearchResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.PerformSearchResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.PerformSearchResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Perform a voice search
     * This endpoint performs a search specifically tailored towards voice or other imprecise input which may work badly with the substring and spell-checking heuristics used by the `/hubs/search` endpoint. 
     * It uses a [Levenshtein distance](https://en.wikipedia.org/wiki/Levenshtein_distance) heuristic to search titles, and as such is much slower than the other search endpoint. 
     * Whenever possible, clients should limit the search to the appropriate type. 
     * Results, as well as their containing per-type hubs, contain a `distance` attribute which can be used to judge result quality.
     * 
     * @param query The query term
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.PerformVoiceSearchResponse performVoiceSearch(String query) throws Exception {
        return this.performVoiceSearch(query, null, null);
    }

    /**
     * Perform a voice search
     * This endpoint performs a search specifically tailored towards voice or other imprecise input which may work badly with the substring and spell-checking heuristics used by the `/hubs/search` endpoint. 
     * It uses a [Levenshtein distance](https://en.wikipedia.org/wiki/Levenshtein_distance) heuristic to search titles, and as such is much slower than the other search endpoint. 
     * Whenever possible, clients should limit the search to the appropriate type. 
     * Results, as well as their containing per-type hubs, contain a `distance` attribute which can be used to judge result quality.
     * 
     * @param query The query term
     * @param sectionId This gives context to the search, and can result in re-ordering of search result hubs
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.PerformVoiceSearchResponse performVoiceSearch(String query, Double sectionId) throws Exception {
        return this.performVoiceSearch(query, sectionId, null);
    }

    /**
     * Perform a voice search
     * This endpoint performs a search specifically tailored towards voice or other imprecise input which may work badly with the substring and spell-checking heuristics used by the `/hubs/search` endpoint. 
     * It uses a [Levenshtein distance](https://en.wikipedia.org/wiki/Levenshtein_distance) heuristic to search titles, and as such is much slower than the other search endpoint. 
     * Whenever possible, clients should limit the search to the appropriate type. 
     * Results, as well as their containing per-type hubs, contain a `distance` attribute which can be used to judge result quality.
     * 
     * @param query The query term
     * @param sectionId This gives context to the search, and can result in re-ordering of search result hubs
     * @param limit The number of items to return per hub
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.PerformVoiceSearchResponse performVoiceSearch(String query, Double sectionId, Double limit) throws Exception {
        org.openapis.openapi.models.operations.PerformVoiceSearchRequest request = new org.openapis.openapi.models.operations.PerformVoiceSearchRequest(query);
        request.sectionId=sectionId;
        request.limit=limit;
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/hubs/search/voice");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.PerformVoiceSearchRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.PerformVoiceSearchResponse res = new org.openapis.openapi.models.operations.PerformVoiceSearchResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.PerformVoiceSearchResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.PerformVoiceSearchResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Get Search Results
     * This will search the database for the string provided.
     * @param query The search query string to use
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetSearchResultsResponse getSearchResults(String query) throws Exception {
        org.openapis.openapi.models.operations.GetSearchResultsRequest request = new org.openapis.openapi.models.operations.GetSearchResultsRequest(query);
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/search");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.GetSearchResultsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.GetSearchResultsResponse res = new org.openapis.openapi.models.operations.GetSearchResultsResponse(contentType, httpRes.statusCode(), httpRes) {{
            twoHundredApplicationJsonObject = null;
            fourHundredAndOneApplicationJsonObject = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.GetSearchResultsResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.GetSearchResultsResponseBody.class);
                res.twoHundredApplicationJsonObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.GetSearchResultsSearchResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.GetSearchResultsSearchResponseBody.class);
                res.fourHundredAndOneApplicationJsonObject = out;
            }
        }

        return res;
    }
}