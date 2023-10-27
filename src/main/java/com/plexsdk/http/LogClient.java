package com.plexsdk.http;

import com.plexsdk.exceptions.ApiException;
import java.util.List;

public interface LogClient {
  ResponseWithHeaders<String> logLine(Float level, String message, String source)
    throws ApiException;
  ResponseWithHeaders<String> logMultiLine() throws ApiException;
  ResponseWithHeaders<String> enablePaperTrail() throws ApiException;
}
