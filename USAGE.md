<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import lukehagar.plexapi.plexapi.PlexAPI;
import lukehagar.plexapi.plexapi.models.operations.GetServerCapabilitiesResponse;
import lukehagar.plexapi.plexapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .setSecurity(new Security(
                "<value>"){{
                    accessToken = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            lukehagar.plexapi.plexapi.models.operations.GetServerCapabilitiesResponse res = sdk.server.getServerCapabilities();

            if (res.twoHundredApplicationJsonObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->