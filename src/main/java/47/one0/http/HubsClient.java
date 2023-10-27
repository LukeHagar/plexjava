package 47.one0.http;

import java.util.List;

import 47.one0.exceptions.ApiException;

public interface HubsClient {

   ResponseWithHeaders<String> getGlobalHubs(Float count, Float onlyTransient) throws ApiException;
   ResponseWithHeaders<String> getLibraryHubs(Float sectionId, Float count, Float onlyTransient) throws ApiException;


}