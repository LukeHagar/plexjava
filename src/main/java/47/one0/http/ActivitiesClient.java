package 47.one0.http;

import java.util.List;

import 47.one0.exceptions.ApiException;

public interface ActivitiesClient {

   ResponseWithHeaders<47.one0.models.GetServerActivitiesResponse> getServerActivities() throws ApiException;
   ResponseWithHeaders<String> cancelServerActivities(String activityUUID) throws ApiException;


}