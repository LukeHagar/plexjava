<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetServerCapabilitiesBadRequest;
import dev.plexapi.sdk.models.errors.GetServerCapabilitiesUnauthorized;
import dev.plexapi.sdk.models.operations.GetServerCapabilitiesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetServerCapabilitiesBadRequest, GetServerCapabilitiesUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        GetServerCapabilitiesResponse res = sdk.server().getServerCapabilities()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->