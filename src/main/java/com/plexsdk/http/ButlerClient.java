package com.plexsdk.http;

import com.plexsdk.exceptions.ApiException;
import java.util.List;

public interface ButlerClient {
  ResponseWithHeaders<com.plexsdk.models.GetButlerTasksResponse> getButlerTasks()
    throws ApiException;
  ResponseWithHeaders<String> startAllTasks() throws ApiException;
  ResponseWithHeaders<String> stopAllTasks() throws ApiException;
  ResponseWithHeaders<String> startTask(String taskName) throws ApiException;
  ResponseWithHeaders<String> stopTask(String taskName) throws ApiException;
}
