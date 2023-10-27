package com.plexsdk.http;

import com.plexsdk.exceptions.ApiException;
import java.util.List;

public interface SecurityClient {
  ResponseWithHeaders<String> getTransientToken(String type, String scope) throws ApiException;
  ResponseWithHeaders<String> getSourceConnectionInformation(String source) throws ApiException;
}
