package com.plexsdk.http;

import com.plexsdk.exceptions.ApiException;
import java.util.List;

public interface MediaClient {
  ResponseWithHeaders<String> markPlayed(Float key) throws ApiException;
  ResponseWithHeaders<String> markUnplayed(Float key) throws ApiException;
  ResponseWithHeaders<String> updatePlayProgress(String key, Float time, String state)
    throws ApiException;
}
