package com.plexsdk.http;

import com.plexsdk.exceptions.ApiException;
import java.util.List;

public interface HubsClient {
  ResponseWithHeaders<String> getGlobalHubs(Float count, Float onlyTransient) throws ApiException;
  ResponseWithHeaders<String> getLibraryHubs(Float sectionId, Float count, Float onlyTransient)
    throws ApiException;
}
