package 47.one0.http;

import java.util.List;

import 47.one0.exceptions.ApiException;

public interface ButlerClient {

   ResponseWithHeaders<47.one0.models.GetButlerTasksResponse> getButlerTasks() throws ApiException;
   ResponseWithHeaders<String> startAllTasks() throws ApiException;
   ResponseWithHeaders<String> stopAllTasks() throws ApiException;
   ResponseWithHeaders<String> startTask(String taskName) throws ApiException;
   ResponseWithHeaders<String> stopTask(String taskName) throws ApiException;


}