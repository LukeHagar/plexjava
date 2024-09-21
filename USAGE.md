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
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
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