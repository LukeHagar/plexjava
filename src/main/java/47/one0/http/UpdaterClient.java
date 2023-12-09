package 47.one0.http;

import java.util.List;

import 47.one0.exceptions.ApiException;

public interface UpdaterClient {

   ResponseWithHeaders<String> getUpdateStatus() throws ApiException;
   ResponseWithHeaders<String> checkForUpdates(Integer download) throws ApiException;
   ResponseWithHeaders<String> applyUpdates(Integer tonight, Integer skip) throws ApiException;


}