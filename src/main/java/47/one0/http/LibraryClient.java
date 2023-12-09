package 47.one0.http;

import java.util.List;

import 47.one0.exceptions.ApiException;

public interface LibraryClient {

   ResponseWithHeaders<String> getFileHash(String url, Float type) throws ApiException;
   ResponseWithHeaders<47.one0.models.GetRecentlyAddedResponse> getRecentlyAdded() throws ApiException;
   ResponseWithHeaders<String> getLibraries() throws ApiException;
   ResponseWithHeaders<String> getLibrary(Float sectionId, Integer includeDetails) throws ApiException;
   ResponseWithHeaders<String> deleteLibrary(Float sectionId) throws ApiException;
   ResponseWithHeaders<String> getLibraryItems(Float sectionId, Float type, String filter) throws ApiException;
   ResponseWithHeaders<String> refreshLibrary(Float sectionId) throws ApiException;
   ResponseWithHeaders<String> getLatestLibraryItems(Float sectionId, Float type, String filter) throws ApiException;
   ResponseWithHeaders<String> getCommonLibraryItems(Float sectionId, Float type, String filter) throws ApiException;
   ResponseWithHeaders<String> getMetadata(Float ratingKey) throws ApiException;
   ResponseWithHeaders<String> getMetadataChildren(Float ratingKey) throws ApiException;
   ResponseWithHeaders<47.one0.models.GetOnDeckResponse> getOnDeck() throws ApiException;


}