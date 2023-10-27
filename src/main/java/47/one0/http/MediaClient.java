package 47.one0.http;

import java.util.List;

import 47.one0.exceptions.ApiException;

public interface MediaClient {

   ResponseWithHeaders<String> markPlayed(Float key) throws ApiException;
   ResponseWithHeaders<String> markUnplayed(Float key) throws ApiException;
   ResponseWithHeaders<String> updatePlayProgress(String key, Float time, String state) throws ApiException;


}