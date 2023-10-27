package 47.one0.http;

import java.util.List;

import 47.one0.exceptions.ApiException;

public interface SessionsClient {

   ResponseWithHeaders<String> getSessions() throws ApiException;
   ResponseWithHeaders<String> getSessionHistory() throws ApiException;
   ResponseWithHeaders<47.one0.models.GetTranscodeSessionsResponse> getTranscodeSessions() throws ApiException;
   ResponseWithHeaders<String> stopTranscodeSession(String sessionKey) throws ApiException;


}