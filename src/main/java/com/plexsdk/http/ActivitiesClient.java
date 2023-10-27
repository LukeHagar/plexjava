package com.plexsdk.http;

import com.plexsdk.exceptions.ApiException;
import java.util.List;

public interface ActivitiesClient {
  ResponseWithHeaders<com.plexsdk.models.GetServerActivitiesResponse> getServerActivities()
    throws ApiException;
  ResponseWithHeaders<String> cancelServerActivities(String activityUUID) throws ApiException;
}
