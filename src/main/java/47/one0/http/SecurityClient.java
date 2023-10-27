package 47.one0.http;

import java.util.List;

import 47.one0.exceptions.ApiException;

public interface SecurityClient {

   ResponseWithHeaders<String> getTransientToken(String type, String scope) throws ApiException;
   ResponseWithHeaders<String> getSourceConnectionInformation(String source) throws ApiException;


}