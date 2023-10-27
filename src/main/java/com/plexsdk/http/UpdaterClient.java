package com.plexsdk.http;

import com.plexsdk.exceptions.ApiException;
import java.util.List;

public interface UpdaterClient {
  ResponseWithHeaders<String> getUpdateStatus() throws ApiException;
  ResponseWithHeaders<String> checkForUpdates(String download) throws ApiException;
  ResponseWithHeaders<String> applyUpdates(String tonight, String skip) throws ApiException;
}
