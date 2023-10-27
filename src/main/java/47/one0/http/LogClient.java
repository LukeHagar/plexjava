package 47.one0.http;

import java.util.List;

import 47.one0.exceptions.ApiException;

public interface LogClient {

   ResponseWithHeaders<String> logLine(Float level, String message, String source) throws ApiException;
   ResponseWithHeaders<String> logMultiLine() throws ApiException;
   ResponseWithHeaders<String> enablePaperTrail() throws ApiException;


}