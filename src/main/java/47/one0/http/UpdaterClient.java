package 47.one0.http;

import java.util.List;

import 47.one0.exceptions.ApiException;

public interface UpdaterClient {

   ResponseWithHeaders<String> getUpdateStatus() throws ApiException;
   ResponseWithHeaders<String> checkForUpdates(String download) throws ApiException;
   ResponseWithHeaders<String> applyUpdates(String tonight, String skip) throws ApiException;


}