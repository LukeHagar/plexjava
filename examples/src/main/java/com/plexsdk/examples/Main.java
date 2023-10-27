package com.plexsdk.examples;

import com.plexsdk.PlexSDK;
import com.plexsdk.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(
      System.getenv("PLEXSDK_API_KEY"),
      System.getenv("PLEXSDK_API_KEY_HEADER")
    );
    try {
      Object response = client.serverService.getServerCapabilities();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}
