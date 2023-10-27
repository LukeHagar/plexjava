package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.serverService.getServerCapabilities();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}
