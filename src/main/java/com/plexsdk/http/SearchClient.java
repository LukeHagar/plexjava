package com.plexsdk.http;

import com.plexsdk.exceptions.ApiException;
import java.util.List;

public interface SearchClient {
  ResponseWithHeaders<String> performSearch(String query, Float sectionId, Float limit)
    throws ApiException;
  ResponseWithHeaders<String> performVoiceSearch(String query, Float sectionId, Float limit)
    throws ApiException;
  ResponseWithHeaders<com.plexsdk.models.GetSearchResultsResponse> getSearchResults(String query)
    throws ApiException;
}
