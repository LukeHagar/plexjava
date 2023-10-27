package com.plexsdk.hooks.model;

/**
 * Liblab Hook interface
 */
public interface Hook {
  /**
   * Is called before the request is made to the API
   * @param request the request about to be made by the SDK
   */
  void beforeRequest(Request request);

  /**
   * Is called after the response has returned
   * @param request the request that was made by the SDK
   * @param response the response coming back from the API the SDK has called
   */
  void afterResponse(Request request, Response response);

  /**
   * Is called when an error occurs in the SDK
   * @param request the request that was made by the SDK
   * @param exception The Exception thrown
   */
  void onError(Request request, Exception exception);
}
