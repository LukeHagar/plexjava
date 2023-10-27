package 47.one0.http;

import java.util.List;

import 47.one0.exceptions.ApiException;

public interface SearchClient {

   ResponseWithHeaders<String> performSearch(String query, Float sectionId, Float limit) throws ApiException;
   ResponseWithHeaders<String> performVoiceSearch(String query, Float sectionId, Float limit) throws ApiException;
   ResponseWithHeaders<47.one0.models.GetSearchResultsResponse> getSearchResults(String query) throws ApiException;


}