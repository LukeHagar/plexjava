package com.plexsdk.http;

import com.plexsdk.exceptions.ApiException;
import java.util.List;

public interface SessionsClient {
  ResponseWithHeaders<String> getSessions() throws ApiException;
  ResponseWithHeaders<String> getSessionHistory() throws ApiException;
  ResponseWithHeaders<com.plexsdk.models.GetTranscodeSessionsResponse> getTranscodeSessions()
    throws ApiException;
  ResponseWithHeaders<String> stopTranscodeSession(String sessionKey) throws ApiException;
}
